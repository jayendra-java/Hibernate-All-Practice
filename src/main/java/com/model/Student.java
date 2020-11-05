package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	private String name;
	private int age;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
	private Addres addres;
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_ID")*/
	@OneToMany(mappedBy = "students",cascade = CascadeType.ALL)
	private Set<Account> accounts;

	

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	private String branch;

	public Student() {

	}

	public Student(String name, int age, String branch) {

		// this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", accounts=" + accounts + ", branch=" + branch
				+ "]";
	}
	public Addres getAddres() {
		return addres;
	}

	public void setAddres(Addres addres) {
		this.addres = addres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
