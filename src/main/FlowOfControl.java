package main;

public class FlowOfControl {
	public static void method1() {
	    System.out.println("Hello");
	}

	public static void method2() {
	    System.out.println("World");
	}

	public static String method3() {
	    return "!";
	    //anything written after the return call will be ignored
	}

	public static void main(String[] args) {
	    method1(); //This tells it to do the code in method1
	    method2(); //When it finishes the code in method1 it does the code in method2
	    System.out.println(method3()); //This prints out the returned value of method3
	}
}
