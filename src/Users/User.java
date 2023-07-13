package Users;

import java.util.HashMap;
import java.util.Map;

public class User {
	private String userid;
	private String password;
	public static Map<String, String> mp = new HashMap<>();
	public User(String userid,String password) {
		this.setUserid(userid);
		this.setPassword(password);
		
	}
	void addUser(String userid,String password) {
		this.mp.put(userid,password);
	}
	public boolean IsAuthenticated(String userid,String password) {
//		if(this.userid.equals(userid) && this.password.equals(password))
//			return true;
		return false;
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
