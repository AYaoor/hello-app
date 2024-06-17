package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.custom.config.HelloProperties;
import com.custom.service.HelloService;
import com.demo.utils.IpUtil;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
	
	@Autowired
	private HelloProperties helloProperties;
	
	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService() {
		HelloService helloService = new HelloService();
		helloProperties.setContent(helloProperties.getContent() + "-" +IpUtil.getIpAddr());
		helloService.setHelloProperties(helloProperties);
		return helloService;
	}
	
}
