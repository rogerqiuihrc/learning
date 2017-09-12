package com.smart.springlearning.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("I receive the msg :" + msg);		
	}
}
