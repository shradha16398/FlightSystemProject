package com.example.demo.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Flight")
public class FlightResource {

	
	@RequestMapping("/hello")
	public Object hello() {
	return "Hello World For flight";
	}
	}


