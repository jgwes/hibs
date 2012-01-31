package edu.vt.jgwes.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.vt.jgwes.model.hibernate.Event;

public class AccessManager {

	private SessionFactory sessionFactory;
	
	public AccessManager() throws Exception {
		sessionFactory = new Configuration()
    		.configure() 
    		.buildSessionFactory();
	}
	
	public void save (String message) {
		/*
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save( new Event( message, new Date()) );
		session.getTransaction().commit();
		session.close();
		
		/* 
		session = sessionFactory.openSession();
    	session.beginTransaction();
    	List<Message> result = session.createQuery( "from Message" ).list();
		for ( Message message : (List<Message>) result ) {
		System.out.println( "Message (" + message.getContent() + ") " );
		}		
    	session.getTransaction().commit();
    	session.close();
		*/
	}
	
	public void close(){
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
