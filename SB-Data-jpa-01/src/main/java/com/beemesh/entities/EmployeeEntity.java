package com.beemesh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class EmployeeEntity {
	  @Id
	 private int id;
	 private String empname;
	 private double empsalary;
	 
	 
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}
	 
	public EmployeeEntity(int id, String empname, double empsalary) {
		super();
		this.id = id;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	 

}
