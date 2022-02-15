package com.bam.broker.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class Consumer {
	
	@KafkaListener(topics="BAM-1", groupId="BAMgroup")
	public void consumerFromTopic(String message) {
		System.out.println("Consummed message"+message);
	}
	

}