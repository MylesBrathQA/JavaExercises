package main.objects;
public class DataTypes {
	// returns are strongly typed meaning what data type you declare in the method is the data type that needs to be returned e.g.
	public static int returnInt() {
		System.out.println("This returns an integer");
				return 5;
	}
	
	public boolean returnBool() {
		System.out.println("This returns a boolean");
		return false;
	}

	public char myCharacter() {
		System.out.println("This returns a character similar to a string");
		return 'P';
	}
	
	public static void main(String[] args) {
		System.out.println(returnInt());
	}
}
