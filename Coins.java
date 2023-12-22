/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int coins = Integer.parseInt(args[0]);
		int numofquarters = (coins/25);
		int numofcents = coins - (numofquarters * 25);
		System.out.println("Use " + numofquarters + " quarters and " + numofcents + " cents");
		
	}
}