package main.oop.model;

public class Animal {
	
	//=============================
	//Attributes
	//=============================
	protected String species = " ";
	protected int numberOfLegs = 0;
	protected boolean speak = true;
	protected boolean running = false;
	protected boolean canRun = false;
	
	//=============================
	//Constructor
	//=============================
	
	public Animal() {
		super();
		this.species = " ";
		this.numberOfLegs = 0;
		this.speak = true;
		this.running = false;
		this.canRun = false;
		
	}
	
	public Animal(String species, boolean speak, int numberOfLegs){
		super();
		this.species = species;
		this.numberOfLegs = numberOfLegs;
		this.speak = speak;
	}
	
	//=============================
	//Methods
	//=============================

	public void speak() {
		if(speak = true) {
			System.out.println("This " +this.species + " can speak");
		} else {
			System.out.println("This " + this.species + " can not speak");
		}
	}
	
	public boolean run() {
		if(numberOfLegs >= 2) {
			this.running = true;
			return running;
		} else {
			return running;
		}
	}

	//=============================
	//Getters and Setters
	//=============================
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public boolean isSpeak() {
		return speak;
	}

	public void setSpeak(boolean speak) {
		this.speak = speak;
	}

	public boolean isCanRun() {
		return canRun;
	}

	public void setCanRun(boolean canRun) {
		this.canRun = canRun;
	}

	public boolean isRunning() {
		return running;
	}
	
	
}
