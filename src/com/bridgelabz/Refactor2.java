package com.bridgelabz;

public class Refactor2 {

	import java.util.Scanner;

	public abstract class TestMaximum<T extends Comparable <T>>{
		
	     private T x = null;
	     private T y = null;
	     private T z = null;
	     
	     TestMaximum(T x,T y,T z){
	    	 this.x = x;
	    	 this.y = y;
	    	 this.z = z;
	     }

		public static  <T extends Comparable <T>> T max  (T x,T y,T z) {
			 T max = x;
			 if(y.compareTo(max)>0) {
				 max = y;
			 }
			 if(z.compareTo(max)>0) {
		         max = z;
			 }
			   

	    System.out.println("maximum number is: " +max);
		return max;
		 }
		
		public static void main (String[] args) {
	 		 
			Scanner input = new Scanner(System.in);
		    System.out.println("enter numer1:" );
		    int x = input.nextInt();
		    System.out.println("enter numer2:" );
		    int y = input.nextInt();
		    System.out.println("enter numer3:" );
		    int z = input.nextInt();
		      max(x,y,z);
		    
		 System.out.println("enter float1:" );
		    float a = input.nextFloat();
		    System.out.println("enter float2:" );
		    float b = input.nextFloat();
		    System.out.println("enter float3:" );
		    float c = input.nextFloat();
		    max(a,b,c);
		    
		    System.out.println("enter string1:" );
		    String d = input.next();
		    System.out.println("enter string2:" );
		    String g = input.next();
		    System.out.println("enter string3:" );
		    String f = input.next();
		    max(d,g,f);
		          
		} 
		 
	}