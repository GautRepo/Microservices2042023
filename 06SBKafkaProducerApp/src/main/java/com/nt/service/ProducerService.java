package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String,String> template;
	
	@Value("${my.app.tpc}")
	private String topicName;
	
	public void sendMessage(String message) {
		template.send(topicName, message);
	}
	
}
