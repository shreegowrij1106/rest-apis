package com.rest.api.service3;

public class ValidationErrorMsgModel {

	private String invalidValue;
	 
	private String message;
	 
	private String messageTemplate;
	 
	private String path;

	public ValidationErrorMsgModel(String invalidValue, String message, String messageTemplate, String path) {
		super();
		this.invalidValue = invalidValue;
		this.message = message;
		this.messageTemplate = messageTemplate;
		this.path = path;
	}

	public ValidationErrorMsgModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(String invalidValue) {
		this.invalidValue = invalidValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageTemplate() {
		return messageTemplate;
	}

	public void setMessageTemplate(String messageTemplate) {
		this.messageTemplate = messageTemplate;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "ValidationErrorMsgModel [invalidValue=" + invalidValue + ", message=" + message + ", messageTemplate="
				+ messageTemplate + ", path=" + path + "]";
	}
	
	
}
