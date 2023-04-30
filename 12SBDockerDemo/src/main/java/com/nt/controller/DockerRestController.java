package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
	
	@GetMapping("/")
	public String getMsg() {
		return "FROM REST CONTROLLER";
	}

}
