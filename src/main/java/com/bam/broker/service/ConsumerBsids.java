package com.bam.broker.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
@Qualifier ("consumerbsids")

public class ConsumerBsids implements BamAreas {

	
	@KafkaListener(topics="BAM-1", groupId="BAMgroup-1")
	public void BsidsFromTopic(String message) {
		System.out.println("Consumer: BSIDS acknowledged alarm Received" + message);
	}
	
	public void name() {
	}



}
