package com.smart.springlearning.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTaskService {
	
	@Async //1
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务: "+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1: "+(i+1));
    }
    
    @Async
    public void executeAsyncTaskForSleep(Integer i){
        System.out.println("执行异步睡眠任务 时间为： " + i);
        try {
			Thread.sleep(i*500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("我睡醒了 - " + i);
    }

}
