package com.bridgelabz;
import java.util.Scanner;

public class ThreeFloatMax {
	 		 
		 public static void main (String[] args) {
			 
	        Scanner input = new Scanner(System.in);
	        System.out.println("enter float1:" );
	        float a = input.nextFloat();
	        System.out.println("enter float2:" );
	        float b = input.nextFloat();
	        System.out.println("enter float3:" );
	        float c = input.nextFloat();
	        Float(a,b,c);
	        
	       
	        
		 }
	 public static  void Float (Float a, Float b,Float c) {
		    Float max = b;
		   if (b.compareTo(max) > 0 ) {
		  	max = a;
		   }
		   if (c.compareTo(max) > 0) {
		  	 max = c;
		   }
		  System.out.println("maximum number is " + max);
		   return ;
		}
}