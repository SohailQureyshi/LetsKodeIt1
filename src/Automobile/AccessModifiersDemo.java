package Automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars c1 = new Cars(10);
		
		
//		Accessible only within the package
		c1.speed =10;
//		Accessible within the package and child class outside the package 
		c1.publicSpeed = 100;
		
//		Accessible within the package only
		c1.protectedSpeed = 100;
		
//		Private method created
		c1.increasingWiper();        
		
		
//   Method created to access private variable
		c1.setprivateSpeed(100);
	}

}
