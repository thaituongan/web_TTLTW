package model;

import java.io.Serializable;

public class User extends AbsModel implements IModel  {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int roles;
	public User(String username, String password, int roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoles() {
		return roles;
	}
	public void setRoles(int roles) {
		this.roles = roles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String beforeData() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String afterData() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}