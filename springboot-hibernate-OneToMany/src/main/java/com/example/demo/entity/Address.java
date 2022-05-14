package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="addres_id")
	private int id;
	
	@Column(name="addr_city")
	private String city;
	
	@Column(name="addr_state")
	private String state;
	
	//@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "billingAddress")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Order or;
	
	
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
	}
	public Order getOr() {
		return or;
	}
	public void setOr(Order or) {
		this.or = or;
	}

	
	
}
