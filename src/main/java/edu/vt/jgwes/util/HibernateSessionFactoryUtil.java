package edu.vt.jgwes.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactoryUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception ex) {
			System.err.println("Failed to create SessionFactory." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
