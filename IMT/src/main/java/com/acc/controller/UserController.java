package com.acc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.model.UserRegister;
@Controller
public class UserController {
	@RequestMapping(value="/urget")
	public String showUserRegistrationPage(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
		m.addAttribute("msg","i am from UserRegister Controller");
		System.out.println( userRegistration.getFirstName());
		return "UserRegistration";
	}
     @RequestMapping(value="/urpost",method=RequestMethod.POST)
     public String postSubmit(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
    	 m.addAttribute("msg","i am from UserRegister Controller");
 		System.out.println( userRegistration.getFirstName());
 		return "UserRegistration";
     }
}
