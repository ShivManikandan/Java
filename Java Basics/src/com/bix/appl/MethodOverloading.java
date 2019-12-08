package com.bix.appl;

public class MethodOverloading {
	int science,maths;
	
public void getMarks(int mark1)//callee
{
	int social=mark1;
	System.out.println(science);
	System.out.println(social);
	
}
public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.getMarks(50);//calling 
		MethodArguments m1=new MethodArguments();
		m1.setMarks(70);
		m1.getMarks();
	}

}
