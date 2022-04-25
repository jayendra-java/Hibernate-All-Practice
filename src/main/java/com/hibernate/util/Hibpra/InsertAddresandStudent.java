package com.hibernate.util.Hibpra;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.*;

public class InsertAddresandStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sf=Example.getSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		//se.save(s);
		System.out.println("=========================");
		String sql="select name ,city from Student "+"Inner join Addres where Student.ADDRES_ID=Addres.id ";
		String sqle="SELECT student.name, addres.city FROM student INNER JOIN addres ON student.ADDRES_ID = addres.id";
String stre="SELECT student.name, addres.city FROM student inner JOIN addres ON student.ADDRES_ID = addres.id";		
		Query q=se.createQuery(sql);
		List<Object[]> ol=q.list();
		System.out.println("hello");
		for(Object[] al:ol)
		{
			System.out.println(Arrays.toString(al));
		}
		tx.commit();
		
	}

}
