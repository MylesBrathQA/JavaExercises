package com.qa.javabeginner.oop.model;

public class Lion extends Animal {
	//=============================
	//Attributes
	//=============================
	
	protected boolean roar = true;
	
	//=============================
	//Constructor
	//=============================
	
	public Lion() {
		super();
		this.numberOfLegs = 4;
		this.speak = true;
		this.species = "Lion";
		this.canRun = true;
	}

	//=============================
	//Methods
	//=============================
	public boolean isRoar() {
		if(this.speak = true) {
			return roar;
		} else {
			return false;
		}
	}
	
}
