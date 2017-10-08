package Automobile;

/***
 * First type of Overloading
 * 
 * @author Abi.Balogun
 *
 */
// Number of parameters are different

public class CarOverloading1 {

	public static void main(String[] args) {

		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
	}

	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("This is seat height is " + heightToIncrease + " inches");

	}

	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
		System.out.println("This is seat height is  " + heightToIncrease + " inches");

		if (rememberHeight) {
			System.out.println("Your selection is saved");
		} else {
			System.out.println("Your selection is not saved");
		}
	}
}
