package com.supplementstore.supplementstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supplementstore.supplementstore.entites.Users;

@Controller
@RequestMapping("/login")
public class logincontroller {

	@RequestMapping("/login")
	public String showlog(Model m){
		m.addAttribute("user", new Users());
		return "login";
		
	}
}