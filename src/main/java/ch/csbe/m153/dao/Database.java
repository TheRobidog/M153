package ch.csbe.m153.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ch.csbe.m153.model.Antwort;
import ch.csbe.m153.model.Frage;
import ch.csbe.m153.model.FrageAntwort;
import ch.csbe.m153.model.Fragebereich;
import ch.csbe.m153.model.Fragebogen;
import ch.csbe.m153.model.FragebogenFrage;
import ch.csbe.m153.model.Ort;
import ch.csbe.m153.model.Teilnehmer;
import ch.csbe.m153.model.TeilnehmerFragebogenFrageAntwort;
import ch.csbe.m153.model.Unternehmen;

public class Database {
	
	private static Configuration cfg = new Configuration()
	    .addAnnotatedClass(Antwort.class)
	    .addAnnotatedClass(Fragebereich.class)
	    .addAnnotatedClass(Ort.class)
	    .addAnnotatedClass(Teilnehmer.class)
	    .addAnnotatedClass(Frage.class)
	    .addAnnotatedClass(Unternehmen.class)
	    .addAnnotatedClass(Fragebogen.class)
	    .addAnnotatedClass(FrageAntwort.class)
	    .addAnnotatedClass(FragebogenFrage.class)
	    .addAnnotatedClass(TeilnehmerFragebogenFrageAntwort.class)
	    
        //.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
       	//.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/is14")
       	//.setProperty("hibernate.connection.username", "root")
       	//.setProperty("hibernate.connection.password", "1234")
       	//.setProperty("hibernate.hbm2ddl.auto", "create") //validate, create, etc.
       	//.setProperty("hibernate.order_update", "true")
    ;
	private static SessionFactory factory = cfg.buildSessionFactory();
	private static Session session = factory.openSession();
	
	public static Session getSession(){
		if(session == null){
			session = factory.openSession();
		}
		return session;
	}
	
	public static void close(){
		session.close();
		factory.close();
	}
	
}
