package Automobile;

public class BMW extends Cars {

	public BMW(int startSpeed) {
		super(startSpeed);

	}

	@Override
	public void decreasingSpeed() {
		super.decreasingSpeed();
		System.out.println("This is the decreasing speed of BMW cars");
	}

	@Override
	public void increasingWiper() {
		// super.increasingWiper();
		System.out.println("This is the decreasing speed of BMW car wipers");
	}

	public void inbuiltNavi() {
		System.out.println("This is the inbuilt Navi for BMW");
	}
}
