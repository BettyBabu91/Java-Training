package com.Test;

public class Exception1 {

	public static void main(String[] args) {
		int a;
    try {
	         a = 10/0;
	 }
	 catch(ArithmeticException e)
	 {
	     e.printStackTrace();
	 }
	finally
	{
	    System.out.println("exception received");
	}
	}

}
