package com.acc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.dao.DataDaoimpl;
import com.acc.model.UserRegister;

 @Service 
public class DataServicesimpl implements DataServices {
	@Autowired
	DataDaoimpl dataDao;

	public Integer addEntity(UserRegister userregister) throws Exception {
		System.out.println(userregister.getFirstName());
		return dataDao.addEntity(userregister);
	}

	public UserRegister getEntityById(int id) throws Exception {

		return dataDao.getEntityById(id);
	}

	public List<UserRegister> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	public boolean deleteEntity(int id) throws Exception {
		return dataDao.deleteEntity(id);
	}

	public boolean updateEntity(UserRegister userregister) throws Exception {
		return dataDao.updateEntity(userregister);
	}
	
	public UserRegister getLogin(String userName, String password) throws Exception{
		return dataDao.getLogin(userName, password);
	}
	

}