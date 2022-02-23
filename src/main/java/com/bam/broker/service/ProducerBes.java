package com.bam.broker.service;

// Read alarm from building areas thru Kafka broker

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
@Qualifier("producerBes")
public class ProducerBes {
	public static final String topic = "BAM-1";
	@Autowired 
	private KafkaTemplate<String, String> kafkaTemp;// for checking

	public void publishToTopic (String message) {
		// Test first producer for the BAM system
		
	System.out.println("BAM-ES: ELECTRICAL SYSTEM SENDS ALARM TO "+topic);
	this.kafkaTemp.send(topic, message);
	
	}
	

	
}
