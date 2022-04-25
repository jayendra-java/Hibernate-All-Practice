package com.hibernate.util.Hibpra;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;

public class HJqlRetrive {
	public static void main( String[] args )
	{
		Session s=Example.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		String sql="from Student";
		Query q=s.createQuery(sql);
		List<Student> results=q.list();
		for(Student st:results)
		{
			System.out.println(st);
		}
		String sql2="from Student where name=:name1"+" and id=:id1";
		q=s.createQuery(sql2);
		q.setParameter("name1","suresh");
		q.setParameter("id1",2);
		
		Student se=(Student) q.uniqueResult();
		System.out.println(se);
		
		
	}
	

}
