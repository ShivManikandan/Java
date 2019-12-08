package com.bix.appl;

public class ReturnType {
	int age,marks;//class variable or global variable
	//int a[]= {10,20,30};
	public void setMarks(int marks1) //setter or mutator
	{
		
	  marks=marks1;//m.marks=marks1 60 //m2.marks=80
		
	}
	
	
	public int getMarks()//getter or accessor
	{
		return marks;
	}
	/*public ReturnType returns()
	{
		ReturnType r1=new ReturnType();
		r1.age=20;
		r1.marks=70;
		return r1;
	}*/
	
	
	public static void main(String[] args) {
		/*MethodArguments m=new MethodArguments();
		MethodArguments m2=new MethodArguments();
		m.setMarks(60);
		m2.setMarks(80);
		*/
		ReturnType r1=new ReturnType();
		r1.setMarks(60);
		int i1=r1.getMarks();
		System.out.println(i1);
		
	//	System.out.println(r1.returns());
		System.out.println(r1.getMarks());
		
		
		



	}
	/*
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	*/
}
