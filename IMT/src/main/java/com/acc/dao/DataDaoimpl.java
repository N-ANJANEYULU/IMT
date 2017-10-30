package com.acc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.acc.model.IncHistLog;
import com.acc.model.IncidentLog;
import com.acc.model.SearchCriteria;
import com.acc.model.UserInc;

 /*@Repository*/

public class DataDaoimpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session session = null;

	Transaction tx = null;

	public Integer addUser(UserInc userInc) throws Exception {
		// System.out.println(userregister.getBrand());
		System.out.println(userInc.getFirstName());
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Integer id = (Integer) session.save(userInc);
		System.out.println("Object Created with Id " + id);
		tx.commit();
		session.close();

		return id;
	}

	public boolean updateUser(UserInc userInc) throws Exception {
		// System.out.println(consumergroup.getBrand());

		if (userInc.getUserId() != null) {
			System.out.println(userInc.getFirstName());
			session = sessionFactory.openSession();
			tx = session.beginTransaction();

			session.update(userInc);

			tx.commit();
			session.close();
			return true;
		}
		return false;

	}

	public UserInc getUserById(int id) throws Exception {
		session = sessionFactory.openSession();
		UserInc userInc = (UserInc) session.load(UserInc.class, new Integer(id));
		return userInc;
	}

	@SuppressWarnings("unchecked")
	public List<UserInc> getUserList() throws Exception {
		session = sessionFactory.openSession();
		List<UserInc> userregisterList = session.createQuery("from UserInc").list();
		session.close();
		return userregisterList;

	}

	public boolean deleteUser(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(UserInc.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

	public UserInc getLogin(String userName, String password) throws Exception {
		session = sessionFactory.openSession();
		String loginUserQuery = "from UserInc u where u.userName=:un and u.password=:pw";
		Query query = session.createQuery(loginUserQuery);
		query.setParameter("un", userName);
		query.setParameter("pw", password);
		if (query.list().isEmpty()) {
			return null;
		} else {
			return (UserInc) query.list().get(0);
		}
	}

	public Integer addIncident(IncidentLog incidentLog) {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Integer id = (Integer) session.save(incidentLog);
		System.out.println("Object Created with Id " + id);
		tx.commit();
		session.close();

		return id;

	}
	
	
	

	public boolean updateIncident(IncidentLog incidentLog) throws Exception {
		
		if (incidentLog.getIncId() != null) {

			session =sessionFactory.openSession();

			tx =session.beginTransaction();
			session.merge(incidentLog);

			tx.commit();
			session.close();
			return true;

		}
		return false;

	}

	public IncidentLog getIncidentById(int id) throws Exception {
		session = sessionFactory.openSession();
		IncidentLog incidentLog = (IncidentLog) session.load(IncidentLog.class,	new Integer(id));
		return incidentLog;

	}

	@SuppressWarnings("unchecked")
	public List<IncidentLog> getIncidentList() throws Exception {
		session = sessionFactory.openSession();
		List<IncidentLog> incidentList =
//LEFT JOIN FETCH c.wheels wheel order by wheel.location
				session.createQuery("select distinct incLog from IncidentLog incLog LEFT JOIN FETCH incLog.incHistLogs as incHistLog Order By incHistLog.incHistId desc").list();
		session.close();
		return incidentList;

	}

	public boolean deleteIncident(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(IncidentLog.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;

	}

	@Override
	public Integer addIncidenthist(IncHistLog incHistLog) throws Exception {

		// System.out.println(incHistLog.getBrand());
		        session = sessionFactory.openSession();
				tx = session.beginTransaction();
				Integer id = (Integer) session.save(incHistLog);
				System.out.println("Object Created with Id " + id);
				tx.commit();
				session.close();

				return id;
		
	}

	@Override
	public IncHistLog getIncidenthistById(int id) throws Exception {
		session = sessionFactory.openSession();
		IncHistLog incHistLog = (IncHistLog) session.load(IncHistLog.class, new Integer(id));
		return incHistLog;
	}

	@SuppressWarnings("unchecked")
	public List<IncHistLog> getIncidenthistList() throws Exception {
		session = sessionFactory.openSession();
		List<IncHistLog> incHistLogList = session.createQuery("from IncHistLog").list();
		session.close();
		return incHistLogList;
	}

	@Override
	public boolean deleteIncidenthist(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(IncidentLog.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

	@Override
	public boolean updateIncidenthist(IncHistLog incHistLog) throws Exception {
		if (incHistLog.getIncHistId() != null) {

			session =sessionFactory.openSession();

			tx =session.beginTransaction();
			session.update(incHistLog);

			tx.commit();
			session.close();
			return true;

		}
		return false;
	}

	@Override
	public List<IncidentLog> getIncidentList(SearchCriteria searchCriteria) throws Exception {
		session = sessionFactory.openSession();
		String query = "select distinct incLog from IncidentLog incLog LEFT JOIN FETCH incLog.incHistLogs as incHistLog"
				+ " where incLog.incId=:keyword  OR incHistLog.application like :keyword OR incHistLog.application like :keyword "
				+ " OR incHistLog.comments like :keyword   OR incHistLog.description like:keyword Order By incHistLog.incHistId desc";
		org.hibernate.query.Query createQuery = session.createQuery(query);
		createQuery.setString("keyword", "%"+searchCriteria.getSearchIncident()+"%");
		List<IncidentLog> incidentList =	createQuery.list();
		
		session.close();
		return incidentList;
	}


}
