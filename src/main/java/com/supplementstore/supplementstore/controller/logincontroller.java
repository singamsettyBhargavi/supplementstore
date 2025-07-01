package com.supplementstore.supplementstore.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.supplementstore.supplementstore.entites.Users;

@Controller

public class logincontroller {

	@RequestMapping("/login")
	public String showlog(){
	
		return "login";
		
	}
//	@PostMapping("/dashboard")
//	public String authloginusers(@ModelAttribute Users user) {
//	    return "welcome"; 
//	}
	
}