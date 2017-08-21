package com.springboot.web.springbootfirstwebapp.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

@Component
public class LoginService {
	
	public boolean validateUser(String userId, String password){
		//Leszek, Dummy
		return userId.equalsIgnoreCase("Leszek")&& password.equalsIgnoreCase("Dummy");
	}

}
