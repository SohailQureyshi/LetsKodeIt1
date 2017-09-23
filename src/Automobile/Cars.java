package Automobile;

public class Cars {

//	No modifier for the variable- 
	int speed;
	
//	 private modifier - Cannot be accessible outside the class
	private int privateSpeed;
	
//	public modifier - can be accessed within the package and child class outside the package
    public int publicSpeed;
    
//    Protected modifier - cannot be accessed outside the package and child class outside the package
    protected int protectedSpeed;
    
	int speedlimit = 100;
	int wiper;
	
//	Method modifier created  to access private modifier
	public void setprivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
	}
	
	public Cars(){
		this(0);
	}

	public Cars(int startSpeed) {
		speed = startSpeed;
	}

	public void increasingSpeed() {
		speed++;
		System.out.println("This is the increasing speed of the car");
	}

	public void decreasingSpeed() {
		speed--;
		System.out.println("This is the decreasing speed of the car");
	}

	protected void increasingWiper() {
		wiper++;
		System.out.println("this is the increasing level of the car wiper");
	}

	public void decreasingWiper() {
		wiper--;
		System.out.println("This is the decreasing level of the car wiper");
	}

	

}
