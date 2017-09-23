package Automobile;

public class AbstractDemoBMW extends AbstractCars {

	public static void main(String[] args) {

		// Object cannot be created for Abstract class
		// AbstractCars cars1 = new AbstractCars();

	}

//	Subclass must inherit the method in abstract class of main method
	@Override
	public void setprivateSpeed(int pSpeed) {
		super.setprivateSpeed(10);
	}
	// public void engineStart(){
	// super.engineStart();
	// System.out.println("This is key less start of BMW");
	// }

	
//	Subclass must inherit the method in abstract class of main method
	@Override
	public void engineStart(String keytype, int numOfCyl) {
		System.out.println("This is engine start of BMW");
	}

}
