package com.example.demo.adapter;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class BackendAdapterImpl implements BackendAdapter {

	@Override
	public String getBackendResponse(boolean simulateretry, boolean simulateretryfallback) {
		// TODO Auto-generated method stub
		 if (simulateretry) {
	            System.out.println("Simulateretry is true, so try to simulate exception scenario.");
	 
	            if (simulateretryfallback) {
	                throw new RemoteServiceNotAvailableException(
	                        "Don't worry!! Just Simulated for Spring-retry..Must fallback as all retry will get exception!!!");
	            }
	            int random = new Random().nextInt(4);
	 
	            System.out.println("Random Number : " + random);
	            if (random % 2 == 0) {
	                throw new RemoteServiceNotAvailableException("Don't worry!! Just Simulated for Spring-retry..");
	            }
	        }
	 
	        return "Hello from Remote Backend!!!";
	}

	@Override
	public String getBackendResponseFallback(RuntimeException e) {
		// TODO Auto-generated method stub
		  System.out.println("All retries completed, so Fallback method called!!!");
	        return "All retries completed, so Fallback method called!!!";
	}

}
