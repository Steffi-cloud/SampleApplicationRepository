package com.example.demo.test;

public class GPS {
	String Latitude;
    String Longitude;
	public GPS(String latitude, String longitude) {
		super();
		Latitude = latitude;
		Longitude = longitude;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	
	public String toString() {
		return "latitude is" + Latitude+"longitude is"+ Longitude;
	}
}
