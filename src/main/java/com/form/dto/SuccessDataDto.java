package com.form.dto;

public class SuccessDataDto {
	private String message;

	public SuccessDataDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuccessDataDto(String message, String msgKey, Object data) {
		super();
		this.message = message;
		this.msgKey = msgKey;
		this.data = data;
	}

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private String msgKey;

	private Object data;
}
