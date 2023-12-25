package com.beemesh.service;


import org.springframework.stereotype.Service;

import com.beemesh.entity.Sv;
import com.beemesh.entity.io.ISv;

@Service
public class SvService {
	private ISv isv;
	public SvService(ISv isv) {
		// TODO Auto-generated constructor stub
		this.isv=isv;
		
	}
	public void saveService1() {
		Sv sv=new Sv();
	sv.setCname("imam2");
	sv.setCno(852);
	sv.setSno(54);
	isv.save(sv);
	}
	

}
