package com.beemesh.io.io.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beemesh.io.LRG;
import com.beemesh.io.io.ILRG;

@Service
public class LRGService {
	private ILRG lrg;

	public LRGService(ILRG lrg) {
		// TODO Auto-generated constructor stub
		this.lrg = lrg;
	}

	public void getAllEmpRecord() {
		// List <LRG> lt=lrg.getAllStudentRecords();
		//lt.forEach(System.out::println);
	}

	/*
	 * public void getAllLRG(String name) { List<LRG> lr2=lrg.findByName(name);
	 * lr2.forEach(System.out::println); }
	 */
//	public void getfindBysnoAndName(Integer sno,String name) {
//		List<LRG> lr4=lrg.findBysnoAndName(sno, name);
//		lr4.forEach(System.out::println);
//	}
	public void saveService() {
		LRG lr = new LRG();
		lr.setCont(1236.5);
		lr.setName("himam");
		lr.setNo(78942);
		lr.setSno(784);
		LRG lr1 = new LRG();
		lr1.setCont(1236.5);
		lr1.setName("himam22");
		lr1.setNo(789);
		lr1.setSno(78);

		LRG lr3 = new LRG();
		lr3.setCont(1211.5);
		lr3.setName("himam1");
		lr3.setNo(71);
		lr3.setSno(71);

		List<LRG> list = Arrays.asList(lr, lr1, lr3);
		lrg.saveAll(list);
	}
}
