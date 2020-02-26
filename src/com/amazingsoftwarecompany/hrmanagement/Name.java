package com.amazingsoftwarecompany.hrmanagement;

public class Name {

	private String title;
	private String fname;
	private String lname;

	public Name(String title, String fname, String lname) {
		super();
		this.title = title;
		this.fname = fname;
		this.lname = lname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Name [title=" + title + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public boolean equals(Name name) {
		return (this.title == name.title && this.fname == name.fname && this.lname == name.lname);

	}
}