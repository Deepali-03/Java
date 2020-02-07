package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 *  If following annotations used on any class then, spring treats that java
 *  class as a bean or spring component class. create object for
 *  those class and also manages life cycle of object. 
 *  @Controller, @RestController, @Service, @Repository, @Component
 *  
*/
@Controller
public class WelcomeController {

	/*
	 * it is use to mapped user request with method and get view name
	 * as a return value. 
	*/
	@RequestMapping(value={"/","/mylogin"},method=RequestMethod.GET)
	public String goToLoginPage(){
		System.out.println("Hello I am In welcome controller..");
		return "Login";
	}
	
}












