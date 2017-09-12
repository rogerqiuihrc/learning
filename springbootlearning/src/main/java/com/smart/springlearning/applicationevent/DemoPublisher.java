package com.smart.springlearning.applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext appContext;
	public void publish(String msg) {
		appContext.publishEvent(new DemoEvent(this,msg));
	}
	

}
