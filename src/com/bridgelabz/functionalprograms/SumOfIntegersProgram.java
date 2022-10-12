package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class SumOfIntegersProgram {
 public static boolean isTriplets() {
	 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int  arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	 
 for(int i = 0; i < arr.length; i++) {
		int firstNumber = arr[i];
		for(int j=i+1; j < arr.length; j++) {
			int secondNumber = arr[j];
			for(int k = j+1;k < arr.length;k++) {
				int thirdNumber = arr[k];
				
				int sum = firstNumber + secondNumber + thirdNumber;
				if (sum == 0)
					 System.out.println(" yes triplet sum is 0");
					 else 
						 System.out.println("no triplet sum is  equal to 0");
		                return true;
			}
			}
 }
 return false;
 }
	public static void main(String[] args) { 
	 isTriplets();
	      }
		}
	
//sum of integers program