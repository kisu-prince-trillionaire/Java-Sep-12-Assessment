package com.software.com;

import java.util.Scanner;

public class Customer {
	private String name;
	private String email;
	private long phoneNo;
	private String userName;
	private String password;
	public Customer() {
		System.out.println("Try Logging in with the right credentials !");
	}
	
	public Customer(String name, String email, long phoneNo) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Customer(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	System.out.println("Registration process Started ");
    public void register() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Registration page");
        System.out.print("Enter your name:");
        String name=sc.next();
        System.out.print("Enter your email id: ");
        String email=sc.next();
        System.out.print("Enter your mobile number: ");
        double phoneNo=sc.nextLong();
        System.out.println("Name : " + name + " Email : " + email + " Phone No : " + phoneNo);
        System.out.println("\n Hello " + name+ " ! \n Registration successful");
    }
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username : ");
		userName = sc.next();
		System.out.println("Enter your password : ");
		password = sc.next();
		System.out.println("Login Successful");
	}

	
}
