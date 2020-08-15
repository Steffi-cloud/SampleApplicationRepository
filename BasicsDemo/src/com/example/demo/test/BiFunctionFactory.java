package com.example.demo.test;

import java.util.function.BiFunction;

public class BiFunctionFactory {
	 public static void main(String[] args) {

	        GPS obj = factory("40.741895", "-73.989308", GPS::new);
	        System.out.println(obj);

	    }

	    public static <R extends GPS> R factory(String Latitude, String Longitude,
	                                            BiFunction<String, String, R> func) {
	        return func.apply(Latitude, Longitude);
	    }
}
