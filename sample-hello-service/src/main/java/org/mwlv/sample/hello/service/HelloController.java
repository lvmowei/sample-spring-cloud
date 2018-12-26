package org.mwlv.sample.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/hello")
	public String index() {
		ServiceInstance instance = client.getLocalServiceInstance();
		log.info("/hello，host：{}，service_id：{}", instance.getHost(), instance.getServiceId());
		return "hello";
	}

}
