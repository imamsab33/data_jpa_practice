package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee22 {
      @Id
      private Integer eid;
      private String name;
      private String salary;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee22 [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
      
      public Employee22() {
		// TODO Auto-generated constructor stub
	}
	public Employee22(Integer eid, String name, String salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
      
      
}
