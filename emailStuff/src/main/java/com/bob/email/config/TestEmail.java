package com.bob.email.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestEmail {
	
	@Autowired
	private EmailConfig config;
	
	
	public void str() throws IOException {
		config.emails();
	}

}
