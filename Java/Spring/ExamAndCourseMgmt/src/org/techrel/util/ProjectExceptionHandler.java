package org.techrel.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.techrel.exception.RegisterException;

@ControllerAdvice
public class ProjectExceptionHandler {

	@ExceptionHandler(value={RegisterException.class})
	public void registerExceptionHandler(Exception ex){
		System.err.println("Something went wront while registration");
		ex.printStackTrace();
	}
	
}
