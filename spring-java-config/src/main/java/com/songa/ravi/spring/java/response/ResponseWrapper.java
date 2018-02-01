package com.songa.ravi.spring.java.response;

public class ResponseWrapper {
	
	private boolean ok;
	
	private String error;
	
	private String payload;

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	

}
