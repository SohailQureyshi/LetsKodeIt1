package Automobile;

public class CarOverloading11 {

	public static void main(String[] args) {
		setlocation("Maitama Road");
		setlocation("Brane Close", true);
	}

	public static void setlocation(String address) {
		System.out.println("This location is " + address);
	}

	public static void setlocation(String address, boolean rememberLocation) {
		System.out.println("This location is " + address);

		if (rememberLocation) {
			System.out.println("The location is saved");
		} else {

			System.out.println("The location is not saved");

		}
	}
}