package com.bix.appl;

public class MethodArguments {
	
	 int age,marks;//class variable or global variable
	 public void setMarks(int marks1)//method variable or local variable //argument
	{
	   marks=marks1;//m.marks=marks1 60 //m2.marks=80
		
	}
	
	public void getMarks()
	{
		System.out.println(marks);
		
	}
/*	public int getMarks()
	{
		return marks;
	}*/
	public static void main(String[] args) {
		MethodArguments m=new MethodArguments();
		MethodArguments m2=new MethodArguments();
		m.setMarks(60);//parameter
		m2.setMarks(80);
		m2.getMarks();
		m.getMarks();
		
		
		



	}

}
 
 class Method
{
	
}
