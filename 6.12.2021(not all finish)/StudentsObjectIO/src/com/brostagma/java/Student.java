package com.brostagma.java;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 00001;
	private String studentName;
	private int studentID;
	private String studentDepartment;
	
	public Student(String studentName, int studentID, String studentDepartment) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentDepartment = studentDepartment;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String info = "Student Name : " + studentName +
						"\nStudent Number : " + studentID +
						"\nStudent Department : " + studentDepartment;
		return info;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
