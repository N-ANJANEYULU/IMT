package com.acc.services;

import java.util.List;

import com.acc.model.Incident;
import com.acc.model.UserRegister;

public interface DataServices {

	public Integer addUser(UserRegister userregister) throws Exception;

	public UserRegister getUserById(int id) throws Exception;

	public List<UserRegister> getUserList() throws Exception;

	public boolean deleteUser(int id) throws Exception;

	public boolean updateUser(UserRegister userregister) throws Exception;

	public UserRegister getLogin(String userName, String password) throws Exception;

	public Integer addIncident(Incident incident) throws Exception;

	public Incident getIncidentById(int id) throws Exception;

	public List<Incident> getIncidentList() throws Exception;

	public boolean deleteIncident(int id) throws Exception;

	public boolean updateIncident(Incident incident) throws Exception;
}
