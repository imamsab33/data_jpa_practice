package com.imamsab;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class lifeCycleMethods {

	@PostConstruct
	public void m1() {
		System.out.println("project started");
	}

	@PreDestroy
	public void m2() {
		System.out.println("project closed");
	}

}
