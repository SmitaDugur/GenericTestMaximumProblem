package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class ThreeParameters<T extends Comparable<T>> {
	
	private T firstVariable;
	private T secondVariable;
	private T thirdVariable;
	private T[] arrayOfVariables;
		
	

	public MaximumUsingGenerics(T firstVariable, T secondVariable, T thirdVariable, T[] arrayOfVariables) {
		super();
		this.firstVariable = firstVariable;
		this.secondVariable = secondVariable;
		this.thirdVariable = thirdVariable;
		this.arrayOfVariables = arrayOfVariables;
	}

	public void findMax() 
	{
		maximum(this.firstVariable, this.secondVariable, this.thirdVariable,this.arrayOfVariables);
	}
	
	public static <E extends Comparable<E>> void maximum(E firstVariable,E secondVariable,E thirdVariable,E[] arrayOfVariables) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\tChoose From the following by which you want to check ::\n \t\t 1) Get Maximum by compareTo method \n \t\t 2) Get Maximum "
				+ "by Sorting method");
		int option = scanner.nextInt();
//		scanner.close();
		switch (option) {
		case 1:
			E max = firstVariable;
			if(secondVariable.compareTo(max) > 0)
			{
				max = secondVariable;
			}
			if(thirdVariable.compareTo(max) > 0)
			{
				max = thirdVariable;
			}
			System.out.println("\t\tThe Maximum using CompareTo method is ::"+ max+"\n");			
			break;
		case 2:
			Arrays.sort(arrayOfVariables);
			System.out.println("\t\tThe Maximum using Sort method is ::" + arrayOfVariables[2]+"\n");
			break;

		default:
			System.out.println("Wrong !! Input is wrong.....!!");
			break;
		}
		
	}
		
	public static void main(String[] args) {
		
		Integer intFirst = 23, intSecond = 52, intThird = 92;
		Integer[] arrayOfInteger = {intFirst,intSecond,intThird};
		
		Float floatFirst = 121.03f, floatSecond = 235.736f, floatThird = 119.009f;
		Float[] arrayOfFloat = {floatFirst,floatSecond,floatThird};
		
		String stringFirst = "Apple", stringSecond = "Peach", stringThird = "Banana";
		String[] arrayOfString = {stringFirst,stringSecond,stringThird};
		
		MaximumUsingGenerics <Integer> integerValue = new MaximumUsingGenerics<Integer>(intFirst,intSecond,intThird,arrayOfInteger);
		integerValue.findMax();
		MaximumUsingGenerics <Float> floatValue = new MaximumUsingGenerics<Float>(floatFirst, floatSecond, floatThird,arrayOfFloat);
		floatValue.findMax();
		MaximumUsingGenerics <String> stringValue = new MaximumUsingGenerics<String>(stringFirst, stringSecond, stringThird,arrayOfString);
		stringValue.findMax();
	}
}
