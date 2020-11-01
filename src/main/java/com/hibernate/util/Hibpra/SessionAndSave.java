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
		Student s1=new Student("nani",25,"C.S.E");
		s.save(s1);
		tx.commit();
    }
	
	
	

}
