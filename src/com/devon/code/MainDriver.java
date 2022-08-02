package com.devon.code;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainDriver {

	public static void main(String[] args) {
		
		
		//Thermometer Thermometer1 = new Thermometer(0,0,null,new int[3]);
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please give me a name");
		String tname = user.nextLine();
		
		System.out.println("Hi user, thanks for using " + tname + " today!");
		
		System.out.println("Please enter a Fahrenheit Value: ");
		System.out.println("Please enter a Celsius Value: ");
		
		int f = user.nextInt();
		Thermometer.convertToCelsius(f);
		
		int c = user.nextInt();
		Thermometer.convertToFahrenheit(c);
		
		System.out.print("Enter the first number: ");
		int num1 = user.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = user.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = user.nextInt();
        user.close();
		
		int[] temps = new int[] {num1, num2, num3};
		IntStream intStream = IntStream.of(temps);
		OptionalDouble res = intStream.average();
		Thermometer.calculateAvgTemp(temps);
		
		
		System.out.println("Goodbye, have a great day!");
			
		}
		
	}
	

	
