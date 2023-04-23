package com.nt.runner;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class JmsRunner implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate template;
	
	@Value("${my.queue.name}")
	private String destinationName;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("producer started");
		String text = "Hello from producer App ..." +new Date();
		
		MessageCreator messageCreator = new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage(text);
			}
		};
		
		template.send(destinationName, messageCreator);

	}

}
