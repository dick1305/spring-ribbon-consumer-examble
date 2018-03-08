package com.spdb.cdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
@Autowired
private RestTemplate restTemplate;
@RequestMapping(value="/consumerHellWorld",method = RequestMethod.GET)
public String consumerHellWorld(String content) {
	return restTemplate.getForEntity("http://eureka-helloWorld/hellWorld?content="+content, String.class).getBody();
}
}
