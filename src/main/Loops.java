package main;

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

	public static void exerciseThree() {
		for(int a= 1; a < 11; a++) {
			System.out.println(a) * a;
		}
	}
	public static void main(String[] args) {
		exerciseThree();
	}
}
