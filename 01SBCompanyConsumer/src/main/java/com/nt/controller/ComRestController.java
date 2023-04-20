package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComRestController {
	
	@Autowired
	private BranchController controller;
	
	@GetMapping("/show")
	public String getBranch() {
		return controller.communicateWithBranch();
	}

}
