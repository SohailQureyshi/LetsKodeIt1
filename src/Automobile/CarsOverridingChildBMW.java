package Automobile;

public class CarsOverridingChildBMW extends CarsOverridingParent {

	/***
	 * Rules
	 * Argument lists on the method override cannot be changed
	 * Access modifier of the overriding method cannot be more restrictive than the overridden method
	 * private,static and final methods cannot be overriden as they are restricted to a class
	 */
	public static void main(String[] args) {
		
		CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		
//		You can call method from parent class by creating an object using the parent class without overriding the method
		CarsOverridingParent c2 = new CarsOverridingChildBMW();
		
		c1.enginestart(0);
		c2.enginestart(2);
		c2.increasespeed();
		
		}

	@Override
	public void enginestart(int cyl){
//		super.enginestart(2);
		System.out.println("This is the engine start for child class");
}
}