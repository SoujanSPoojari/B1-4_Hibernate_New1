package com.association;

import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="department")
	@JoinColumn(name="emp_name")
	//@SuppressWarnings("unused")
	private Set <Employee> employees;
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
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}	
