package com.smart.springlearning.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher dp = ctx.getBean(DemoPublisher.class);
		dp.publish("how are you");
		System.out.println("Hello");

	}

}
