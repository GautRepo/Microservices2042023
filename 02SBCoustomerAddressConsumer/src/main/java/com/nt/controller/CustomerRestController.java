package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@Autowired
	private AddressConsumer consumer;
	
	@GetMapping("/getAddr")
	public String callAddress() {
		return consumer.getAddress();
	}

}
