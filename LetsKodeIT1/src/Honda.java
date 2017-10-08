import Automobile.*;

public class Honda extends Cars {
	
	


//	public Honda(int startSpeed) {
//		super(startSpeed);

//	}

	@Override
	public void increasingSpeed() {
		super.increasingSpeed();
		// Implementing separate speed for Honda car
		System.out.println("Increase speed of Honda");
	}

	@Override
	public void decreasingWiper() {
		super.decreasingWiper();
		// System.out.println("Decrease wiper speed of Honda Car");

	}

	public void autoMirrorfold() {
		System.out.println("Auto fold the mirror of Honda Car");
		 Cars c1 = new Cars();
		 c1.setprivateSpeed(100);
		 protectedSpeed = 100;
		
	}
	
	
}
