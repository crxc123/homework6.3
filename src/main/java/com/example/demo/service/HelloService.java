package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
    private RestTemplate restTemplate;
	public String showHello() {
		return restTemplate.getForEntity("http://servicea/hello", String.class).getBody();
	}
}
