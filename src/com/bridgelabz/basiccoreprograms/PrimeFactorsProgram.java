package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PrimeFactorsProgram {

	public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	number = sc.nextInt();
	System.out.println("Prime factors of entered number are:");
	for(int i = 2; i <= number;i ++) {
		while(number % i == 0)
		{
			number = number / i;
		}
			System.out.println(i + "");
			
		}
    if(number >= 2) {
    	System.out.println(number);
    }
	}

}
