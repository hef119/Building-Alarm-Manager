package com.bam.broker.controller;


	
	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bam.broker.service.ProducerBsids;

// Building Security and Intrusion Detection System Controller

@RestController
@RequestMapping("/BAM-BSIDS")
public class ControllerBsids implements ControllerBamAreaInterface {
	public void sendMessage() {}
	
@Autowired
ProducerBsids producerBesids;
@PostMapping(value="/post")


public void sendMessage(@RequestParam("msg") String msg)
{ producerBesids.publishToTopic(msg);
	}



}
