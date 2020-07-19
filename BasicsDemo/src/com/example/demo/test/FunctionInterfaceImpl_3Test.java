package com.example.demo.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author ADMIN
 *
 */
public class FunctionInterfaceImpl_3Test {
	/**
	 * 
	 * basicall converting a list to map using Function of Java 8
	 * @param args
	 */
	
	public static void main(String[] args) {

		FunctionInterfaceImpl_3Test obj = new FunctionInterfaceImpl_3Test();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        // lambda
        Map<String, Integer> map = obj.convertListToMap(list, x -> x.length());

        System.out.println(map);    // {node=4, c++=3, java=4, javascript=10}

        // method reference
        Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);

        System.out.println(map2);
    }
	
	  public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

	        Map<T, R> result = new HashMap<>();
	        for (T t : list) {
	            result.put(t, func.apply(t));
	        }
	        return result;

	    }

	    public Integer getLength(String str) {
	        return str.length();
	    }
}
