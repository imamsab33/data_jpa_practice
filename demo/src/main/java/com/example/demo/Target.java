package com.example.demo;
//hhhgggg
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//ou
@Component
public class Target {
	
	Depented dp;
	
	
	
	public Depented getDp() {
		return dp;
	}


	@Autowired
	public void setDp(Depented dp) {
		this.dp = dp;
	}



	public void work() {
		System.out.println("work started");
		dp.save();
		System.out.println("work ended");
	}
}
