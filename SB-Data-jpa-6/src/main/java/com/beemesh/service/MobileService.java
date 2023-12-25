package com.beemesh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.beemesh.dao.MobileDao;
import com.beemesh.repo.MobileRepo;

@Service
public class MobileService {

	private MobileRepo repo;

	public MobileService(MobileRepo repo) {
		this.repo = repo;
	}

	public void saverecords() {
		MobileDao ob = new MobileDao();
		ob.setMid(1);
		ob.setMname("mi-11x");
		ob.setMake("mi");

		MobileDao ob1 = new MobileDao();
		ob1.setMid(2);
		ob1.setMname("iphone -12");
		ob1.setMake("apple");
		MobileDao ob2 = new MobileDao();
		ob2.setMid(3);
		ob2.setMname("nothing-2");
		ob2.setMake("nothing");

		List<MobileDao> asList = Arrays.asList(ob, ob1, ob2);
		repo.saveAll(asList);

	}

	public void queryByexample() {

		MobileDao ob = new MobileDao();

		ob.setMake("mi");

		Example<MobileDao> of = Example.of(ob);

		List<MobileDao> findAll = repo.findAll(of);

		findAll.forEach(System.out::println);
	}

}
