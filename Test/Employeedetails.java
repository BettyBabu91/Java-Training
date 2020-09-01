package com.Test;

public class Employeedetails {
	String fname;
	String lname;
	private double salary; 

	 

	public Employeedetails()
	{
	    fname = null;
	    lname = null;
	    salary = 0;
	}
	public String getfname()
	{
	    return fname;
	}
	public String getlname()
	{
	    return lname;
	}

	 


	public double getsalary() {
	    return salary;
	    
	}
	public void setfname(String fname) {
	    this.fname = fname;
	}
	public void setlname(String lname) {
	    this.lname = lname;
	}

	 

	public void setsalary(int salary) {
	    this.salary = salary;
	    
	    
	}
	}
