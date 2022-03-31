package sample03;

import java.util.Date;
import java.util.Properties;

public class UserVo {
	private String userName;
	private Properties per;
	private Date my_date;
	
	public UserVo() {
		super();
//		my_date = new Date();
	}

	public UserVo(String userName) {
		super();
		this.userName = userName;
	}

	public Properties getPer() {
		return per;
	}

	public void setPer(Properties per) {
		this.per = per;
	}

	public Date getMy_date() {
		return my_date;
	}

	public void setMy_date(Date my_date) {
		this.my_date = my_date;
	}

	public String getUserName() {
		return userName;
	}
	
}
