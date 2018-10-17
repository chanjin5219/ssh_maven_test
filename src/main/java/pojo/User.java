package pojo;

public class User {
	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User()
	{
		
	}
	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.username = name;
		this.password = password;
	}
	
	
}
