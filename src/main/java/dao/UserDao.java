package dao;
 
import pojo.User;
 
public interface UserDao {
	public boolean register(User user);
	public User login(User user);
}
