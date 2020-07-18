package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceImpl_2Test {
	public static void main(String[] args) {  
        // Creating a list and adding values  
        List<Integer> list = new ArrayList<Integer>();  
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);  
        // Referring addList() method  
        Function<List<Integer>, Integer> fun = FunctionInterfaceImpl_2::addList;  
        // Calling Function interface method  
        int result = fun.apply(list);  
        System.out.println("Sum of list values: "+result);  
    }  
}
