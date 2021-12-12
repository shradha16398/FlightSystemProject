package com.example.passenger.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/passanger")
public class PassengerResource {

	
	@RequestMapping("/hello")
	public Object hello() {
	return "Hello World For passanger";
	}

}
