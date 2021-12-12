package com.example.demo.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/airport")
public class AirportApplicationResource {
	@RequestMapping("/hello")
	public Object hello() {
	return "Hello World For Airport";
	}

}
