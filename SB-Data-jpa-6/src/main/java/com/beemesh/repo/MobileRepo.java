package com.beemesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beemesh.dao.MobileDao;

public interface MobileRepo extends JpaRepository<MobileDao, Integer> {

//	public List<MobileDao> findByMakeAndMname(String make, String name);

}
