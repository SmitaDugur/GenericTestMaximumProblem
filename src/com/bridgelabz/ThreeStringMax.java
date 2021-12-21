package com.bridgelabz;
import java.util.Scanner;

public class ThreeStringMax {
	 		 
		 public static void main (String[] args) {
			 System.out.println("enter string1:" );
		        String d = input.next();
		        System.out.println("enter string2:" );
		        String g = input.next();
		        System.out.println("enter string3:" );
		        String f = input.next();
		        String(d,g,f);
			 }public static  void String (String d, String g,String f) {
			    String max = f;
			   if (d.compareTo(max) > 0 ) {
			  	max = d;
			   }
			   if (g.compareTo(max) > 0) {
			  	 max = g;
			   }
			  System.out.println("maximum number is " + max);
			   return ;
			}
		 }