package com.acc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.dao.DataDaoimpl;
import com.acc.model.IncHistLog;
import com.acc.model.IncidentLog;
import com.acc.model.UserInc;

 @Service 
public class DataServicesimpl implements DataServices {
	@Autowired
	DataDaoimpl dataDao;

	@Override
	public Integer addUser(UserInc userInc) throws Exception {
		return dataDao.addUser(userInc);
	}

	@Override
	public UserInc getUserById(int id) throws Exception {
		return dataDao.getUserById(id);
	}

	@Override
	public List<UserInc> getUserList() throws Exception {
		return dataDao.getUserList();
	}

	@Override
	public boolean deleteUser(int id) throws Exception {
		return dataDao.deleteUser(id);
	}

	@Override
	public boolean updateUser(UserInc userInc) throws Exception {
		return dataDao.updateUser(userInc);
	}

	@Override
	public UserInc getLogin(String userName, String password) throws Exception {
		return dataDao.getLogin(userName, password);
	}

	@Override
	public Integer addIncident(IncidentLog incidentLog) throws Exception {
		return dataDao.addIncident(incidentLog);
	}

	@Override
	public IncidentLog getIncidentById(int id) throws Exception {
		return dataDao.getIncidentById(id);
	}

	@Override
	public List<IncidentLog> getIncidentList() throws Exception {
		return dataDao.getIncidentList();
	}

	@Override
	public boolean deleteIncident(int id) throws Exception {
		return dataDao.deleteIncident(id);
	}

	@Override
	public boolean updateIncident(IncidentLog incidentLog) throws Exception {
		return dataDao.updateIncident(incidentLog);
	}


	@Override
	public Integer addIncidenthist(IncHistLog incHistLog) throws Exception {
		
		return dataDao.addIncidenthist(incHistLog);
	}

	@Override
	public IncHistLog getIncidenthistById(int id) throws Exception {
		
		return dataDao.getIncidenthistById(id);
	}

	@Override
	public List<IncHistLog> getIncidenthistList() throws Exception {
		
		return dataDao.getIncidenthistList() ;
	}

	@Override
	public boolean deleteIncidenthist(int id) throws Exception {
		
		return dataDao.deleteIncidenthist(id);
	}

	@Override
	public boolean updateIncidenthist(IncHistLog incHistLog) throws Exception {
		
		return dataDao.updateIncidenthist(incHistLog) ;
		
	}

	
	

}