package org.kafka.consumer.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String emailId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append("]");
		return builder.toString();
	}
	
	

}
