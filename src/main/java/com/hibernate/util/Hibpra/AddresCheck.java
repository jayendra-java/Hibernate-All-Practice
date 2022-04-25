package com.hibernate.util.Hibpra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Addres;
import com.model.Student;

public class AddresCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Addres a=new Addres();
		Student st=new Student();
		a.setCity("blr");
		a.setCountry("india");
		a.setStudent(st);
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.save(a);
		tx.commit();*/
		try
		{
			foo();
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}

	}
	
	public static void  foo() throws Exception
	{
		System.out.println("hello");
		int c=8/0;
		
	}

}
