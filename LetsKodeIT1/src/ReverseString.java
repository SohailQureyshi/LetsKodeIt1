
public class ReverseString {

	public static void main(String[] args) {

		String input = "This is a test String";
		String output = reverse(input);
		System.out.println(output);
	}

	private static String reverse(String input) {
		String reverse = "";

		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
		
			for (String item : originalArray){
			reverse = item + " " + reverse;
		}
		}
		return reverse.trim();
	}

}

