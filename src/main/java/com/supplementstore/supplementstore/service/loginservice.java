package com.supplementstore.supplementstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.supplementstore.supplementstore.repositories.userrespository;

@Service
public class loginservice {
	
	@Autowired
	public userrespository userrep;
}
	

	
