package main;

public class Conditional {
	public static int flowCharts1(int a, int b, boolean c) {
		if (c == true) {
			return a + b;
		} else {
			return a * b;
		}
	}

	public static void flowCharts2(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}

			} else {
				System.out.println("2");
			}
		}
	}

	public static void main(String[] args) {
		int result = blackJack(5, 10);
		System.out.println(result);
	}

	public static int blackJack(int a, int b) {
		if (a <= 0 || b <= 0) {
			return 0;
		} else {
			if (a + b > 21) {
				return 0;
			} else {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			}
		}
	}
}
