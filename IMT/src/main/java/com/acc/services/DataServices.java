package com.acc.services;

import java.util.List;

import com.acc.model.UserRegister;

public interface DataServices {

	public Integer addEntity(UserRegister userregister) throws Exception;
	public UserRegister getEntityById(int id) throws Exception;
	public List<UserRegister> getEntityList() throws Exception;
	public boolean deleteEntity(int id) throws Exception;
	public boolean updateEntity(UserRegister userregister) throws Exception;
		

}
