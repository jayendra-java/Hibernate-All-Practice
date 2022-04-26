package com.hibernate.util.Hibpra;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Batsmen;
import com.model.Bowler;
import com.model.Student;
import com.model.TeamIndia;
import com.model.inheritance.AusBatsmen;
import com.model.inheritance.AusBowler;
import com.model.inheritance.EngBatsmen;
import com.model.inheritance.EngBowler;
import com.model.inheritance.TeamAus;
import com.model.inheritance.TeamEng;
import com.model.onetoone.Accountone;
import com.model.onetoone.Employee;

public class SessionAndSave {
	public static void main( String[] args ) throws Exception
    {
		///Student st=null;
		try(Session s=Example.getSessionFactory().openSession()) {
			s.beginTransaction();
			System.out.println("join tabel test");
			Employee e=new Employee();
			Accountone a=new Accountone();
			a.setBank("Idfc");a.setAccnum("123qwe");
			e.setAccount(a);e.setExp((float) 3.3);e.setName("mani");
			s.save(e);
			Employee ed=s.get(Employee.class,137);
			System.out.println("emp name is"+ed.getName());
			System.out.println("fetch test");
			System.out.println("emp acc bank is"+ed.getAccount().getBank());
			
			s.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		//st.setBranch("mech");;
		/*try(Session s=Example.getSessionFactory().openSession()) {
			Student st1=s.get(Student.class, 99);;
			s.beginTransaction();
			System.out.println("update the obj");
			//s.update(st);
			System.out.println("merge completed");
			s.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		/*Exampl e e=new Example();
		SessionFactory sf=Example.getSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		Student s1=new Student("phani",27,"E.C.E");
		System.out.println("save test");
		//int id=(int) s.save(s1);
		//System.out.println("id is"+id);
		//System.out.println("flush test");
		//Student st=s.load(Student.class, 89);
		//System.out.println("load test");
		System.out.println("dirty check test");
		Student st1=s.get(Student.class, 99);
		//System.out.println("commit test");
		System.out.println(st1);
		System.out.println("dirty check");
		st1.setName("mani");
		//System.out.println(st.getId());
		s.flush();
		//tx.commit();
		/*Student s1=new Student("phani",26,"E.C.E");
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
	
		System.out.println("hello world hibernate");*/
		
    }
	
	
	
	
	}
