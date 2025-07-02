package com.supplementstore.supplementstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.supplementstore.supplementstore.entites.Users;
import com.supplementstore.supplementstore.service.dashboardservice;
import com.supplementstore.supplementstore.service.loginservice;


@Controller

public class logincontroller {
	
	@Autowired
	public loginservice logservice;
	
	@Autowired
	public  dashboardservice dashservice;

	@RequestMapping("/login")
	public String showlog(){
	
		return "login";
		
}
	@PostMapping("/authUserByData")
	public String authUserByData(Model m, @RequestParam("username") String username, @RequestParam("password") String password) {
	Users loguser = logservice.authUserByData(username, password);
	if(loguser != null) {
		m.addAttribute("loguser",loguser);
		return "dashboard";
	}else {
		m.addAttribute("error", "Invalid username or password");
		return "login";
	}
	}
}
