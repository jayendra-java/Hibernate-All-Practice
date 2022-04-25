package com.hibernate.util.Hibpra;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.*;

public class Manytoonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setName("nani");
		st.setBranch("C.S.E");
		st.setAge(26);
		Addres ad=new Addres();
		ad.setCity("blr");
		ad.setCountry("india");
		ad.setStudent(st);
		st.setAddres(ad);
		Account at=new Account();
		at.setBank("sbi");
		at.setAccnum("345687653456");
		at.setStudents(st);
		Account atr=new Account();
		atr.setBank("icici");
		atr.setStudents(st);
		atr.setAccnum("8764566534");
		Set<Account> set=new HashSet<Account>();
		set.add(at);
		set.add(atr);
		//at.setStudent(set);
		//atr.setStudent(set);
		System.out.println("fucked up");
		st.setAccounts(set);

		
		try {
			SessionFactory sf=Example.getSessionFactory();
			Session s=sf.openSession();
			org.hibernate.Transaction tx=s.beginTransaction();
			//s.save(at);
			//s.save(atr);
			s.save(st);
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
