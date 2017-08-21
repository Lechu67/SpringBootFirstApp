package com.springboot.web.springbootfirstwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.web.springbootfirstwebapp.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage( Model model){
		//model.addAttribute("name", name);
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name,@RequestParam String password, Model model){
		
		if(!service.validateUser(name, password)){
			model.addAttribute("errorMessage", "Invalid username or password");
			return "login";
		}
		
		model.addAttribute("name", name);
		model.addAttribute("password",password);
		return "welcome";
	}
}
