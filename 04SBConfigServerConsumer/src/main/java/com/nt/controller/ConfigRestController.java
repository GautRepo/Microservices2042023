package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {
	
	@Value("${my.app.name}")
	private String prop;
	
	@GetMapping("/info")
	private String showInfo() {
		return "FROM-CONDUMER "+prop;
	}

}
