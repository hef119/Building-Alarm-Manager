package com.bam.broker.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
@Qualifier ("consumerbes")

public class ConsumerBes implements BamAreas {
	
	@KafkaListener(topics="BAM-1", groupId="BAMgroup-3")
	public void BesFromTopic(String message) {
		System.out.println("Consumer: BES acknowledged alarm Received" + message);
	}
	

	public void name() {
	}


}
