package com.hibernate.util.Hibpra;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Student;

public class SessionAndSave {
	public static void main( String[] args ) throws Exception
    {
		//Example e=new Example();
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		Student s1=new Student("phani",26,"E.C.E");
		s.saveOrUpdate(s1);
		s1.setName("suresh");
		System.out.println(s1);
		//System.out.println("saved object with "+i); 
		tx.commit();
		Session s2=sf.openSession();
		org.hibernate.Transaction tx2=s2.beginTransaction();
		s1.setBranch("def");
		s2.saveOrUpdate(s1);
		tx2.commit();	
		System.out.println(s1);
		Session se=sf.openSession();
		org.hibernate.Transaction tx3=se.beginTransaction();
		Student sr=new Student("phani",26,"E.C.E");
		se.save(sr);
		sr.setName("suresh");
		//System.out.println("saved object with "+i); 
		tx3.commit();
		Session s12=sf.openSession();
		org.hibernate.Transaction tx12=s12.beginTransaction();
		sr.setBranch("def");
		s12.save(sr);
		tx12.commit();
	
		System.out.println("hello world hibernate");
		
    }
	
	
	
	
	}
