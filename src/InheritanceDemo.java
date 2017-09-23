import Automobile.BMW;
import Automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;

		Cars c1 = new Cars(speed);
		BMW BMWcar1 = new BMW(speed);
		Honda Hondacar1 = new Honda();

		c1.increasingSpeed();

		// This is for method inherited by child class BMW
		BMWcar1.increasingSpeed();

		// This is for method inherited by child class BMW but different
		// implementation
		BMWcar1.increasingWiper();

		// This is for method created in child class BMW
		BMWcar1.inbuiltNavi();

		Hondacar1.decreasingWiper();

		Hondacar1.autoMirrorfold();

	}

}
