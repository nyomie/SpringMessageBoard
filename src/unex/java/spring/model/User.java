package unex.java.spring.model;

public class User {
	private String username;
	private String password;
	private String fullname;
	
	public User() {}
	
	public User(String username, String password, String fullname) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
}
