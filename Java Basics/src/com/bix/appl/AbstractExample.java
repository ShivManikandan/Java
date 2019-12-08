package com.bix.appl;

public class AbstractExample {
public static void main(String[] args) {

}
}

interface Bike{  
   void run() ;//
	   //abstract methods
   
   void getspeed();
    
  }  
interface Scooter
{
	void autoShift();
}


 class Honda extends Car implements Bike,Scooter{  
 public void run(){
	  System.out.println("running safely");
	  }
 public void getspeed()
 {
	 System.out.println("speed is steady");
 }
  public static void main(String args[]){  
   Honda h = new Honda();  
   h.run();  
   h.getspeed();
   h.autoShift();
  }
@Override
public void autoShift() {
	System.out.println("Shifting speed automatcially");
	
}  
  }  