package com.beemesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sv {
	@Id

	private String cname;
	private Integer sno;
	private Integer cno;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

}
