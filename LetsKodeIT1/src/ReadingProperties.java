import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main (String[] args) throws IOException{
		
		String path = "C:\\Selenium\\JavaTutorial New\\JavaBasic\\src\\test.properties";
		String path2 = "C:\\Selenium\\JavaTutorial New\\JavaBasic\\src\\test2.properties";
		
		Properties props = new Properties();
		FileInputStream fs = new FileInputStream(path);
		FileInputStream fs2 = new FileInputStream(path2);
		
		props.load(fs);
		props.load(fs2);
		
		System.out.println(props.getProperty("name"));
		System.out.println(props.getProperty("language"));
		System.out.println(props.getProperty("Car"));
		System.out.println(props.getProperty("Company"));
		
	}
}
