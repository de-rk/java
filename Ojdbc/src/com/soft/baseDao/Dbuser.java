package com.soft.baseDao;

import java.sql.Date;

public class Dbuser {
	private int userid;
	private String uname;
	private String password;
	private String hiredate;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String string) {
		this.hiredate = string;
	}
	
	
}
