package com.software.com;

public class Restaurant {
	enum RestaurantNames{
		TAJ_HOTEL(1), MONALISA(2), RAJA_HOTEL(3), ITC(4), MAHINDRA(5), DHABA(6), SANITORIUM(1), ROYAL_BIRYANI(1),
		BOMBAY_TIGER(2), TAMARIND(1), VARUSKA(1),  TINCHU(2), PICHKU(2), MUMBAI_CHEF(4), NAMASTE(2);
		private int num;
		private RestaurantNames(int num) {
			this.num = num;
		}
	}
	
	public void locate1() {
		int count=0;
		
		for(RestaurantNames name: RestaurantNames.values()) {
			if(name.num < 2) {
				count++;
			}
		}
		if(count <= 5) {
			System.out.println("You have less than 5 hotels nearby 1.5 km !");
			System.out.println("Therefore showing you the hotels near by 2.5 km :-----");
			for(RestaurantNames name: RestaurantNames.values()) {
				if(name.num < 2.5) {
					System.out.print(name + " ");
				}
			}	
		}
		else {
			System.out.println("Hotels nearby 1.5 km is");
			for(RestaurantNames name: RestaurantNames.values()) {
				if(name.num < 2) {
					System.out.print(name + " ");
				}
			}
		}
	}
	
	public void locate2() {
		System.out.println("You have less than 5 hotels nearby you!");
		System.out.println("Therefore showing you the hotels near by 2.5 km :-----");
		for(RestaurantNames name: RestaurantNames.values()) {
			if(name.num < 2.5) {
				System.out.print(name + " ");
			}
		}		
	}
	
	public void display() {
		System.out.println("Sorry No Hotel found nearby 2.5 km, So displaying all the hotels in your city !");
		for(RestaurantNames name: RestaurantNames.values()) {
				System.out.println("Hotel name : " + name + "Distance : " + name.num + " km ");
		}
	}
	
}
