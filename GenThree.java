/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was genergitated.
 */
public class GenThree {
	public static void main(String[] asdf) {
		int a = Integer.parseInt(asdf[0]);
		int b = Integer.parseInt(asdf[1]);
		int x = (int)(Math.random() * (b - a)) + a;
		int y = (int)(Math.random() * (b - a)) + a;
		int z = (int)(Math.random() * (b - a)) + a;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int min = Math.min(Math.min(x, y), z);

		System.out.println("The minimal generated number was " + min);
	}
}
