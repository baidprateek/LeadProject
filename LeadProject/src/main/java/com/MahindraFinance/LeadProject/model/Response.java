package com.MahindraFinance.LeadProject.model;

import java.util.List;

public class Response {

	private String status;
	private List data;
	private ErrorResponse errorResponse;
	

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
