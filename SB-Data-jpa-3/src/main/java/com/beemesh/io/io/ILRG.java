package com.beemesh.io.io;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.beemesh.io.LRG;



public interface ILRG extends CrudRepository<LRG, Integer>{
@Query("from LRG")
public List<LRG> getAllStudentRecords(Integer sno);
//	@Query
//	public List<LRG> findByName(String name);
//	public List<LRG> findBysnoAndName(Integer sno, String name);
//	

	
}
