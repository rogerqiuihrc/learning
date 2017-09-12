package com.smart.springlearning.aware;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
//import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware,BeanFactoryAware{//1
	
	private String beanName;
	private ResourceLoader loader;
	private BeanFactory factory;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {//2
		this.loader = resourceLoader;
	}

	public void setBeanName(String name) {//3
		this.beanName = name;
	}
	
	public void outputResult() throws IOException{
		System.out.println("BeanµÄÃû³ÆÎª£º" + beanName);
		
		Resource resource = 
				loader.getResource("classpath:com/smart/springlearning/aware/test.txt");
		System.out.println("Bean factory: " + factory.toString());
	
	
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory = beanFactory;
		
	}

}
