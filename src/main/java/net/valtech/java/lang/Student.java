package net.valtech.java.lang;

public class Student 
{

	String name;
	int rollno;
	Student(String name,int rollno)
	{
	this.name=name;
	this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{
	try{
	String name1=this.name;
	int rollno1=this.rollno;
	Student s2=(Student)obj;
	String name2=s2.name;
	int rollno2=s2.rollno;
	if(name1.equals(name2)&&rollno1==rollno2)
	{
	return true;
	}
	else return false;
	}
	catch(ClassCastException e)
	{
	return false;
	}
	catch(NullPointerException e)
	{
	return false;
	}
	}

	public static void main(String[] args){
	Student s1=new Student("vijayabhaskar",101);
	Student s2=new Student("bhaskar",102);
	Student s3=new Student("vijayabhaskar",101);
	Student s4=s1;
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equals(s3));//false
	System.out.println(s1.equals(s4));//true
	}


}
