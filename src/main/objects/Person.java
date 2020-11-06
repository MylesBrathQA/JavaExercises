package main.objects;

public class Person {
	
	// Attributes
	private String name = "undefined";
	private int age = 0;
	
	//Constructors
	public Person(){
		System.out.println("Person has been made");
	}
	//Overload Constructors
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Methods
	
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
	
}
