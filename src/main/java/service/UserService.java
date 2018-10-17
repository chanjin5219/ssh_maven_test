package service;
 
import pojo.User;
 
public interface UserService {
	public boolean register(User user);
	public User login(User user);
}
