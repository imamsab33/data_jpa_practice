package com.imamsab.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@AllArgsConstructor
public class Employee4 {
      @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer empno;
      private String name;
      
      public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Adress2> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress2> adress) {
		this.adress = adress;
	}

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
      @JoinColumn(name = "employee_id")
      private List<Adress2> adress=new ArrayList<>();

//	public Adress2[] getAdress1() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public void setAdress() {
////		// TODO Auto-generated method stub
		
}
      
}
