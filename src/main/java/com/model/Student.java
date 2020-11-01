package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 //@Column(name="_name") 
	private String name;
	 //@Column(name="-age") 
	private int age;
	  
	private String branch;
	public Student()
	{
		
	}
	public Student( String name, int age, String branch) {
		
		//this.id = id;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id="  + ", name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}
	
	
	
}
