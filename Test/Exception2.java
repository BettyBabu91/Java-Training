package com.Test;

public class Exception2 {

	public static void main(String[] args) 
	{
		try {
		    
            int a[] = new int[9];
            System.out.println(a[10]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        e.printStackTrace();
    }
    System.out.println( "Exception recived" );
	}

}
