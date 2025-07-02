package com.supplementstore.supplementstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplementstore.supplementstore.entites.Products;
import com.supplementstore.supplementstore.repositories.productrepository;

@Service
public class dashboardservice {
	
@Autowired
public  productrepository proresp;
	
public List<Products> getAllProductsList(){
  return proresp.findAll();
}
}
