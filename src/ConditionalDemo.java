
public class ConditionalDemo {

	private static final String Red = null;

	public static void main(String[] args) {
		int val1 = 20;
		int val2 = 30;
		int val3 = 20;
		int val4 = 30;
		boolean condition = 10 == 10;
		System.out.println(condition);

		boolean conditions = val1 == val2;
		System.out.println(conditions);

		if (val1 == val2) {
			System.out.println("Yes, True");
		}

		if (val1 == val3) {
			System.out.println("Yes, True");
		}

		System.out.println("*******************************");

		// The 'if' statement demo
		int score = 79;
		String grade;

		if (score > 90) {
			grade = "A";

		} else if (score > 80) {
			grade = "B";
		} else {
			grade = "C";
		}

		System.out.println("The score = " + score);
		System.out.println("The grade = " + grade);

		//
		// String light = "Red";
		// String movement;
		//
		// if (light = Red){
		// movement= "don't move";
		// }
	}

}
