package com.example.demo.test;

import java.util.List;

public class FunctionInterfaceImpl_2 {
	 static Integer addList(List<Integer> list){  
	        return list.stream()  
	                   .mapToInt(Integer::intValue)  
	                   .sum();  
	    }  
}
