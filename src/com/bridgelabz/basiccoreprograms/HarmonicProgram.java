package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner input
		System.out.println("enter the value of n : ");
		double num = sc.nextDouble();
		double sum = 0.0; 
		for(int i = 1; i <= num; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Nth Harmonic Num : " + sum);

	}

}
