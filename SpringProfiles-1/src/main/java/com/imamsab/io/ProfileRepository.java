package com.imamsab.io;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {

}
