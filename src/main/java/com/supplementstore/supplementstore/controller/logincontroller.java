package com.supplementstore.supplementstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class logincontroller {

	@RequestMapping("/login")
	public String showlog(){
	
		return "login";
		
}
}