package Automobile;

/***
 * 
 * @author Abi.Balogun The type of data type are different in the method overload
 *         
 */
public class CarOverloading2 {

	public static void main(String[] args) {

		increaseSeatHeight(5);
		increaseSeatHeight("8");
	}

	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("This is seat height is " + heightToIncrease + " and it's the interger one");
	}

	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("This is seat height is " + heightToIncrease + " and it's the string one");
	}

}