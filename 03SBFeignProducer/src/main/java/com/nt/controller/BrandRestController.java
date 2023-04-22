package com.nt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Brand;

@RestController
public class BrandRestController {
	
	@GetMapping("/msg/{code}")
	public String getMsg(@PathVariable("code") String code) {
		return "FROM-BRAND"+ code;
	}
	
	@GetMapping("/obj")
	public Brand getObj() {
		return new Brand(55,"ABC",100000.40);
	}
	
	@GetMapping("/list")
	public List<Brand> getList(){
		
		return List.of(new Brand(1,"A",100000),
						new Brand(2,"B",20000),
						new Brand(3,"C",300000));
	}
	
	@PostMapping("/code")
	public ResponseEntity<String> saveBrand(){
		return new ResponseEntity<String>("Hello" ,HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> printCode(@RequestBody Brand brand ){
		return new ResponseEntity<String>(brand.toString(),HttpStatus.ACCEPTED);
	}

}
