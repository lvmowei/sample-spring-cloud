package org.mwlv.sample.feign.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class ConsumerController {

	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/hello")
	public String helloConsumer() {
		return helloService.hello();
	}

}
