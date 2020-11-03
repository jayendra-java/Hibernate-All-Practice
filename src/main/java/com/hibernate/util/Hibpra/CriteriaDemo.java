package com.hibernate.util.Hibpra;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Student;

public class CriteriaDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Student.class);
		cr.setMaxResults(2);
		Projection myProjection = Projections.property("name");
System.out.println("hello");
//		cr.setProjection(myProjection);
		List<Student> li=cr.list();
		
		for(Student st:li)
		{
			System.out.println(st);
		}
		/*int id=2;
		cr.add(Restrictions.eq("id", id));
		cr.add(Restrictions.ne
				("branch", "def"));
		List<Student> li1=cr.list();
		for(Student st:li1)
		{
			System.out.println(st);
		}*/
		Projection bp=Projections.property("branch");
		ProjectionList pl=Projections.projectionList();
		pl.add(myProjection);
		pl.add(bp);
		cr.setProjection(pl);
		List<Object[]> li1=cr.list();
		li1.forEach((o) -> {
            System.out.println("Name: " + o[0] +", branch: " + o[1]);
        });
		

	}

}
