package com.imamsab;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.book;



public interface CompositeRepo extends JpaRepository<book,String >
{

}
