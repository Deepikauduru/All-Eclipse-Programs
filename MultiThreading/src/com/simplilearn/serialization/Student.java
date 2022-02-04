package com.simplilearn.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String fname;
	private String lname;
	private transient String email;

	public static void main(String[] args) {
		
	}
	
	public Student(int id,String fname,String lname, String email) {
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.email=email;
	}

}
