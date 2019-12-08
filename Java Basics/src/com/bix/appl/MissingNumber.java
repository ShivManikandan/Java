package com.bix.appl;

public class MissingNumber {
	public static void main(String[] args) {
		   
		  int[] arr1={7,5,6,1,4,2};
		  System.out.println("Missing number from array arr1: "+missingNumber(arr1));
		  int[] arr2={5,3,1,2};
		  System.out.println("Missing number from array arr2: "+missingNumber(arr2));
		 
		}
		public static int missingNumber(int[] arr)
		{
		  int n=arr.length+1;
		  System.out.println("n is"+n);
		  int sum=n*(n+1)/2;
		  System.out.println("sum is"+sum);
		  int restSum=0;
		  for (int i = 0; i < arr.length; i++) {
		   restSum+=arr[i];//restSum=restSum+arr[i];
		  }
		  int missingNumber=sum-restSum;
		  return missingNumber;
		}

}
