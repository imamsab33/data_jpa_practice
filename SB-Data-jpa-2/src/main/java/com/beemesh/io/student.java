package com.beemesh.io;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	private Integer sid;
	private String name;
	private String email;
	private Integer phno;
	public student() {
		
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhno() {
		return phno;
	}

	public void setPhno(Integer phno) {
		this.phno = phno;
	}
      
}
