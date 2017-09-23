
public class Car {
	private String make;
	int gear;
	int speed;

	// This is a Constructor
	public Car() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;

		System.out.println("Executing Constructor without arguement");
	}

	public Car(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		System.out.println("Executing Constructor with arguement");
	}

	public void setMake(String carmake) {
		make = carmake;
	}

	// "this" refers to the instance of the class(object)
	public void setMakes(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}
}
