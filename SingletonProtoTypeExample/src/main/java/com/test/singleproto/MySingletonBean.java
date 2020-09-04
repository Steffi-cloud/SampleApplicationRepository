package com.test.singleproto;

import org.springframework.beans.factory.annotation.Autowired;

public class MySingletonBean {
	  @Autowired
	    private MyProtoTypeBean prototypeBean;

	    public void showMessage(){
	        System.out.println("Hi, the time is "+prototypeBean.getDateTime());
	    }
}
