package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Loops {
	public static void exerciseOne() {
		for (int a = 100; a < 200; a++) {
			System.out.println(a);
		}

	}

	public static void exerciseTwo() {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println(a + ": -");
			} else {
				System.out.println(a + ": *");
			}
		}
	}

	private static void printNum(int n, int s) {
		if (n > 0) {
			System.out.println(s);
			printNum(n - 1, s);
		}
	}

	public static void exerciseThree() {
		for (int a = 1; a < 11; a++) {
			printNum(a, a);
		}
	}

	public static void coinsTask(double cost) {
		double payment = 60;
		double current = payment - cost;
		System.out.println("This is your starting cost: Â£" + current);
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
	
	public static int stringMaipulation1(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		
		String[] words = input.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		System.out.println(stringMaipulation1("Hello World I am the leader"));
	}
}
