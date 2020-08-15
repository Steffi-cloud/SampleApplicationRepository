package com.example.demo.test;

import java.util.function.Function;

public class FunctionInterfaceImpl_1Test {
	public static void main(String[] args) {  
        // Function interface referring to a method  
        Function<String, String> fun = FunctionInterfaceImpl_1::show;  
        // Calling Function interface method  
        System.out.println(fun.apply("Peter"));  
    }  
}
