package com.software.com;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----#######---------- ABC Software -------#######--------");
		
		System.out.println("Do you have an existeing account");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("yes")) {
			Login l = new Login();
			System.out.println("Login process of the customer needed ");
			l.login();
		}
		else {
			Registration r = new Registration();
			System.out.println("Registration of the Customer started ");
			r.register();
			
			Login l = new Login();
			System.out.println("Login process of the customer needed ");
			l.login();
		}
		
		Customer c = new Customer();
		if(c.getRadius() < 2) {
			Restaurant res = new Restaurant();
			System.out.println("Lets find the best hotel nearby you");
			res.locate1();
		}
		else if(c.getRadius() < 3){
			Restaurant res = new Restaurant();
			System.out.println("Lets find the best hotel nearby you");
			res.locate2();
		}
		else {
			Restaurant res = new Restaurant();
			System.out.println("Lets find the best hotel nearby you");
			res.display();
		}
		sc.close();
	}
	
}
