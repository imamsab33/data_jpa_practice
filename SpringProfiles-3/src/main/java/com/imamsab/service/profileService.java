package com.imamsab.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imamsab.AdressEntity;
import com.imamsab.AdressRepo;
import com.imamsab.ProfileEntity;
import com.imamsab.ProfileRepository;

@Service
public class profileService {
	private ProfileRepository repo;
	private AdressRepo repo1;

	public profileService(ProfileRepository repo, AdressRepo repo1) {
		this.repo = repo;
		this.repo1 = repo1;
	}

	@Transactional(rollbackFor = Exception.class)
	public void saveEntity() {
		ProfileEntity pf = ProfileEntity.builder().cname("ait").ename("himami").salary(56565).build();
		Integer eid = repo.save(pf).getEid();

		AdressEntity aes = new AdressEntity();
		aes.setAdressNo(1);
		aes.setStreet("ram nagar");
		aes.setState("ap");
		aes.setTName("andhra");
		aes.setEid(eid);

		repo1.save(aes);

	}
}
