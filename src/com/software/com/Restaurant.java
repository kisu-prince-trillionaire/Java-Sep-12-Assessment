package com.software.com;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
	
	public static void main(String args[]){  
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(6,"raja hotel");
	map.put(3,"maha hotel");
	map.put(1,"maharaja hotel");
	map.put(1,"kings hotel");
	map.put(4,"queens hotel");
	map.put(5,"papa hotel");
	map.put(1,"mummy hotel");
	map.put(1,"sarkar hotel");
	map.put(6,"pasta hotel");
	map.put(5,"chai hotel");
	map.put(2,"rupa hotel");
	map.put(3,"tasty hotel");
	map.put(2,"masti hotel");
	map.put(1,"acha hotel");
	map.put(2,"rainbow hotel");
	map.put(6,"ragini hotel");
	map.put(3,"sir hotel");
	map.put(1,"mba wala hotel");
	
	public void searchHotel() {
		int noOfHotels = 0;
		for(Map.Entry m : map.entrySet()) {
			if(m.getKey() < 2) {
				System.out.println("The hotels nearby you are "+m.getValue());
				noOfHotels++;
			}
		}
		if(noOfHotels < 5) {
			for(Map.Entry m : map.entrySet()) {
				if(m.getKey() < 2) {
					System.out.println("The hotels nearby you are "+m.getValue());
					noOfHotels++;
				}
			}
		}
	}
	   
  }
}
