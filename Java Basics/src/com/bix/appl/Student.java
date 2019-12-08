package com.bix.appl;

public class Student {

	int age,marks;
	String name;
	
	
	public static void main(String[] args) {
	
    Student s1=new Student();
    s1.findMarks();//Method declaration (or) Method Call
    System.out.println("s1 marks "+s1.marks);
    s1.findAge();
    }
	public void findAge()
	{
		age=21;
		System.out.println("Age is"+age);
	}
	public void findMarks()//Method definition
	{
		marks=60;
		System.out.println("Marks is "+marks);
		
	}
	

}
