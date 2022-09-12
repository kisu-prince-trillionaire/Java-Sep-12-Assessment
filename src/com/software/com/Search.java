package com.software.com;

import java.util.Map;
import java.util.Scanner;

public class Search extends Restaurant {
	private double longitude;
	private double lattitude;
	public double radius;
	
	public Search() {
	}
	
	public Search(double longitude, double lattitude, double radius) {
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

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the longitude ");
	longitude = sc.nextDouble();
	System.out.println("Enter the lattitude ");
	lattitude = sc.nextDouble();
	radius = (longitude + lattitude)/2;
	
	public void searchRest() {
		if(radius < 2) {
			
		}
		
	}
}
