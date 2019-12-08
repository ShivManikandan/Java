package com.bix.appl;

public class Inheritance {

	public static void main(String[] args) {
		

	}

}

class Vehicle
{
	int speed=20;
	public void getSpeed()
	{
		System.out.println("Vehicle speed"+speed);
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.getSpeed();
	}
}

class Car extends Vehicle
{
	int speed=30;
	@Override
	public void getSpeed()
	{
		System.out.println("Car speed"+speed);
	}
	public static void main(String[] args) {
		//Car c1=new Car();
		Vehicle c1=new Car();
		System.out.println(c1.getClass().getName());
		c1.getSpeed();
	}
}

class Bmw extends Car
{
	int speed=70;
	@Override
	public void getSpeed()
	{
		System.out.println("Bmw speed"+speed);
	}
	public static void main(String[] args) {
		Bmw b1=new Bmw();
		b1.getSpeed();
	}
}

class Toyota extends Car
{
	int speed=50;
	@Override
	public void getSpeed()
	{
		System.out.println("Bmw speed"+speed);
	}
	public static void main(String[] args) {
		Toyota t1=new Toyota();
		t1.getSpeed();
	}
}
