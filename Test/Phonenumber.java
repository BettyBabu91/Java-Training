package com.Test;
import java.util.Scanner;

public class Phonenumber 
{
	public static void main(String[] args) 
	{
	    long phnNum;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your 10 digit phone number:");
	    phnNum = sc.nextLong();
	    System.out.println(String.valueOf(phnNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
	}

}
