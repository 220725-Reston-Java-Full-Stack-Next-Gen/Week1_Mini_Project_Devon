package com.devon.code;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Thermometer {
	
	/*
	 * Variables that need to be input 
	 * 
	 */
	private int degreesF;
	private int degreesC;
	private String name;
	private int[] tempReadings = new int[3];
	
	
	//No args constructor
	public Thermometer() {
	
}
	
	//All args constructor 
	public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
		
	}

	
	
	
	//Getters and Setters 
	public int getDegreesF() {
		return degreesF;
	}


	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}


	public int getDegreesC() {
		return degreesC;
	}


	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getTempReadings() {
		return tempReadings;
	}


	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}

	//Generating the toString Method 
	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}
	
	/*public static void ifFlashy(boolean isFlashy) {
			if(isFlashy == true) {
	 * 
	 * Custom Methods 
	 */
	public static int convertToFahrenheit(int c) {
		System.out.println("That is " + (c * 1.8 + 32) + " degrees Fahrenheit");
		return (int)(c*1.8 + 32);
	}
	int f = 32;
	public static int convertToCelsius(int f) {
		System.out.println("That is " + ((f-32) * .5556) + " degrees Celcius");
		return (int) ((f-32)*.5556);
	}

	int var1 = 0;
	public static void calculateAvgTemp(int[] temps) {
		IntStream intStream = IntStream.of(temps);
		OptionalDouble res = intStream.average();
		//System.out.println(res.getAsDouble());
		int var = (int) res.getAsDouble();
		System.out.println("The average is " + var + " degrees");
		}
	        //Scanner scan = new Scanner(System.in);
	        //System.out.print("Enter the first number: ");
	        //int num1 = scan.nextInt();
	        //System.out.print("Enter the second number: ");
	        //int num2 = scan.nextInt();
	        //System.out.print("Enter the third number: ");
	        //int num3 = scan.nextInt();
	        //scan.close();
	        //System.out.print("The average of entered numbers is:" + (num1 + num2 + num3)/3 );

	
		
	}
	    
	


