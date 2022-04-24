package com.hibernate.util.Hibpra;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Addres;
import com.model.Hibobj;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx= s.beginTransaction();
		tx.begin();
		Hibobj h=new Hibobj();
		h.setAge(22);h.setName("nani");
		s.save(h);
		//s.flush();
		tx.commit();
	
		/*
		Criteria cr=s.createCriteria(Student.class);
		cr.setMaxResults(2);
		Projection myProjection = Projections.property("name");

		cr.setProjection(myProjection);
		List<Object> li=(List<Object>)cr.list();
		for(Object st:li)
		{
			System.out.println(st);
		}
		int id=2;
		cr.add(Restrictions.eq("id", id));
		cr.add(Restrictions.ne
				("branch", "def"));
		List<Student> li1=cr.list();
		for(Student st:li1)
		{
			System.out.println(st);
		}
		

	}*/
	}


}
