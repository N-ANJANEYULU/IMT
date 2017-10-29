package com.acc.services;

import java.util.List;

import com.acc.model.IncHistLog;
import com.acc.model.IncidentLog;
import com.acc.model.SearchCriteria;
import com.acc.model.UserInc;

public interface DataServices {

	
	public Integer addUser(UserInc userInc) throws Exception;

	public UserInc getUserById(int id) throws Exception;

	public List<UserInc> getUserList() throws Exception;

	public boolean deleteUser(int id) throws Exception;

	public boolean updateUser(UserInc userInc) throws Exception;

	public UserInc getLogin(String userName, String password) throws Exception;

	public Integer addIncident(IncidentLog incidentLog) throws Exception;

	public IncidentLog getIncidentById(int id) throws Exception;

	public List<IncidentLog> getIncidentList() throws Exception;
	
	public List<IncidentLog> getIncidentList(SearchCriteria searchCriteria) throws Exception;

	public boolean deleteIncident(int id) throws Exception;

	public boolean updateIncident(IncidentLog incidentLog) throws Exception;
	
	
	public Integer addIncidenthist(IncHistLog incHistLog) throws Exception;

	public IncHistLog getIncidenthistById(int id) throws Exception;

	public List<IncHistLog> getIncidenthistList() throws Exception;

	public boolean deleteIncidenthist(int id) throws Exception;

	public boolean updateIncidenthist(IncHistLog incHistLog) throws Exception;

}
