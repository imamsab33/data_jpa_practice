package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Adress2 {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer empno;
     private String presentAdress;
     private String permentAdress;
     
	
	public String toString() {
		return "Adress2 [empno=" + empno + ", presentAdress=" + presentAdress + ", permentAdress=" + permentAdress
				+ "]";
	}


	public Integer getEmpno() {
		return empno;
	}


	public void setEmpno(Integer empno) {
		this.empno = empno;
	}


	public String getPresentAdress() {
		return presentAdress;
	}


	public void setPresentAdress(String presentAdress) {
		this.presentAdress = presentAdress;
	}


	public String getPermentAdress() {
		return permentAdress;
	}


	public void setPermentAdress(String permentAdress) {
		this.permentAdress = permentAdress;
	}
     
     
}
