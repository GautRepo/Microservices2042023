package com.nt.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class BranchController {
	
	@Autowired
	private DiscoveryClient client;
	
	
	public String communicateWithBranch() {
		List<ServiceInstance> list =client.getInstances("BRANCH-SERVICE");
		ServiceInstance si = list.get(0);
		
		URI uri = si.getUri();
		String path = "/branch";
		String url = uri +path;
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.getForEntity(url, String.class);
		
		return re.getBody();
		
	}
	

}
