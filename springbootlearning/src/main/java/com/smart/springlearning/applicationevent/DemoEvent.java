package com.smart.springlearning.applicationevent;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	private String _msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		setMsg(msg);
		
	}
	public String getMsg() {
		return _msg;
	}
	public void setMsg(String _msg) {
		this._msg = _msg;
	}

}
