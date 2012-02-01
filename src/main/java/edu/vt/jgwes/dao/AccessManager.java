package edu.vt.jgwes.dao;

import java.util.Date;

import org.hibernate.Session;

import edu.vt.jgwes.model.hibernate.Event;
import edu.vt.jgwes.model.hibernate.Message;
import edu.vt.jgwes.util.HibernateSessionFactoryUtil;

public class AccessManager {

	private Session session;
	
	public AccessManager() {
		HibernateSessionFactoryUtil.getSessionFactory();
		session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	}
	
	public void createAndStoreMessage (String message) {
		Message theMessage = new Message(message, new Date());
		session.save(theMessage);
	}
	
	public void createAndStoreEvent (String event) {
		Event theEvent = new Event(event, new Date());
		session.save(theEvent);
	}

	public void commit() {
		session.getTransaction().commit();
	}
}
