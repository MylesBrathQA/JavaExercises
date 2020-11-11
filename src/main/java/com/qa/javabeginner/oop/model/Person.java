package com.qa.javabeginner.oop.model;

public class Person {
	
	//Statics
	private static int generatedID = 0;
	
	// Attributes
	private String name = "undefined";
	private int age = 0;
	private String jobTitle = "???";
	private String personalDetails;
	private int id;
	
	//Constructors
	public Person(){
		System.out.println("Person has been made");
	}
	//Overload Constructors
	public Person(String name) {
		this.id = generateID();
		this.name = name;
	}
	
	public Person(String name, int age, String jobTitle) {
		this.id = generateID();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	//Methods
	
	private int generateID() {
		return ++Person.generatedID;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		personalDetails ="ID: " + id  + " | Name: " + name + " | Age: "  + String.valueOf(age) + " Years Old " + " | Job Title: " + jobTitle;
		return personalDetails;
		
	}
}
