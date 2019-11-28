package com.red.grade;

import com.professor.ds.model.GPA;
import java.util.stream.IntStream;

public class _DriverGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final GradeCalculator gc = new GradeCalculator();
		
		IntStream.rangeClosed(55, 100).forEach(n -> {
			 GPA  gpa = gc.getGPA((float) n);
			System.out.println(gpa);
		});
	}

}
