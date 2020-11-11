package com.qa.javabeginner.objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Iterations {
	public static void exerciseOne() {
		System.out.println("Exercise 1");
		for (int a = 100; a < 200; a++) {
			System.out.println(a);
		}

	}

	public static void exerciseTwo() {
		System.out.println("Exercise 2");
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println(a + ": -");
			} else {
				System.out.println(a + ": *");
			}
		}
	}

	//Additional Method for exercise 3
	private static void printNum(int n, int s) {
		if (n > 0) {
			System.out.println(s);
			printNum(n - 1, s);
		}
	}

	public static void exerciseThree() {
		System.out.println("Exercise 3");
		for (int a = 1; a < 11; a++) {
			printNum(a, a);
		}
	}

	public static void coinsTask(double cost) {
		System.out.println("Coins Exercise");
		double payment = 60;
		double current = payment - cost;
		System.out.println("This is your starting cost: £" + current);
		do {
			if (current / 10 >= 1) {
				current = current - 10;
				current = BigDecimal.valueOf(current).setScale(3, RoundingMode.HALF_UP).doubleValue();
				System.out.println("That's 1 £10 note, your current total is: £" + current);
			} else if (current / 5 >= 1) {
				current = (current - 5);
				current = BigDecimal.valueOf(current).setScale(3, RoundingMode.HALF_UP).doubleValue();
				System.out.println("That's 1 £5 note, your current total is: £" + current);
			} else if (current / (0.2) >= 1) {
				current = current - 0.2;
				current = BigDecimal.valueOf(current).setScale(3, RoundingMode.HALF_UP).doubleValue();
				System.out.println("That's 1 20p coin, your current total is: £" + current);
			} else if (current / 0.02 >= 1) {
				current = current - 0.02;
				current = BigDecimal.valueOf(current).setScale(3, RoundingMode.HALF_UP).doubleValue();
				System.out.println("That's 1 2p coin, your current total is: £" + current);
			}

		} while (current > 0);
	}
	
	//need to use sys.out for this method
	public static int stringManipulation1(String input) {
		System.out.println("String Manipulation: Task One");
		if (input == null || input.isEmpty()) {
			return 0;
		}
		
		String[] words = input.split("\\s+");
		return words.length;
	}

	public static void start() {
		exerciseOne();
		System.out.println("\n \n \n ========== \n \n \n");
		exerciseTwo();
		System.out.println("\n \n \n ========== \n \n \n");
		exerciseThree();
		System.out.println("\n \n \n ========== \n \n \n");
		coinsTask(4.58);
		System.out.println("\n \n \n ========== \n \n \n");
		int sm1Task = stringManipulation1("We are the world we are the children");
		System.out.println(sm1Task);
		System.out.println("\n \n \n ========== \n \n \n");
	}
}
