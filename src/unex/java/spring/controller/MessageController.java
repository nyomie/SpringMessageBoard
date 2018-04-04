package unex.java.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import unex.java.spring.model.MessageBoard;
import unex.java.spring.model.MessageBoards;
import unex.java.spring.model.User;

@Controller
public class MessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@ModelAttribute("messages")
	public ArrayList<MessageBoard> getMessages(){
		return MessageBoards.getMessageBoards();
	}
	
	@RequestMapping("/viewmessages")
	public String viewMessages() {
		logger.info("Viewing messages");
		
		return "messageView";
	}
	
	@RequestMapping(value="/addmessage",params={"message"}, method=RequestMethod.POST)
	public String addMessages(HttpSession session,@RequestParam("message") String message) {
		logger.info("Adding messages");
		
		User u = (User) session.getAttribute("user");
		MessageBoards.setMessageBoard(u.getUsername(), message);
		return "messageView";
	}
	
}
