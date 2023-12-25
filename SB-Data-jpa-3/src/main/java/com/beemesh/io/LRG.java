package com.beemesh.io;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LRG {
	@Id
	private Integer sno;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Long getCont() {
		return cont;
	}
	public void setCont(double d) {
		this.cont = (long) d;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	private Integer no;
	private Long cont;
	public Integer getSno() {
		return sno;
	}
	@Override
	public String toString() {
		return "LRG [sno=" + sno + ", name=" + name + ", no=" + no + ", cont=" + cont + "]";
	}
	
	/*public LRG() {
		super();
		this.sno = sno;
		this.name = name;
		this.no = no;
		this.con = con;
	}*/
	
	


}
