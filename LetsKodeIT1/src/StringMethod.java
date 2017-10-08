
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is the test string";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "";
		
		String input = "This is my own assignment";
		String output = reverse(input);
	

		System.out.println("The lenght of the string = " + str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" and this is the apprenhended test"));
		System.out.println(str.contains("test"));
		System.out.println(str.contains("si"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("is"));
		System.out.println(str.endsWith("string"));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals(str1));
		System.out.println(str.isEmpty());
		System.out.println(str3.isEmpty());
		
		System.out.println("*********************************************");
		
		System.out.println(output);
	}

	private static String reverse(String input) {
		String reverse = "";
		
		if(input.length()<=1){
			reverse=input;
		}else{
			String[] originalArray=input.split("\\s+");
			for(String item:originalArray){
			
				reverse = item + " "  + reverse;
			}
		}
		
		
		
		return reverse.trim();
		
	}

	
	
}

