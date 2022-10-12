package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class FactorsProgram {
	static boolean isPrime(int num){
	boolean isPrime = true;
	for(int i = 2;i < num/2; i++){
		if ( num % i == 0){
			isPrime = false;
			break;
		}
	}
	return isPrime;
	}
	public static void PrimeFactors(int num) {
		for (int i = 2; i <= num; i++) 
			if(isPrime(0)){
				int x = num;
			while(num % i == 0) {
				num = num / i;
				}
			System.out.println(i);
			}
			}
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in); 
				System.out.println("Enter any number : ");
				int num = sc.nextInt();
				System.out.println("Prime Factors of " + num + " is :");
				PrimeFactors(num);
			}
			}
