package com.example.rest;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class HelloWorld {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/user")
	public String user(Principal user) {
		return "logged in user is "+ user.getName();
	}

}
