package com.nt.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.Brand;

@FeignClient(name="PRODUCER-APP")
public interface BrandConsumer {

	@GetMapping("/msg/{code}")
	public String getMsg(@PathVariable("code") String code);
	
	@GetMapping("/obj")
	public Brand getObj();
	
	@GetMapping("/list")
	public List<Brand> getList();
	
	@PostMapping("/code")
	public ResponseEntity<String> saveBrand();
	
	@PostMapping("/save")
	public ResponseEntity<String> printCode(@RequestBody Brand brand );
}
