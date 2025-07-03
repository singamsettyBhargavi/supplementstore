package com.supplementstore.supplementstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplementstore.supplementstore.entites.Products;
import com.supplementstore.supplementstore.repositories.productrepository;

@Service
public class productservice {

	@Autowired
	public productrepository prorep;
	
	public List<Products> getAllItems(){
	return prorep.findAll();
	}
	
}
