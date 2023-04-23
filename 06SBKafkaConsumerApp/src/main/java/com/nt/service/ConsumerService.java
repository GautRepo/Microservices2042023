package com.nt.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
	
	@KafkaListener(topics = "${my.app.tpc}",groupId = "groupId")
	public void consumeMessage(String message) {
		System.out.println(message);
	}

}
