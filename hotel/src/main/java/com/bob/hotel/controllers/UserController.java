package com.bob.hotel.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bob.hotel.model.User;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class UserController {
	
	@RequestMapping( value="/reg", method=RequestMethod.POST)
	public String userSignUp(@RequestBody User user) {
		System.out.println(user.getEmail());
		
		return "SignupSuccessful";
		
	}

}
