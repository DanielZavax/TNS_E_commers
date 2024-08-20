package com.tns.onlineshopping.entites;

public abstract class User {
	private  int userId;
	private String username;
	private String email;
	
	public User(int userId, String Username, String email) {
		this.userId=userId;
		this.username = username;
		this.email =email;
		}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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
   public String toString() {
	   return "User [userId=" + userId +", username=" + username +", email=" + email + "]";
   }
}
