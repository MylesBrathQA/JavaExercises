package main.objects.operators;

public class Results {
	private double physics;
	private double chemistry;
	private double biology;
	private double physicsPercentage = this.physics/150;
	private double chemistryPercentage = this.chemistry/150;
	private double biologyPercentage = this.biology/150;
		
		
	public void studentResults() {
		System.out.println("Here are your results!");
		System.out.println("You scored: " + this.physics + " in Physics");
		System.out.println("You scored: " + this.chemistry + " in Chemistry");
		System.out.println("You scored: " + this.physics + " in Physics");
		System.out.println("You scored: " + this.biology + " in Biology");
	}

	// Getters and Setters
	public double getPhysics() {
		return physics;
	}


	public void setPhysics(double physics) {
		this.physics = physics;
	}


	public double getChemistry() {
		return chemistry;
	}


	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}


	public double getBiology() {
		return biology;
	}


	public void setBiology(double biology) {
		this.biology = biology;
	}


	public double getPhysicsPercentage() {
		return physicsPercentage;
	}

	public double getChemistryPercentage() {
		return chemistryPercentage;
	}


	public double getBiologyPercentage() {
		return biologyPercentage;
	}

}
