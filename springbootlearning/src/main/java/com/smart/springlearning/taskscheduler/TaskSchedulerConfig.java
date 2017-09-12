package com.smart.springlearning.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.smart.springlearning.taskscheduler")
@EnableScheduling //1
public class TaskSchedulerConfig {

}
