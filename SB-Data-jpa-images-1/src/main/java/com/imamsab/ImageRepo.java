package com.imamsab;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.Image;

public interface ImageRepo extends JpaRepository<Image, Integer> {

}
