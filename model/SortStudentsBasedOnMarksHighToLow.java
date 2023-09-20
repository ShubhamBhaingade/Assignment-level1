package edu.ab.model;

import java.util.Comparator;

public class SortStudentsBasedOnMarksHighToLow implements Comparator<Student>{
	
	public int compare(Student o1,Student o2) {
		return o2.getStudentMarks()-o1.getStudentMarks();
		
	}

}
