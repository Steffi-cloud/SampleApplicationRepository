package com.test.springprimary;

public class OrderService {
	private Dao dao;

    public void placeOrder(String orderId) {
        System.out.println("placing order " + orderId);
        dao.saveOrder(orderId);
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
