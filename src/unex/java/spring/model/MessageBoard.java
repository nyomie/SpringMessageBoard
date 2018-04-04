package unex.java.spring.model;


public class MessageBoard {

	private User user;
	private String message;

	public MessageBoard() {}
	
	public MessageBoard(User user, String message) {
		super();
		this.user = user;
		this.message = message;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return user.getFullname() + ": " + message;
	}
	
}
