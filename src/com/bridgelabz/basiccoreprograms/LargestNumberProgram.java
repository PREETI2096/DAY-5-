package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class LargestNumberProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number1:");
		int n1 = sc.nextInt();
		System.out.println("Enter a number2:");
		int n2 = sc.nextInt();
		System.out.println("Enter a number3:");
		int n3 = sc.nextInt();
		if (n1 >= n2 && n1 >= n3)
			
			System.out.println(n1 + " is the greatest number among three.");
		
		else if(n2 >= n1 && n2 >= n3)
			
			System.out.println(n2 + " is the greatest number among three");
		
		else if (n3 >= n1 && n3 >= n2)
			
			System.out.println(n3 + " is the greatest number among three");
		

	}

}
