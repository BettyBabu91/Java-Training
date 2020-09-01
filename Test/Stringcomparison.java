package com.Test;
import java.util.Scanner;

public class Stringcomparison {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first string:");
	   String s1 = sc.next();
	   System.out.println("Enter the second string:");
	   String s2 = sc.next();
	   System.out.println(s1.equals(s2));
	   System.out.println();
	   System.out.println(s1.compareTo(s2));
	   System.out.println(s2.compareTo(s1));	   

	}

}
