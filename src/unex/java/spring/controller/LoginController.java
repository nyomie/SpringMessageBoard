package unex.java.spring.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import unex.java.spring.model.User;
import unex.java.spring.model.Users;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	public LoginController() {
    
	}
	
	@RequestMapping(value="/login", params={"username","password"}, method=RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
		logger.info("login");
		if (Users.getUsers().containsKey(username)) {
			User user = Users.getUser(username);
			if (user.checkPassword(password)) {
				session.setAttribute("user", user);
			} else {
				model.addAttribute("error", "Invalid Password");
				logger.error("Invalid password");
				return "login";
			}
		} else {
			model.addAttribute("error", "Invalid Username");
			logger.error("Invalid username");
			return "login";
		}		
		return "welcome";
	}
	
    @RequestMapping(value="/register", params={"username","password", "fullname"}, method=RequestMethod.POST)
    public String register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("fullname") String fullname, 
    		Model model, HttpSession session) {
		logger.info("register");

		if (Users.getUsers().containsKey(username)) {
			model.addAttribute("error", "Username exist. Please login.");
			logger.error("Username exist");
			return "login";
		} else {
			Users.setUser(username, password, fullname);
			User user = Users.getUser(username);
			session.setAttribute("user", user);
		}
		return "welcome";
	}
	
}
