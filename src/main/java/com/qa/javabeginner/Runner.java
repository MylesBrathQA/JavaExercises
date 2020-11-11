package main;

import java.util.Scanner;

import main.scanners.Calculator;
import main.scanners.StaffManagment;

public class Runner {
	//Attributes
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		//Hello World Task
		//System.out.println(HelloWorld.myMessage());
		
		//Flow of Control Task
		//FlowOfControl.start();
		
		//Operators Task
		
		//Iterations Task
		//Iterations.start();
		
		//Array Task
		//Arrays.start();
		
		//Person Task
		//Encapsulator.initPerson();
		
		//Inheritance Task
		//Lion simba = new Lion();
		//System.out.println(simba.isRoar());
		//Snake snake = new Snake("Snake", false, 3);
		//snake.bite();
		
		
		//Scanner Task
			//Calculator Task
		Calculator calc = new Calculator(scan);
		calc.start();
		
			//Person Task
		StaffManagment people = new StaffManagment(scan);
		people.menu();
		scan.close();
		
		
		
	}
}
