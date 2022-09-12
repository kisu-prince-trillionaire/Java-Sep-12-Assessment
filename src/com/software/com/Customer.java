package com.software.com;

import java.util.Scanner;

public class Customer {
	public double longitude;
	public double lattitude;
	public double radius;
	
	public Customer() {
		System.out.println("Please provide the right lattitude and longitude !");
	}
	
	public Customer(double longitude, double lattitude, double radius) {
		super();
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.radius = radius;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	
	public double getRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the longitude ");
		longitude = sc.nextDouble();
		System.out.println("Enter the lattitude ");
		lattitude = sc.nextDouble();
		radius = (longitude + lattitude)/180;
		return radius;
	}

}
