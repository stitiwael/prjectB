package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	
	
	@RequestMapping( path = "/hello")
	public String sayHello() {
		return ("hello world");
		
	}
	
	@RequestMapping( path = "/hello/{value}")
	public String sayHelloName(@PathVariable("value") String name) {
		return ("hello "+name+"!");
		
	}

}
