package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter divident : ");
		int divident = sc.nextInt();

		System.out.println("enter divisor : ");
		int divisor = sc.nextInt(); 

		int quotient = divident / divisor; 
		int remainder = divident % divisor;

		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);


	}

}
