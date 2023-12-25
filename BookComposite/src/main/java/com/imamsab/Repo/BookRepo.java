package com.imamsab.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.BookPK;
import com.imamsab.Entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, BookPK> {

}
