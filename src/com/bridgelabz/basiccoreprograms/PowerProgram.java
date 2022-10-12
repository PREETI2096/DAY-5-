package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class PowerProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for N : ");
		int number = sc.nextInt();

		System.out.println("power of 2^" + number + " is  :"+ (Math.pow(2, number)));
	}

}
