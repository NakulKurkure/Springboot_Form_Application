package com.form.exception;

public class ResourceNotFound {
	public ResourceNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFound(String message, String msgKey) {
		super();
		this.message = message;
		this.msgKey = msgKey;
	}

	private String message;

	private String msgKey;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMsgKey() {
		return msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

}
