package com.acc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.model.UserRegister;
import com.acc.services.DataServices;
@Controller
public class UserController {
	
	
	@Autowired
	DataServices dataServices;

	public DataServices getDataServices() {
		return dataServices;
	}
	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}
	
	
	@RequestMapping(value="/urget")
	public String showUserRegistrationPage(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
		m.addAttribute("msg","i am from UserRegister Controller");
		//System.out.println( userRegistration.getFirstName());
		
		return "UserRegistration";
	}
     @RequestMapping(value="/urpost",method=RequestMethod.POST)
     public String postSubmit(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
    	 m.addAttribute("msg","i am from UserRegister Controller");
 		try {
			dataServices.addEntity(userRegistration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return "UserRegistration";
     }
}
