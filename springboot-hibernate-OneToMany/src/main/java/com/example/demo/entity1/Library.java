package com.example.demo.entity1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="l_id")
	private int id;
	
	@Column(name="l_name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	}
	
	

}
