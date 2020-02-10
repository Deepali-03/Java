package org.techrel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techrel.dto.RegisterBean;
import org.techrel.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService; 
	
	@RequestMapping(value="/registeruser",method=RequestMethod.GET)
	public String goToRegisterPage(){
		return "Register";
	}
	
	@RequestMapping(value="/registerme",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute RegisterBean registerBean,Model model){
		int result=registerService.registerUser(registerBean);
		if(result>0){
			model.addAttribute("code","200");
		}else{
			model.addAttribute("code","500");
		}
		return "Register";
	}
	
}













