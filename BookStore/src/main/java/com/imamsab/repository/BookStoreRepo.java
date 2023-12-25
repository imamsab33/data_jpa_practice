package com.imamsab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.BookStore;

public interface BookStoreRepo extends JpaRepository<BookStore, Integer> {

}
