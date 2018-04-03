package com.songa.ravi.spring.java.response;

public class ResponseWrapper {
	
	private Boolean ok;
	
	private Object error;
	
	private Object payload;

	public Boolean isOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}


}
