package com.test.springprimary;

public class DaoA implements Dao {

	 public void saveOrder(String orderId) {
	        System.out.println("DaoA Order saved " + orderId);
	    }

}
