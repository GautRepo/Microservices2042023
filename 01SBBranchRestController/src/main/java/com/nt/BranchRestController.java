package com.nt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchRestController {
	
	@GetMapping("/branch")
	public String show() {
		return "From branch controller";
	}

}
