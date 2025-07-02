package com.supplementstore.supplementstore.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplementstore.supplementstore.entites.Users;
import com.supplementstore.supplementstore.repositories.userrespository;

@Service
public class loginservice {
	
	@Autowired
	public userrespository userrep;
	
	public Users authUserByData(String username, String password) {
	
	List<Users> userList=userrep.findByUsernameAndPassword(username,password);
	if(userList.size()==1) {
		   System.out.println("User found!");
		return userList.get(0);
	} else {
        System.out.println("No matching user.");

		return null;
	
	}
}
	
}
	
