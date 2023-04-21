package com.nt.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	
	public String getAddress() {
		ServiceInstance si =client.choose("ADDRESS-SERVICE");
		
		URI uri =si.getUri();
		
		String path="/addr";
		
		String url = uri+path;
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
		
	}

}
