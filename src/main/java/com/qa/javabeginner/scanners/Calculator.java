package com.qa.javabeginner.scanners;

import java.util.Scanner;

public class Calculator {
	//Attributes
	private Scanner scan;
	private double result; 
	
	//Constructors
	public Calculator(Scanner scan) {
		this.scan = scan;
	}
	
	//Methods
	public double add(double a, double b) {
		return a + b;
	}
	
	public double subtraction(double a, double b) {
		return a - b;
	}
	
	public double multiplication(double a, double b) {
		return a * b;
	}
	
	public double division(double a, double b) {
		return a / b;
	}
	
	public void start() {
		String userInput;
		int a;
		int b = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.println("What Operation would you like to use? \n" +
					"1. Addition \n" +
					"2. Suntraction \n" +
					"3. Multiplication \n" +
					"4. Division \n" +
					"5. Exit Application \n");
			
			userInput = scan.next();
			
			switch(Integer.parseInt(userInput)) {
				case 1:
					System.out.println("What are the two numbers sepearated with a \" \"? \n");
					a = Integer.parseInt(scan.next());
					b = Integer.parseInt(scan.next());
					result = this.add(a, b);
					System.out.println(result);
					break;
				case 2:
					System.out.println("What are the two numbers sepearated with a \" \"? \n");
					a = scan.nextInt();
					b = scan.nextInt();
					result = this.subtraction(a, b);
					System.out.println(result);
					break;
				case 3:
					System.out.println("What are the two numbers sepearated with a \" \"? \n");
					a = scan.nextInt();
					b = scan.nextInt();
					result = this.multiplication(a, b);
					System.out.println(result);
					break;
				case 4:
					System.out.println("What are the two numbers sepearated with a \" \"? \n");
					a = scan.nextInt();
					b = scan.nextInt();
					result = this.division(a, b);
					System.out.println(result);
					break;
				case 5:
					System.out.println("Exiting Application");
					flag = false;
					break;	
			}
			
		}
	}
	
	
}
