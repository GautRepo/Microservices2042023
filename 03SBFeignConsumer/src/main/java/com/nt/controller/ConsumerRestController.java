package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Brand;

@RestController
public class ConsumerRestController {
	
	@Autowired
	private BrandConsumer controller;
	
	@GetMapping("/show")
	public String getMsgs() {
		return controller.getMsg(" HELLO") + " 2nd "
				+controller.getObj() + " 3rd "+ controller.getList();
		
	}
	
	@PostMapping("/postMsg")
	public ResponseEntity<String> postMsg(){
		return controller.saveBrand();
	}
	
	@PostMapping("/save")
	public String getSaveMsg(@RequestBody Brand brand) {
		return "FROM-Product=>" + controller.printCode(brand);
	}

}
