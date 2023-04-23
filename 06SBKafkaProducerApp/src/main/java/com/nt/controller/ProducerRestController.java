package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.ProducerService;

@RestController
public class ProducerRestController {
	
	@Autowired
	private ProducerService service;
	
	@GetMapping("/send")
	public String sendMsg(@RequestParam String message) {
		service.sendMessage("From producer app " + message);
		return "DONE";
	}

}
