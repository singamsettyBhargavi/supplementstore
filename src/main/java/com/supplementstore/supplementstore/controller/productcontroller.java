package com.supplementstore.supplementstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.supplementstore.supplementstore.entites.Products;
import com.supplementstore.supplementstore.service.productservice;

@Controller
public class productcontroller {
	
	@Autowired
	public productservice proservice;


	@GetMapping("/dashboard") 
	public String showpro(Model m) {
	    List<Products> productList = proservice.getAllItems();  
	    if (!productList.isEmpty()) {
	        Products firstProduct = productList.get(0);         
	        m.addAttribute("product", firstProduct);     
	        System.out.println("First Product Name: " + firstProduct.getProname());

	    }

	    return "dashboard";  
	}

		
		
	}

	

