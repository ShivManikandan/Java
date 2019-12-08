package com.bix.appl;

public class Employee {
int age;
String name;

public Employee(int age,String name)
{
	Employee e1=new Employee();
	this.age=age;
	this.name=name;
	//name=this.name;
	//return e1;
}
Employee()
{
	
}

public void setDetails(int age,String name)
{
	this.age=age;//e1.age=age
	this.name=name;
}
public void getDetails()
{
	System.out.println("Age is "+age);
	System.out.println("Name is "+name);
}

	public static void main(String[] args) {
		
		/* Employee e1=new Employee();
		// object initialization type 1 using reference variable
		e1.name="Arjun";
		e1.age=21;
		System.out.println("Age is "+e1.age);
		System.out.println("Name is "+e1.name);
		//object initialization type 2 using method
		//e1.setDetails(21, "Arjun");
		e1.getDetails();
		*/
		//object initialization type 3 using constructor
		Employee e2;
		e2=new Employee(21,"Arjun");
		e2.getDetails();
		Employee e3=new Employee(23,"Ashok");
		e3.getDetails();
		
	}

}
