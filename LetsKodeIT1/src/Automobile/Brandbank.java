package Automobile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Brandbank {

	
	public static void main  (String[] args) throws IOException{
		
		String path = "C:\\Selenium\\JavaTutorial New\\JavaBasic\\src\\test.properties";
		Properties b1 = new Properties();
		FileInputStream fsb = new FileInputStream (path);
		
		b1.load(fsb);
		System.out.println(b1.getProperty("name"));
		
	}
}
