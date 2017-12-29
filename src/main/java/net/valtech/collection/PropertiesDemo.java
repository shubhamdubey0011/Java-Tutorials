package net.valtech.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo 
{

	public static void main(String[] args)throws Exception 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/shubham.dubey/Desktop/def.properties");
		p.load(fis);
		System.out.println(p);//{user=scott, password=tiger, venki=8888}
		String s=p.getProperty("venki");
		System.out.println(s);//8888
		p.setProperty("nag","9999999");
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			String s1=(String)e.nextElement();
			System.out.println(s1);//nag
						 //user
						 //password
						 //venki
		}
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"updated by bhaskar for scjp demo class");
	}

	
}
