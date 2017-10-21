package com.acc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.dao.DataDaoimpl;
import com.acc.model.Incident;
import com.acc.model.UserRegister;

 @Service 
public class DataServicesimpl implements DataServices {
	@Autowired
	DataDaoimpl dataDao;

	@Override
	public Integer addUser(UserRegister userregister) throws Exception {
		return dataDao.addUser(userregister);
	}

	@Override
	public UserRegister getUserById(int id) throws Exception {
		return dataDao.getUserById(id);
	}

	@Override
	public List<UserRegister> getUserList() throws Exception {
		return dataDao.getUserList();
	}

	@Override
	public boolean deleteUser(int id) throws Exception {
		return dataDao.deleteUser(id);
	}

	@Override
	public boolean updateUser(UserRegister userregister) throws Exception {
		return dataDao.updateUser(userregister);
	}

	@Override
	public UserRegister getLogin(String userName, String password) throws Exception {
		return dataDao.getLogin(userName, password);
	}

	@Override
	public Integer addIncident(Incident incident) throws Exception {
		return dataDao.addIncident(incident);
	}

	@Override
	public Incident getIncidentById(int id) throws Exception {
		return dataDao.getIncidentById(id);
	}

	@Override
	public List<Incident> getIncidentList() throws Exception {
		return dataDao.getIncidentList();
	}

	@Override
	public boolean deleteIncident(int id) throws Exception {
		return dataDao.deleteIncident(id);
	}

	@Override
	public boolean updateIncident(Incident incident) throws Exception {
		return dataDao.updateIncident(incident);
	}

	
	

}