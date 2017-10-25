package com.acc.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.model.UserInc;
import com.acc.services.DataServices;

@Controller
public class UserJSPController {

	@Autowired
	DataServices dataServices;

	public DataServices getDataServices() {
		return dataServices;
	}

	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}

	@RequestMapping(value = "/urget")
	public String showUserRegistrationPage(@ModelAttribute("userRegistration") UserInc userRegistration,
			ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		/*
		 * if(id!=null){
		 * 
		 * try { userRegistration = dataServices.getEntityById(id); } catch
		 * (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 */
		// System.out.println( userRegistration.getFirstName());

		return "UserRegistration";
	}

	@RequestMapping(value = "/urget/{id}")
	public String getUserById(@PathVariable("id") Integer id, ModelMap m) {
		System.out.println("==================UserController.showById()========================" + id);
		m.addAttribute("msg", "i am from UserRegister Controller");
		if (id != null) {

			try {
				m.put("userRegistration", dataServices.getUserById(id));

				// System.out.println("User.. " +
				// userRegistration.getUserName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// System.out.println( userRegistration.getFirstName());

		return "UserRegistration";
	}

	@RequestMapping(value = "/urpost", method = RequestMethod.POST)
	public String addorUpdateUser(@ModelAttribute("userRegistration") UserInc userInc, ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			
			userInc.setCreateDt(new Date(System.currentTimeMillis()));
			userInc.setUpdateDt(new Date(System.currentTimeMillis()));

			if (userInc.getUserId() == null) {
				Integer userId = dataServices.addUser(userInc);
				System.out.println("UserRegister added Successfully ! Newly Generated User ID " + userId);
			} else {
				dataServices.updateUser(userInc);
				System.out.println("UserRegister Updated Successfully !");

			}
			// dataServices.addEntity(userRegistration);

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return "UserRegistration";
	}

	@RequestMapping(value = "/urput", method = RequestMethod.PUT)
	public String updateUser(@ModelAttribute("userRegistration") UserInc userInc, ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			userInc.setIsaccessGranted("No");
			userInc.setCreateDt(new Date(System.currentTimeMillis()));
			userInc.setUpdateDt(new Date(System.currentTimeMillis()));
			dataServices.updateUser(userInc);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "UserRegistration";
	}

	@RequestMapping(value = "/urlist")
	public String getUserList(ModelMap m) {

		try {

			m.addAttribute("userregisterList", dataServices.getUserList());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "ListUsers";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("userRegistration") UserInc userInc, ModelMap m, HttpSession session) {
		System.out.println(
				"==================UserController.showById()========================" + userInc.getUserName());
		UserInc userEntity = null;
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {

			userEntity = dataServices.getLogin(userInc.getUserName(), userInc.getPassword());
System.out.println("user Name >..." +userEntity.getFirstName());
			session.setAttribute("loginUser", userEntity);

			// System.out.println("User.. " + userRegistration.getUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println( userRegistration.getFirstName());
		if (userEntity == null) {
			return "UserRegistration";
		} else {
			return "Dashboard";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("userRegistration") UserInc userRegistration) {
		return "Login";

	}

}
