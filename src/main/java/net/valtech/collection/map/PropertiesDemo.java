package net.valtech.collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

class PropertiesDemo 
{
	public static void main(String[] args)throws Exception 
	{
		Properties p=new Properties();
		//•To load Properties from property files into java Properties object.
		FileInputStream fis=new FileInputStream("F:/Java_LAB_Workspace/JavaTutorials/src/test/resources/abc.properties");
		p.load(fis);
		System.out.println(p);//{user=scott, password=tiger, venki=8888}
		String s=p.getProperty("venki");
		System.out.println(s);//8888
		p.setProperty("shubham","9999999");
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			String s1=(String)e.nextElement();
			System.out.println(s1);//nag
						 //user
						 //password
						 //venki
		}
		//•	To store the properties from Properties object into properties file.
		FileOutputStream fos=new FileOutputStream("F:/Java_LAB_Workspace/JavaTutorials/src/test/resources/abc.properties");
		p.store(fos,"updated by Shubham for properties file demo");
	}
}

