package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/test")
	public String test() throws Exception {
		String result = helloService.sayHello();
		return result;
	}

}
