package com.red.grade;

import java.util.*;

public class CountBackwardsBy5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int userInput = input.nextInt() ;
		
		while (userInput >= 0) {
			if (userInput % 2 == 0) {
				System.out.println(userInput);
			}
			userInput = userInput - 5;
		}
		
		input.close();
	}
	
}
