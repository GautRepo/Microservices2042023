package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@Value("${server.port}")
	public int port;
	
	@GetMapping("/msg")
	public String getMsg() {
		return "From Demo app "+ port;
	}

}
