package edu.ab.model;

import java.util.Objects;

public class Student implements Comparable <Student> {

	private String studentName;
	private int studentId;
	private int studentMarks;
	private int studentrollNo ;
	
	public Student() {

	}
	
	public Student(String studentName, int studentId, int studentMarks, int studentrollNo) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentrollNo = studentrollNo;
	}


	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	public int getStudentrollNo() {
		return studentrollNo;
	}
	public void setStudentrollNo(int studentrollNo) {
		this.studentrollNo = studentrollNo;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentMarks=" + studentMarks
				+ ", studentrollNo=" + studentrollNo + "]";
	}

	@Override
	public int hashCode() {
		return studentName.length()+studentMarks*3;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student student=(Student)obj;
			boolean a=student.studentName.equals(this.getStudentName());
			boolean  b=student.studentId==this.studentId;
			boolean  c=student.studentMarks==this.studentMarks;
			boolean  d=student.studentrollNo==this.studentrollNo;
			
			return a && b && c&& d;	
		}
		else {
			return false;
		}
	}

	public int compareTo(Student student) {
		return this.getStudentName().compareTo(student.getStudentName());
	}

}
