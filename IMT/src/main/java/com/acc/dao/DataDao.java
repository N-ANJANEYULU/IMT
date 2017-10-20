package com.acc.dao;

import java.util.List;

import com.acc.model.Incident;
import com.acc.model.UserRegister;

public interface DataDao {
	
	public Integer addEntity(UserRegister userregister) throws Exception;

	public UserRegister getEntityById(int id) throws Exception;

	public List<UserRegister> getEntityList() throws Exception;

	public boolean deleteEntity(int id) throws Exception;

	public boolean updateEntity(UserRegister userregister) throws Exception;
	public UserRegister getLogin(String userName, String password) throws Exception;

	
	public Integer addEntity1(Incident incident) throws Exception;

	public Incident getEntityById1(int id) throws Exception;

	public List<Incident> getEntityList1() throws Exception;

	public boolean deleteEntity1(int id) throws Exception;

	public boolean updateEntity1(Incident incident) throws Exception;
}
