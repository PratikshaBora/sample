package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentFS {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	String fname;
	String lname;
	double marks;
	String email;
	String course;
	String username;
	String password;
	
	public StudentFS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentFS(String fname, String lname, double marks, String email, String course, String username,
			String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.marks = marks;
		this.email = email;
		this.course = course;
		this.username = username;
		this.password = password;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentFS [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", marks=" + marks + ", email="
				+ email + ", course=" + course + ", username=" + username + ", password=" + password + "]";
	}

	
}
