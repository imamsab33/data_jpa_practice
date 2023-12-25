package com.imamsab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.ProductE;
import com.imamsab.repo.ProductR;

@Service
public class ProductS {
	 @Autowired
	    private ProductR prod;

	    public List<ProductE> getAllProducts() {
	        return (List<ProductE>) prod.findAll();
	    }

	    public Optional<ProductE> getProductById(Long id) {
	        return prod.findById(id);
	    }

	    public void saveProduct(ProductE product) {
	        prod.save(product);
	    }

	    public void deleteProduct(Long id) {
	        prod.deleteById(id);
	    }
}
