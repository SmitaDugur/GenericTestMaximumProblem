package com.bridgelabz;

public class ThreeIntegerMax {
	
	static Integer max;
	public static int maximumInteger(Integer intFirst, Integer intSecond, Integer intThird)
	{
		max = intFirst;
		if(intSecond.compareTo(max) > 0)
		{
			max = intSecond;
		}
		if(intThird.compareTo(max) > 0)
		{
			max = intThird;
		}
		return max;
	}

	public static void main(String[] args) {
		Integer intFirst = 23, intSecond = 52, intThird = 92;
		maximumInteger(intFirst, intSecond, intThird);
		System.out.println("The Maximum Number is  :: "+ max);
	}

}
