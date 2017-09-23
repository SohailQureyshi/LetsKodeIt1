package Automobile;

/***
 * 
 * @author Abi.Balogun
 *Sequence of the data type are different in the method overload
 */

//Cannot overload just on return type

public class CarOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight(5, "5");
		increaseSeatHeight("8", 8);
		
		}

	public static void increaseSeatHeight(int variable1, String variable2) {
		System.out.println("This is the first overload ");
	}

	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("This is the second overload");
	
}
	
	

}