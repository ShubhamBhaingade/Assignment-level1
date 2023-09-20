package edu.ab.model;

import java.util.Comparator;

public  class SortStudentBasedOnMarksLowToHigh implements Comparator<Student> {
	
	public int compare(Student o1 ,Student o2) {
		
		return o1.getStudentMarks()-o2.getStudentMarks();
		
	}
}
