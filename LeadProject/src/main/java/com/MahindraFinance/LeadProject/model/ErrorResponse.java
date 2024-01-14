package com.MahindraFinance.LeadProject.model;

import java.util.List;


public class ErrorResponse {

	private String code;
	private List messages;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List getMessages() {
		return messages;
	}
	public void setMessages(List messages) {
		this.messages = messages;
	}
	
	
}
