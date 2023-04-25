package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystricxRestController {
	
	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod = "dodummyPay")
	public String doPayment() {
		Random rand = new Random();
        int a = rand.nextInt(20);
        if(a>10) {
        	throw new IllegalArgumentException("Out of range ");
        }else
        	System.out.println(a);
        
		return "Done "+a;
	}
	
	public String dodummyPay() {
		return "From fallback method ";
	}

}
