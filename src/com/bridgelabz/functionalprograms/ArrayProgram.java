package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class ArrayProgram {
	public static void array() {
	
		int array[][] = null;
		System.out.println("enter the number of rows:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("enter the number of columns:");
		int columns = sc.nextInt();
		array = new int[rows][columns];
		for(rows = 0;rows < array.length;rows++)
		{
			for(columns = 0;columns < array.length;columns++)
			{
				array[rows][columns] = rows*10 + columns*10;
				System.out.print(array[rows][columns] + " ");
			}
		System.out.println();
		}
	}
public static void main(String[] args) {

  array();
	}

}
