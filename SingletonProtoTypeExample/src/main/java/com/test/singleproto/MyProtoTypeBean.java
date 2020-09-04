package com.test.singleproto;

import java.time.LocalDateTime;

public class MyProtoTypeBean {
	 private String dateTimeString = LocalDateTime.now().toString();

	    public String getDateTime() {
	        return dateTimeString;
	    }
}
