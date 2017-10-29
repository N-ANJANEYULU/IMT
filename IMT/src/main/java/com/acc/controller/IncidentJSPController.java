package com.acc.controller;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.model.IncHistLog;
import com.acc.model.IncidentLog;
import com.acc.model.SearchCriteria;
import com.acc.model.UserInc;
import com.acc.services.DataServices;

@Controller
public class IncidentJSPController {

	@Autowired
	DataServices dataServices;
	
	static final Logger logger = Logger.getLogger(IncidentJSPController.class);
	public DataServices getDataServices() {
		return dataServices;
	}

	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}

	@RequestMapping(value = "/incget")
	public String incdentPopulation(@ModelAttribute("incRegistration") IncidentLog incRegistration, ModelMap m, HttpSession session) {
		logger.debug("i am from Incdent Controller");
		m.addAttribute("msg", "i am from Incdent Controller");
		incRegistration.setUserInc((UserInc) session.getAttribute("loginUser"));

		return "Incident";

	}

	@RequestMapping(value = "/incget/{id}")
	public String getIncidentById(@PathVariable("id") Integer id, ModelMap m, HttpSession session) {
		System.out.println("==================incident.showById()=====================" + id);
		m.addAttribute("msg", "i am from UserRegister Controller");
		if (id != null) {

			try {
				IncidentLog incident = dataServices.getIncidentById(id);
				m.put("incRegistration", incident);
				session.setAttribute("incRegistration",incident);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// System.out.println( userRegistration.getFirstName());

		return "Incident";
	}
	
	
	@RequestMapping(value = "/inchget/{id}", method= RequestMethod.GET)
	public String getIncidentHistory(@PathVariable("id") Integer id, ModelMap m, HttpSession session) {
		System.out.println("==================i am from Incident History  Controller=====================" + id);
		m.addAttribute("msg", "i am from Incident History  Controller");
		if (id != null) {

			try {
				IncidentLog incident = dataServices.getIncidentById(id);
				m.put("incRegistration", incident);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// System.out.println( userRegistration.getFirstName());

		return "IncidentListHistory";
	}

	@RequestMapping(value = "/incpost", method = RequestMethod.POST)
	public String addorUpdateIncident(@ModelAttribute("incRegistration") IncidentLog incRegistration, ModelMap m, HttpSession session) {
		m.addAttribute("msg", "i am from Incident Controller");
		try {
			System.out.println("Post Method");
			incRegistration.setCreateDt(new Date(System.currentTimeMillis()));

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return "forward:/inchistget";
	}

	
	@RequestMapping(value = "/inclist")
	public String getIncList(ModelMap m, HttpSession session) {

		try {
			session.removeAttribute("incRegistration");

			m.addAttribute("incList", dataServices.getIncidentList());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "IncidentList";
	}
	
	
	@RequestMapping(value = "/search")
	public String getIncListBySerach( @ModelAttribute("searchParam") SearchCriteria search, ModelMap m, HttpSession session) {

		try {
			
			session.removeAttribute("incRegistration");
			m.addAttribute("incList", dataServices.getIncidentList(search));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "IncidentList";
	}
	

	@RequestMapping(value = "/inchistget")
	public String incdenthistPopulation(@ModelAttribute("inchRegistration") IncHistLog incHistory, ModelMap m, HttpSession session) {
		
		m.addAttribute("msg", "i am from Incdent Histroy Controller");
		IncidentLog incRegistration = (IncidentLog) session.getAttribute("incRegistration");
		if(incRegistration!=null && incRegistration.getIncHistLogs()!=null && !incRegistration.getIncHistLogs().isEmpty()){
			System.out.println("I AM HISTORY GET SIZE ----------------------"  + incRegistration.getIncHistLogs().size());
			m.addAttribute("inchRegistration",incRegistration.getIncHistLogs().get(0));
		}
		System.out.println("Incident Hisoty..." + incHistory.getApplication());
		//incHistory.setIncidentLog(incRegistration);
		UserInc loginUser = (UserInc)session.getAttribute("loginUser");
		if(incHistory.getRequestedUser()==null){
			
		incHistory.setRequestedUser(loginUser.getUserName());
		incHistory.setRequestedGroup(loginUser.getUserGroup());
		}
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
	public String addorUpdateIncidentHistory(@ModelAttribute("inchRegistration") IncHistLog inchRegistration, ModelMap m, HttpSession session) {
		m.addAttribute("msg", "i am from UserRegister Controller");
		try {
			System.out.println("Post Method");
			IncidentLog incRegistration = (IncidentLog) session.getAttribute("incRegistration");
			if(incRegistration==null){
				incRegistration = new IncidentLog();
			}
			incRegistration.setUpdateDt(new Date(System.currentTimeMillis()));
			
			if(incRegistration.getIncHistLogs()==null){
				incRegistration.setIncHistLogs(new ArrayList<IncHistLog>());
			}
			inchRegistration.setCreateDt(new Date(System.currentTimeMillis()));
				incRegistration.addIncHistLog(inchRegistration);
				
		
			if (incRegistration.getIncId() == null) {
				UserInc loginUser = (UserInc)session.getAttribute("loginUser");
				incRegistration.setUserInc(loginUser);
				incRegistration.setCreateDt(new Date(System.currentTimeMillis()));
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
		return "forward:/inclist";
	}

	/*@RequestMapping(value = "/inchistput", method = RequestMethod.PUT)
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
	}*/

}
