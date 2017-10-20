package com.acc.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.acc.model.Incident;
import com.acc.model.UserRegister;

/* @Repository */
public class DataDaoimpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session session = null;

	Transaction tx = null;
	
	public Integer addEntity(UserRegister userregister) throws Exception {
		// System.out.println(userregister.getBrand());
		System.out.println(userregister.getFirstName());
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Integer id = (Integer) session.save(userregister);
		System.out.println("Object Created with Id " + id);
		tx.commit();
		session.close();

		return id;
	}
	public boolean updateEntity(UserRegister userregister) throws Exception {
		// System.out.println(consumergroup.getBrand());

				if (userregister.getUserid() != null) {
					System.out.println(userregister.getFirstName());
					session = sessionFactory.openSession();
					tx = session.beginTransaction();

					session.update(userregister);

					tx.commit();
					session.close();
					return true;
				}
				return false;
				
				
	}
	public UserRegister getEntityById(int id) throws Exception {
		session = sessionFactory.openSession();
		UserRegister userregister = (UserRegister) session.load(UserRegister.class, new Integer(id));
		return userregister;
	}
	@SuppressWarnings("unchecked")
	public List<UserRegister> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		List<UserRegister> userregisterList = session.createCriteria(UserRegister.class).list();
		session.close();
		return userregisterList;
		
	}
	public boolean deleteEntity(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(UserRegister.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

	public UserRegister getLogin(String userName, String password) throws Exception {
		session = sessionFactory.openSession();
		String loginUserQuery = "from UserRegister u where u.userName=:un and u.password=:pw";
		 Query query = session.createQuery(loginUserQuery);
		 query.setParameter("un", userName);
		 query.setParameter("pw", password);
		 if(query.list().isEmpty()){
			 return null;
		 } else {
			 return (UserRegister) query.list().get(0);
		 }
	}
	
	public Integer IncidentaddEntity(Incident incident) {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Integer id = (Integer) session.save(incident);
		System.out.println("Object Created with Id " + id);
		tx.commit();
		session.close();

		return id;

		}

		public boolean updateEntity(Incident incident) throws Exception {
		// System.out.println(consumergroup.getBrand());

		if (incident.getIncid() !=

		null) {

		session =

		sessionFactory.openSession();

		tx =

		session.beginTransaction();
		session.update(incident);

		tx.commit();
		session.close();
		return true;

		}
		return false;

		}
		public Incident getEntityById(int id) throws Exception {
		session = sessionFactory.openSession();
		Incident incident = (Incident) session.load(Incident.class,

		new Integer(id));

		return incident;

		}

		@SuppressWarnings("unchecked")
		public List<Incident> getEntityList1() throws Exception {
		session = sessionFactory.openSession();
		List<Incident> incidentList =

		session.createCriteria(Incident.class).list();
		session.close();
		return incidentList;

		}
		public boolean deleteEntity(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(UserRegister.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;

		}

		}

	

