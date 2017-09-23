package Automobile;

public  abstract class AbstractCars {
	
	private int privateSpeed;
	
	public int publicSpeed;
	
	 protected int protectedSpeed;
	 
	 int speedlimit = 100;
	 
	 public AbstractCars(){
			this(0);
		}

	
	
	public AbstractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}



	public void setprivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
}
	
	public void engineStart(String KeyType, int numOfCyl){
		
	}
	
}