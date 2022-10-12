package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChillProgram {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double windSpeed , temperature , windChill;
		System.out.println("Enter temperature(fahrenheit):");
		temperature = sc.nextDouble();
		System.out.println("Enter wind speed:");
		windSpeed = sc.nextDouble();
		windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature -35.75)*Math.pow(windSpeed, 0.16);
		System.out.println("wind chill is: "+ Math.floor(windChill));
	}
		
}


