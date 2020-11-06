package main;

import java.util.ArrayList;

public class Arrays {
	public static ArrayList<Integer> arrayDefiningMethod1(int len) {
		ArrayList<Integer> newArray = new ArrayList<>();

		for (int x = 0; x < (len); x++) {
			newArray.add(x);
		}
		return newArray;
	}

	public static void exerciseOne() {
		ArrayList<Integer> arrayOne = arrayDefiningMethod1(10);

		for (int item : arrayOne) {
				System.out.println(item);
		}
	}
	
	public static void exerciseTwo() {
		ArrayList<Integer> arrayTwo = new ArrayList<>();
		
		System.out.println("Here is an empty array: " + arrayTwo);
		
		for(int x=0; x<10; x++) {
			arrayTwo.add(x);
			System.out.println(x + " has been added.");
		}
		
		System.out.println("Here's the Populated Array: " + arrayTwo);
		
		for(int item : arrayTwo){
			arrayTwo.set((item), item*10);
			System.out.println(arrayTwo.get(item));
		}
		
		
	}

	public static void main(String[] args) {
		exerciseTwo();

	}

}
