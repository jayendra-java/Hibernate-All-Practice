package com.hibernate.util.Hibpra;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;

public class GetvsLoad {
	public static void main( String[] args )
	{
		Session s=Example.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		
		Student s1=null;
		Student s3=null;
		try
		{
			System.out.println("========get vs load=========");
			 s3=(Student)s.get(Student.class, 3);
			 System.out.println("=================");
			 s3=s.load(Student.class, 3);
			 System.out.println(s3.getName());
			 System.out.println("=================");
			 System.out.println("=======load vs get==========");
			 s3=s.load(Student.class, 2);
			// System.out.println(s3.getName());
			 System.out.println("=================");
			 s3=(Student)s.get(Student.class, 2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
				
	}
}
