package com.bix.appl;

public class EncapsulatedClass {
	
		   private String name;
		   private String idNum;
		   private int age;

		   public int getAge() {
		      return age;
		   }

		   public String getName() {
		      return name;
		   }

		   public String getIdNum() {
		      return idNum;
		   }

		   public void setAge( int newAge) {
		      age = newAge;
		   }

		   public void setName(String newName) {
		      name = newName;
		   }

		   public void setIdNum( String newId) {
		      idNum = newId;
		   }
		   public static void main(String[] args) {
			   EncapsulatedClass e1=new EncapsulatedClass();
			   e1.setAge(21);
			   System.out.println(e1.getAge());
		}
		}


