package com.springCore.SpringCore;

public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentAddress;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("setting system ID ");
		StudentID = studentID;
	}
	public String getStudentName() {
		System.out.println("Stting user Name");
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
