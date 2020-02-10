package org.techrel.exception;

public class RegisterException extends Exception{
	
	private String msg;
	
	public RegisterException(String msg){
		super(msg);
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
	

}
