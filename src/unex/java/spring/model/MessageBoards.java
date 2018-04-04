package unex.java.spring.model;

import java.util.ArrayList;

public class MessageBoards {

private static ArrayList<MessageBoard> messageBoards = new ArrayList<>();
	
	static {
		messageBoards.add(new MessageBoard(Users.getUser("ntunas"), "hi"));
		messageBoards.add(new MessageBoard(Users.getUser("ntunas"), "How are you?"));
		messageBoards.add(new MessageBoard(Users.getUser("aweiss"), "Fine, thank you! You?"));
		messageBoards.add(new MessageBoard(Users.getUser("ntunas"), "I'm fine too. Thank you!"));
		}
	
	public static ArrayList<MessageBoard> getMessageBoards() {
		return messageBoards;
	}

	public static void setMessageBoards(ArrayList<MessageBoard> messageBoards) {
		MessageBoards.messageBoards = messageBoards;
	}
	
	public static void setMessageBoard(String userName, String message) {
		messageBoards.add(new MessageBoard(Users.getUser(userName), message));
	}
	
}
