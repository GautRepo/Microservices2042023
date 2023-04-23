package com.nt.runner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner {
	
	
	@JmsListener(destination = "${my.queue.name}")
	public void read(String text) {
		System.out.println("Date from consumer "+text);
	}

}
