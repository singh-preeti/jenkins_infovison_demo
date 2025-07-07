package com.demo;

public class Employee {
	
	public void getAddress(int road_no,String street_name,String city) {
		String address = road_no + street_name + city;
		System.out.println(address);
	}

	
	public static void main(String[] args) {
		Employee add = new Employee();
		add.getAddress(1, "Lokhandwala"," Mumbai");
	}
}
