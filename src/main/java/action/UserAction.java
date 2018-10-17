package action;
 
import pojo.User;
import service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private User user = new User();
	public User getModel() {
		return user;
	}
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public String register(){
		boolean register = userService.register(user);
		if(register){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	public String login(){
		User u = null;
		u = userService.login(user);
		if(u!=null){
			ActionContext.getContext().getSession().put("LoginUser", u.getName());
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
}
