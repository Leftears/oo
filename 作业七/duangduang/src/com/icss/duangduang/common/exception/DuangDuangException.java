package com.icss.duangduang.common.exception;

public class DuangDuangException extends RuntimeException{
	private String message;
	public DuangDuangException(){
		
	}
	
	public DuangDuangException(String message){
		super(message);
		message=message;
	}

}
