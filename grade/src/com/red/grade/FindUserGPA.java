package com.red.grade;
import java.util.*;

public class FindUserGPA {

	public static void main(String[] args) {
		// Declare Scanner
		Scanner input = new Scanner(System.in);
		
		// Variables
		int userScore;
		
		// input
		System.out.print("Enter your score: ");
		
		userScore = input.nextInt();
		
		// Find GPA
		if (userScore >= 93) {
			System.out.print("Your GPA is a 4.0");
		} else if (userScore >= 90 && userScore < 93) {
			System.out.print("Your GPA is a 3.7");
		} else if (userScore >= 87 && userScore < 90) {
			System.out.print("Your GPA is a 3.3");
		} else if (userScore >= 83 && userScore < 87) {
			System.out.print("Your GPA is a 3.0");
		} else if (userScore >= 80 && userScore < 83) {
			System.out.print("Your GPA is a 2.7");
		} else if (userScore >= 77 && userScore < 80) {
			System.out.print("Your GPA is a 2.3");
		} else if (userScore >= 70 && userScore < 77) {
			System.out.print("Your GPA is a 2.0");
		} else if (userScore >= 60 && userScore < 70) {
			System.out.print("Your GPA is a 1.0");
		} else {
			System.out.print("Your GPA is a 0");
		}
	}

}
