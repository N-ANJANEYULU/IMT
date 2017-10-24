package com.acc.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.model.IncHistLog;
import com.acc.model.IncidentLog;
import com.acc.model.UserInc;
import com.acc.services.DataServices;

@Controller
public class IncidentJSPController {

	@Autowired
	DataServices dataServices;

	public DataServices getDataServices() {
		return dataServices;
	}

	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}

	@RequestMapping(value = "/incget")
	public String incdentPopulation(@ModelAttribute("incRegistration") IncidentLog incRegistration, ModelMap m) {
		m.addAttribute("msg", "i am from Incdent Controller");

		return "Incident";

	}

	@RequestMapping(value = "/incget/{id}")
	public String getUserById(@PathVariable("id") Integer id, ModelMap m) {
		System.out.println("==================incident.showById()========================" + id);
		m.addAttribute("msg", "i am from UserRegister Controller");
		if (id != null) {

			try {
				m.put("incidentRegister", dataServices.getIncidentById(id));

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

	@RequestMapping(value = "/incpost", method = RequestMethod.POST)
	public String addorUpdateUser(@ModelAttribute("incRegistration") IncidentLog incRegistration, ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			incRegistration.setCreateDt(new Date(System.currentTimeMillis()));
			incRegistration.setUpdateDt(new Date(System.currentTimeMillis()));

			if (incRegistration.getIncId() == null) {
				Integer userId = dataServices.addIncident(incRegistration);
				System.out.println("UserRegister added Successfully ! Newly Generated User ID " + userId);
			} else {
				dataServices.updateIncident(incRegistration);
				System.out.println("UserRegister Updated Successfully !");

			}
			// dataServices.addEntity(userRegistration);

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return "UserRegistration";
	}

	/*
	 * @RequestMapping(value = "/incput", method = RequestMethod.PUT) public
	 * String updateUser(@ModelAttribute("userRegistration") UserRegister
	 * userRegistration, ModelMap m) { m.addAttribute("msg",
	 * "i am from UserRegister Controller"); try {
	 * System.out.println("Post Method");
	 * userRegistration.setIsAccessGranted("No");
	 * userRegistration.setCreateDt(new Date(System.currentTimeMillis()));
	 * userRegistration.setUpdateDt(new Date(System.currentTimeMillis()));
	 * dataServices.updateUser(userRegistration);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return "Incident"; }
	 */
	@RequestMapping(value = "/inclist")
	public String getIncList(ModelMap m) {

		try {

			m.addAttribute("incList", dataServices.getIncidentList());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "IncidentList";
	}

	@RequestMapping(value = "/inchistget")
	public String incdenthistPopulation(@ModelAttribute("inchRegistration") IncHistLog incHistory, ModelMap m) {
		m.addAttribute("msg", "i am from Incdent Controller");

		return "Incidenthist";

	}

	@RequestMapping(value = "/inchistget/{id}")
	public String getIncidentById(@PathVariable("id") Integer id, ModelMap m) {
		System.out.println("==================incidenthist.showById()========================" + id);
		m.addAttribute("msg", "i am from UserRegister Controller");
		if (id != null) {

			try {
				m.put("incidentRegister", dataServices.getIncidentById(id));

				// System.out.println("User.. " +
				// userRegistration.getUserName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// System.out.println( userRegistration.getFirstName());

		return "Incidenthist";
	}

	@RequestMapping(value = "/inchistlist")
	public String getInchistList(ModelMap m) {

		try {

			m.addAttribute("incList", dataServices.getIncidentList());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Incidenthistlist";
	}

	@RequestMapping(value = "/inchistpost", method = RequestMethod.POST)
	public String addorUpdateIncident(@ModelAttribute("incRegistration") IncidentLog incRegistration, ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			incRegistration.setCreateDt(new Date(System.currentTimeMillis()));
			incRegistration.setUpdateDt(new Date(System.currentTimeMillis()));

			if (incRegistration.getIncId() == null) {
				Integer userId = dataServices.addIncident(incRegistration);
				System.out.println("UserRegister added Successfully ! Newly Generated User ID " + userId);
			} else {
				dataServices.updateIncident(incRegistration);
				System.out.println("UserRegister Updated Successfully !");

			}
			// dataServices.addEntity(userRegistration);

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return "Incidenthist";
	}

	@RequestMapping(value = "/inchistput", method = RequestMethod.PUT)
	public String updateIncident(@ModelAttribute("userRegistration") UserInc userRegistration, ModelMap m) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			userRegistration.setCreateDt(new Date(System.currentTimeMillis()));
			userRegistration.setUpdateDt(new Date(System.currentTimeMillis()));
			dataServices.updateUser(userRegistration);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Incidenthist";
	}

}