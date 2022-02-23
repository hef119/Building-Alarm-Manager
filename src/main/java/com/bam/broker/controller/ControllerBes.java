package com.bam.broker.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bam.broker.service.ProducerBes;

//// Building Electrical System controller


@RestController
@RequestMapping("/BAM-ES")
@Component
public class ControllerBes implements ControllerBamAreaInterface {
	public void sendMessage() {}
	
@Autowired
ProducerBes producerBes;
@PostMapping(value="/post")


public void sendMessage1(@RequestParam("msg") String msg)
{ producerBes.publishToTopic(msg);
	}



}

