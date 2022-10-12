package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapNumberProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner input
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt();

		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println("after swapping number will be : ");
		System.out.println("first number is : " + firstNumber);
		System.out.println("second number is : " + secondNumber);


	}

}
