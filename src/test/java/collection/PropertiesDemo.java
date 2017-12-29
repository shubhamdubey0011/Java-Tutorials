package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream fls = new FileInputStream(
				"C:/Users/shubham.dubey/Desktop/Contact.properties");

		prop.load(fls);
		
		System.out.println(prop.getProperty("Shubham"));
		
		prop.setProperty("Maidul:", "93015555509");
		
		   Enumeration e =prop.propertyNames();
		   while (e.hasMoreElements())  
		   {
			System.out.println(e.nextElement());
			
		}
		   
		   FileOutputStream fos = new FileOutputStream("C:/Users/shubham.dubey/Desktop/Contact.properties");
		   prop.store(fos, "added maidul contact info by shubham Dubey");
		   
		   
	}
}
