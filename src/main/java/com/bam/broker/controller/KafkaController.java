package com.bam.broker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bam.broker.service.Producer;

// For testing handshake and event producing consuming messges


@RestController
@RequestMapping("/Kafkaapp")
public class KafkaController {
	
@Autowired
Producer producer;

@PostMapping(value="/post")

public void sendMessage(@RequestParam("msg") String msg)
{ producer.publishToTopic(msg);
	}


}
