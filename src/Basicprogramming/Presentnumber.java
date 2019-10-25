package Basicprogramming;

import java.util.Scanner;

public class Presentnumber {

	public static void main(String[] args) {
		// GIVEN NUMBER PRESENT IN ARRAY
		 int a[]= {54,32,56,78,45,89};
		 System.out.println("Enter the value:");
		 Scanner abc=new Scanner(System.in);
		 int n= abc.nextInt();
		 
	     for(int i=0;i<a.length;i++) 
	     {    if(a[i]==n) 
	         {
	    	 System.out.println("present");
	    	 }
	}

	}

}
