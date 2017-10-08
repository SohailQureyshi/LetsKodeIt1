package Automobile;
/***
 * 
 * 
 * @author Abi.Balogun
 *
 */

//A class can implements(not extends) multiple interfaces
public class interfaceBMW implements CarInterface, interfaceDemo {

	public static void main(String[] args) {

	}

	@Override
	public void engineStart(String enginetype, boolean keyless) {

	}

	@Override
	public void ecoSystem(String fuelconsumption) {

	}

	// a class can add implementation and body to the method implemented from interface
	@Override
	public void headsUpNavigation() {
		System.out.println("This is the heads up navigation of BMW");

	}

}
