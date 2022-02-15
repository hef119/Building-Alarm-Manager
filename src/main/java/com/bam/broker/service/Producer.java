package com.bam.broker.service;

// Read alarm from building areas thru Kafka broker

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class Producer {
	public static final String topic = "BAM-1";
	@Autowired 
	private KafkaTemplate<String, String> kafkaTemp;
	
	public void publishToTopic (String message) {
		// Test first producer for the BAM system
		
	System.out.println("Publishing to topid "+topic);
	this.kafkaTemp.send(topic, message);
	
	}

}
