package com.bob.email.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bob.email.config.TestEmail;

@RestController
public class EmailController {
	
	@Autowired
	private TestEmail test;
	
	@RequestMapping("/")
	public String emailshit() throws IOException {
		test.str();
		return "email sent";
	}

}
