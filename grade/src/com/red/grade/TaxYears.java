package com.red.grade;
import java.util.Arrays;
import java.util.stream.IntStream;
public class TaxYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int[] years = IntStream.rangeClosed(1967, 2019).toArray();
		final String output = Arrays.toString(years);
		System.out.println(output);
	}

}
