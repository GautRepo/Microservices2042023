package com.nt.AddRestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressRestController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/addr")
	public String getAdd() {
		return "From add "+port;
	}

}
