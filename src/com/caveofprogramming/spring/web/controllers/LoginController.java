package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping( value="/login",method=RequestMethod.GET)
	public String login() {
		System.out.println("logging in website");
		return "login";
	}
}
