package com.example.demo;

//hjkbhvib

//hhhgggg
<<<<<<< HEAD
f9b2f0028c5881d2b50ec1f099f2ce0a0b1f18c3
=======
>>>>>>> f9b2f0028c5881d2b50ec1f099f2ce0a0b1f18c3
	//himamsb
>>>>>>> e5bdd557564377c78ee50821644b78c276234642
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
/ended
	}
}
