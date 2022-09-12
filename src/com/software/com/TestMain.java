package com.software.com;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("--------------- ABC Software ---------------");
		Customer c = new Customer();
		System.out.println("Registration of the Customer started ");
		c.register();
		System.out.println("Login process of the customer needed ");
		c.login();
		
		

	}

}
