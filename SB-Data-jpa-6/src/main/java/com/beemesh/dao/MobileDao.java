package com.beemesh.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mobile")
public class MobileDao {

	@Id
	private Integer mid;
	private String mname;
	private String make;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "MobileDao [mid=" + mid + ", mname=" + mname + ", make=" + make + "]";
	}
	
	
	

}
