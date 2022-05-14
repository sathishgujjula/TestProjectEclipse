package com.example.demo.entity1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

	
	@Column(name = "s_name")
	private String name;
    
	@Id
	@Column(name = "s_id")
	private int id;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity=Library.class)
	@JoinColumn(name = "stu_names")
	private List books_issued;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List getBooks_issued() {
		return books_issued;
	}

	public void setBooks_issued(List books_issued) {
		this.books_issued = books_issued;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", books_issued=" + books_issued + "]";
	}

}
