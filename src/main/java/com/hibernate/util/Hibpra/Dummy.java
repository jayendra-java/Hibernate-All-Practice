package com.hibernate.util.Hibpra;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		try
		{
		System.out.println("=========================");
		//String sql="select name ,city from Student INNER JOIN Addres where Student.ADDRES_ID=Addres.id ";
		String sd=" SELECT s.name, a.city FROM Student s INNER JOIN Addres a ON s.adress = a.id";

       //SQLQuery q =s.createSQLQuery(sd);
		Query q=s.createQuery(sd);
		List<Object[]> ol=q.list();
		if(ol!=null)
		{
		System.out.println("hello");
		for(Object[] al:ol)
		{
			System.out.println(Arrays.toString(al));
		}
		}
		else
		{
			System.out.println("failed");
		}
		tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();  
		}

	}

}
