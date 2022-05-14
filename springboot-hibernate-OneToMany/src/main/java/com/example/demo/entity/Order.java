package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Delivery")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="order_status")
	private String Status;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="addr_id") private Address billingAddress;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}

	/*
	 * public Address getBillingAddress() { return billingAddress; }
	 * 
	 * public void setBillingAddress(Address billingAddress) { this.billingAddress =
	 * billingAddress; }
	 */

	@Override
	public String toString() {
		return "Order [id=" + id + ", Status=" + Status + /*", billingAddress=" + billingAddress + */"]";
	}
	

}
