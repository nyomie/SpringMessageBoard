package unex.java.spring.model;

import java.util.HashMap;

public class Users {
private static HashMap <String, User> users = new HashMap<>();
	
	static {
		users.put("ntunas", new User("ntunas","1234","Nina Tunas"));
		users.put("aweiss", new User("aweiss","2345","Andy Weiss"));
	}
	
	public static HashMap<String, User> getUsers() {
		return users;
	}

	public static void setUsers(HashMap<String, User> users) {
		Users.users = users;
	}
	
	public static User getUser(String userName) {
		return users.get(userName);
	}
	
	public static void setUser(String userName, String password, String fullName) {
		users.put(userName, new User(userName, password, fullName));
	}
}
