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

import com.acc.model.IncHistLog;
import com.acc.services.DataServices;

@Controller
@RequestMapping("/inchistlog")
public class IncHistRestController {

	@Autowired
	DataServices dataServices;

	public DataServices getDataServices() {
		return dataServices;
	}

	public void setDataServices(DataServices dataServices) {
		this.dataServices = dataServices;
	}

	static final Logger logger = Logger.getLogger(IncHistRestController.class);

	/* Submit form in Spring Restful Services */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addIncidenthist(@RequestBody IncHistLog incHistLog) {
		// System.out.println(userregister.getFirstName());
		try {
			if (incHistLog.getIncHistId() == null) {
				Integer incid = dataServices.addIncidenthist(incHistLog);
				return new Status(1, "Incident added Successfully ! Newly Generated INC ID "

						+ incid);

			} else {
				dataServices.updateIncidenthist(incHistLog);
				return new Status(1, "IncHistLog Updated Successfully !");

			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(0, e.toString());
		}
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status updateIncidenthist(@RequestBody IncHistLog incHistLog) {
		// System.out.println(incHistLog.getFirstName());
		try {

			boolean isUpdated = dataServices.updateIncidenthist(incHistLog);
			if (isUpdated)
				return new Status(1, "IncHistLog Updated Successfully !");
			else {
				return new Status(0, "IncHistLog Updation Failed ! NO id exist for Update");

			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Status(0, "IncHistLog Updation Failed !" + e.getMessage());
		}

	}

	/* Getting List of objects in Json format in Spring Restful Services */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<IncHistLog> getIncidenthist() {

		List<IncHistLog> incidenthistList = null;

		try {
			incidenthistList = dataServices.getIncidenthistList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return incidenthistList;
	}

	/* Ger a single objct in Json form in Spring Rest Services */
      @RequestMapping(value = "/{id}", method = RequestMethod.GET)
      public @ResponseBody IncHistLog getIncidenthist(@PathVariable("id") int id) {

    	  IncHistLog incHistLog = null;

     try {
    	 incHistLog = dataServices.getIncidenthistById(id);

      } catch (Exception e) {

      e.printStackTrace();
    return new IncHistLog();
    }
 
   return incHistLog;
}
    
   // Delete an object from DB in Spring Restful Services
  	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  	public @ResponseBody Status deleteIncidenthist(@PathVariable("id") int id) {

  		try {

  			 dataServices.deleteIncident(id);
  			return new Status(1, "IncHistLog deleted Successfully !");
  		} catch (Exception e) {
  			e.printStackTrace();
  			return new Status(0, "IncHistLog Deletion Failed Reason: " +

  					e.getMessage());

  		}
     }
}
