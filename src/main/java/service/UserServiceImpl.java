package service;
 
import dao.UserDao;
import pojo.User;
 
public class UserServiceImpl implements UserService{
    private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
 
	
	public boolean register(User user) {
		return userDao.register(user);
	}
	public User login(User user) {
		return userDao.login(user);
	}
	
}
