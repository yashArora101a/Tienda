package com.tienda.bean;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
public class User {
	
	private int userId;
	private String username,email;
	//private String password;
	//private String mobile;
	private Set<Link> links;
	public Set<Link> getLinks() {
		return links;
	}
	public void setLinks(Set<Link> links) {
		this.links = links;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}
	public User(int userId, String username, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
	}
	/*public User(int userId, String username, String email,String password,String mobile) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
	}*/
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email="
				+ email +
				//",password="+password+
				//",mobile="+mobile+
				"]";
	}
	
}
