package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ADDRES_ID")
	private Addres adress;
	
	public Addres getAdress() {
		return adress;
	}
	public void setAdress(Addres adress) {
		this.adress = adress;
	}
	
	  
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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", adress=" + adress + ", branch=" + branch
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
