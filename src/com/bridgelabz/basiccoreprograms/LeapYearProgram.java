package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		System.out.println("enter the year to check:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ( year % 400 == 0)
			
		    System.out.println (year + " is a Leap year");
			
			else if ( year % 4 == 0 && year % 100 != 0)
				
				System.out.println(year + " is a Leap year");
			
			else
				
				System.out.println(year + " is not a Leap year");
			
	}

}
