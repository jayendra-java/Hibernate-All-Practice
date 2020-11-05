package com.model;

import javax.persistence.*;

@Entity
public class Addres {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String city;
	private String country;
	@OneToOne()
	@JoinColumn(name="Student_id")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Addres [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
	

}
