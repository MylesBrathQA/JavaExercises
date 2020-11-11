package main.oop;

import java.util.ArrayList;

import main.oop.model.Person;

public class Encapsulator {
	// Person Task
	public static void initPerson() {
	ArrayList<Person> people = new ArrayList<>();
	
	people.add(new Person("Bob", 25, "Software Developer"));
	people.add(new Person("Barbara", 34, "Senior DevOps Engineer"));
	people.add(new Person("Jake", 21, "Junior DevOps Engineer"));
	people.add(new Person("Rex", 18, "Student Intern"));
	people.add(new Person("Jill", 25, ""));
	people.add(new Person("Myles", 22, "SDET"));
	people.add(new Person("John", 30, ""));
	
	for(Person item: people) {
		System.out.println("This is " + item.getName() + " and they are " + item.getAge() + " years old");
		}
	}
}
		
		
		
		


