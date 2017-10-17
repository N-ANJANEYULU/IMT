package com.acc.controller;

import java.sql.Date;
import java.util.List;

import javax.persistence.metamodel.StaticMetamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String showUserRegistrationPage(@ModelAttribute("userRegistration") UserRegister userRegistration,ModelMap m){
		m.addAttribute("msg","i am from UserRegister Controller");
		/*if(id!=null){
			
			try {
				userRegistration = dataServices.getEntityById(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		//System.out.println( userRegistration.getFirstName());
		
		return "UserRegistration";
	}
	
	@RequestMapping(value="/urget/{id}")
	public String showById(@PathVariable("id") Integer id,ModelMap m){
		System.out.println("==================UserController.showById()========================" + id);
		m.addAttribute("msg","i am from UserRegister Controller");
		if(id!=null){
			
			try {
				m.put("userRegistration",dataServices.getEntityById(id));
				
				//System.out.println("User.. " + userRegistration.getUserName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//System.out.println( userRegistration.getFirstName());
		
		return "UserRegistration";
	}
	
	
	
	
     @RequestMapping(value="/urpost",method=RequestMethod.POST)
     public String postSubmit(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
    	 m.addAttribute("msg","i am from UserRegister Controller");
 		try {
 			System.out.println("Post Method");
 			userRegistration.setIsAccessGranted("No");
 			userRegistration.setCreateDt(new Date(System.currentTimeMillis()));
 			userRegistration.setUpdateDt(new Date(System.currentTimeMillis()));
 			
 			
 			if(userRegistration.getUserid()==null){
 				Integer userId = dataServices.addEntity(userRegistration);
 				System.out.println("UserRegister added Successfully ! Newly Generated User ID " + userId);
 				} else {
 					 dataServices.updateEntity(userRegistration);
 					 System.out.println("UserRegister Updated Successfully !");
 					
 					
 				}
 			//dataServices.addEntity(userRegistration);
 			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
 		return "UserRegistration";
     }
     
     @RequestMapping(value="/urput",method=RequestMethod.PUT)
     public String putSubmit(@ModelAttribute("userRegistration")UserRegister userRegistration,ModelMap m){
    	 m.addAttribute("msg","i am from UserRegister Controller");
 		try {
 			System.out.println("Post Method");
 			userRegistration.setIsAccessGranted("No");
 			userRegistration.setCreateDt(new Date(System.currentTimeMillis()));
 			userRegistration.setUpdateDt(new Date(System.currentTimeMillis()));
 			dataServices.updateEntity(userRegistration);
 			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return "UserRegistration";
     }
    
     
     @RequestMapping(value="/urlist")
     public  String getUserRegister(ModelMap m) {


 		try {
 			
 			
 				m.addAttribute("userregisterList", dataServices.getEntityList());
 			

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return "ListUsers";
 	}
     
    /* @ModelAttribute("userRegistration")
     public UserRegister getUR()
     {
    	return  new UserRegister();
     }*/
     
}
