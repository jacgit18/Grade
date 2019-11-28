package com.red.grade;

import java.util.function.IntPredicate;
import java.util.Arrays;
import java.util.stream.IntStream;

public class OlympicYear {
	public static boolean booboo(final int bear) {
		return true;
	}

	public static boolean isEven(final int number) {
		return number % 2 == 0;
	}

	public static boolean isOdd(final int moo) {
		return moo % 2 != 0;
	}

	public static boolean isOlympicYear(final int moo) {
		return moo % 4 == 0;
	}

	public static void main(final String[] args) {
		final int mode = Integer.parseInt(args[0]);
		IntPredicate x = OlympicYear::isOlympicYear;
		if (mode == 1) {
			x = OlympicYear::isEven;
		} else if (mode == 2) {
			x = OlympicYear::isOdd;
		} else if (mode == 3) {
			x = OlympicYear::isOlympicYear;
		}
		final int[] years = IntStream.rangeClosed(1967, 2019).filter(x).toArray();
		final String output = Arrays.toString(years);
		System.out.println(output);
	}
	/*
	 * 	int [] years = IntStream.rangeClosed(1967, 2019)
				//.filter ( e -> e % 4 == 0 ) // .filter is the same as public static boolean boobboo method it acts as almost a shortcut
				//.filter (OlympicYear::isOdd)
				.filter (x)
				.toArray();
		
		String printOut = Arrays.toString(years);
		System.out.println(printOut);		// array to 1967 to 2019
		
	 */
	

}
