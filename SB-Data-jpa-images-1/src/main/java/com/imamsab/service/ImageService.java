package com.imamsab.service;

import java.io.FileInputStream;

import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.imamsab.ImageRepo;
import com.imamsab.entity.Image;

@Service
public class ImageService {
      private ImageRepo ima;
      public ImageService(ImageRepo ima) {
		this.ima=ima;
	}
      public void saveImage1()
      
      {
    	  Image sc=new Image();
    	  sc.setName("core java");
    	  try
    	  {
    		  FileInputStream fis=new FileInputStream("DBM_3557.JPG");
    		  sc.setImg(fis.readAllBytes());
    		  fis.close();
    	  }catch(Exception e)
    	  {
    		  System.out.println();
    		  e.printStackTrace();
    	  }
    	  ima.save(sc);
      }
}
