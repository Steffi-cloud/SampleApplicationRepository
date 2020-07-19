package com.example.demo.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionalFunctionInterfaceImpl_6Test {
	 public static void main(String[] args) {

	        // Math.pow(a1, a2) returns Double
	        BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);

	        // takes Double, returns String
	        Function<Double, String> func2 = (input) -> "Result : " + String.valueOf(input);

	        String result = func1.andThen(func2).apply(2, 4);

	        System.out.println(result);

	    }
}
