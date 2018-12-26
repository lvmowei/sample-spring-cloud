package org.mwlv.sample.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/hello")
	public String helloConsumer() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
	}

}
