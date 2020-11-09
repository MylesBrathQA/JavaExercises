package main;

import main.objects.Arrays;
import main.objects.Iterations;
import main.oop.model.Lion;
import main.oop.model.Snake;

public class Runner {
	public static void main(String[] args) {
		//Hello World Task
		//System.out.println(HelloWorld.myMessage());
		
		//Flow of Control Task
		//FlowOfControl.start();
		
		//Operators Task
		
		//Iterations Task
		Iterations.start();
		
		//Array Task
		Arrays.start();
		
		//Person Task
		//Encapsulator.initPerson();
		
		//Inheritance Task
		Lion simba = new Lion();
		System.out.println(simba.isRoar());
		Snake snake = new Snake("Snake", false, 3);
		snake.bite();
	}
}
