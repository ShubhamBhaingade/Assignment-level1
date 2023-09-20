package edu.ab.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class StudentMain {
	
	public static void main(String[] args) {
		TreeSet<Student> allStudents= new TreeSet<>();
		
		Student s1=new Student("Shubham",2,99,24);
		Student s2=new Student("Rutvik",4,92,27);
		Student s3=new Student("Rohit",9,78,22);
		Student s4=new Student("Ashwin",8,89,32);
		Student s5=new Student("Sahil",7,91,33);
		
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		allStudents.add(s4);
		allStudents.add(s5);
		
		for (Student student : allStudents) {
			
			System.out.println(student);
			
		}
		System.out.println("Student based on marks  low to high-----------------\n");
		getStudentBasedOnMarksLowToHigh(allStudents);
		System.out.println("\n");
		
		System.out.println("Student based on marks  high to low");
		getStudentBasedOnMarksHighToLow(allStudents);
		
		
	}//end main
	
	public static void getStudentBasedOnMarksLowToHigh(TreeSet<Student>allStudents) {
		
		List<Student> tempList=new ArrayList<>();
		tempList.addAll(allStudents);
		
		
		SortStudentBasedOnMarksLowToHigh s1=new SortStudentBasedOnMarksLowToHigh();
		
		Collections.sort(tempList,s1);
		
		for (Student student : tempList) {
			System.out.println(student);
			
		}
		
		
	}
	public static void getStudentBasedOnMarksHighToLow(TreeSet<Student>allStudents) {
		List<Student> tempList=new ArrayList<>();
		tempList.addAll(allStudents);
		
		
		SortStudentsBasedOnMarksHighToLow s2 = new SortStudentsBasedOnMarksHighToLow();
		
		Collections.sort(tempList, s2);
		
		for (Student student : tempList) {
			System.out.println(student);
			
		}
		
	}

}//end class
