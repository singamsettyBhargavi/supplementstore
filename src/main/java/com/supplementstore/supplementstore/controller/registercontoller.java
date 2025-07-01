package com.supplementstore.supplementstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supplementstore.supplementstore.entites.Users;

@Controller
public class registercontoller {

	@RequestMapping("/register")
	public String Showreg() {
		return "register";
	}
	@PostMapping("//dashboard")
	public String authuser(@ModelAttribute Users user) {
		return "login";
		
	}
	
	@PostMapping("/regsuccess")
	public String authusers(@ModelAttribute Users user) {
	    return "dashboard"; 
	}
	
}
	
