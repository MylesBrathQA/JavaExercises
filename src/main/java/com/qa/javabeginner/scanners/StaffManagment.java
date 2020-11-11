package com.qa.javabeginner.scanners;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.javabeginner.oop.model.Person;

public class StaffManagment {
	//Attributes
	ArrayList<Person> membersOfStaff = new ArrayList<>();
	private final Person jill = new Person("Jill", 25, "DevOps");
	private final Person myles = new Person("Myles", 22, "SDET");
	private final Person john = new Person("John", 30, "Project Manager");
	private Scanner scan;
	private String name;
	private String jobTitle;
	private int age;
	private int userInput;
	
	
	//Constructor
	public StaffManagment(Scanner scan) {
		membersOfStaff.add(jill);
		membersOfStaff.add(myles);
		membersOfStaff.add(john);
		this.scan = scan;
	}
	
	//Methods
	public void getPeople() {
		for(Person handle : membersOfStaff) {
			System.out.println(handle.toString());
		}
	}
	
	public void findPerson(String name) {
		for(Person handle : membersOfStaff) {
			if(handle.getName().equals(name)) {
				System.out.println(handle.toString()); 
			}
		}
	}
	
	public void createPerson() {
		System.out.println("Please enter the following details: name, age, job title (please only use spaces)");
		scan.nextLine();
		
		//loop the users entry
			this.name = scan.next();
			this.age = Integer.parseInt(scan.next());
			this.jobTitle = scan.next();

		
		membersOfStaff.add(new Person(this.name, this.age, this.jobTitle));
	}
	
	public void menu() {
		boolean flag = true;
	
		
		while(flag) {
			System.out.println("\n\n What would you like to do? \n" +
					"1. Get all People \n" +
					"2. Find Someone \n" +
					"3. Add Someone New \n" +
					"4. Exit \n");
			
			userInput = scan.nextInt();
			switch(userInput){
			case 1:
				getPeople();
				break;
			case 2:
				System.out.println("What is their First Name?");
				name = scan.next();
				findPerson(name);
				break;
			case 3:
				createPerson();
				break;
			case 4:
				System.out.println("Exiting");
				flag = false;
				break;
			}
			
		}
		System.out.println("Logging Out");
	}
}