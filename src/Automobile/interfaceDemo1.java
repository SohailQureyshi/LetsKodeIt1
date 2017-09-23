package Automobile;

public class interfaceDemo1 {

	public static void main(String[] args) {
		
		
//		Object can only implement method in CarInterface
		CarInterface myInterface = new interfaceBMW();
		
//		Object can only implement method in interfaceDemo
		interfaceDemo myInterface1 = new interfaceBMW();
		
//		Can implement method in both interfaces
		interfaceBMW myInterface2 = new interfaceBMW();
		
		myInterface.ecoSystem("True");
		myInterface1.headsUpNavigation();
		myInterface2.engineStart("6 Cyl", true);
	}
}
