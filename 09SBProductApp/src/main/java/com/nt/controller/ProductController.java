package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/msg")
	public String getMsg() {
		return "From prod app "+port;
	}

}
