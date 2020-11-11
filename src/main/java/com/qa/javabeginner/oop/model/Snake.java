package com.qa.javabeginner.oop.model;

public class Snake extends Animal {
	 //Attributes
	private boolean venomous = true;
	
	//Constructors
	public Snake() {
		super();
		this.species = "Snake";
		this.speak = false;
		this.numberOfLegs = 0;
	}
	
	public Snake(String species, boolean speak, int numberOfLegs) {
		super(species, speak, numberOfLegs);
		
		
		if(numberOfLegs !=0) {
			System.out.println("This is not a snake, legs have been set to 0");
			this.numberOfLegs = 0;
		} else {
			this.numberOfLegs = numberOfLegs;
		}
				
	}

	//Methods
	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	
	public void bite() {
		if(this.venomous == true) {
			System.out.println("This bite is deadly");
		} else {
			System.out.println("This bite is harmless");
		}
	}
}
