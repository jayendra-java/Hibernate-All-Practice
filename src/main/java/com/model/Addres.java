package com.model;

import javax.persistence.*;

@Entity
public class Addres {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String city;
	private String country;
	@OneToOne(mappedBy = "adress")
	private Student st;
	
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
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
		return "Addres [id=" + id + ", city=" + city + ", country=" + country + ", st=" + st + "]";
	}
	

}
