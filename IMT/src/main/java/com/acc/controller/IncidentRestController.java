
package com.acc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acc.model.Incident;
import com.acc.services.DataServices;

@Controller
@RequestMapping("/Incident")
public class IncidentRestController {
	@Autowired
	DataServices dataServices;

	public DataServices getDataServices() {
		return dataServices;
	}

	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}

	static final Logger logger = Logger.getLogger(RestController.class);

	/* Submit form in Spring Restful Services */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addIncident(@RequestBody Incident incident) {
		// System.out.println(userregister.getFirstName());
		try {
			if (incident.getIncid() == null) {
				Integer incid = dataServices.IncidentaddEntity(incident);
				return new Status(1, "Incident added Successfully ! Newly Generated INC ID "

						+ incid);

			} else {
				dataServices.updateEntity(incident);
				return new Status(1, "Incident Updated Successfully !");

			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(0, e.toString());
		}
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody Status updateIncident(@RequestBody Incident incident) {
	// System.out.println(userregister.getFirstName());
	try {

	boolean isUpdated = dataServices.updateEntity(incident);
	if (isUpdated)
	return new Status(1, "Incident Updated Successfully !");
	else {
	return new Status(0, "Incident Updation Failed ! NO id exist for Update");

	}
	} catch (Exception e) {
	e.printStackTrace();
	return new Status(0,"Incident Updation Failed !"+ e.getMessage());
	}

	}

	/* Getting List of objects in Json format in Spring Restful Services */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Incident> getIncident() {

		List<Incident> incidentList = null;

		try {
			incidentList = dataServices.IncidentgetEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return incidentList;
	}

	/* Ger a single objct in Json form in Spring Rest Services */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Incident getIncident(@PathVariable("id") int id) {

	Incident incident = null;

	try {
	incident = dataServices.IncidentgetEntityById(id);

	} catch (Exception e) {

	e.printStackTrace();
	return new Incident();
	}

	return incident;
}
	// Delete an object from DB in Spring Restful Services
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Status deleteIncident(@PathVariable("id") int id) {

		try {

			 dataServices.deleteEntity(id);
			return new Status(1, "UserRegister deleted Successfully !");
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(0, "UserRegister Deletion Failed Reason: " +

					e.getMessage());

		}

	}

}