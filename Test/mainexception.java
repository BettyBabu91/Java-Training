package com.Test;

public class mainexception {

	public static void main(String[] args) {
		try {
            getexceptionB();
        }
        catch(ExceptionA eA1 )
        {
            eA1.printStackTrace();
        }
        
        try {
            getexceptionC();
        }
        catch(ExceptionA eA1 )
        {
            eA1.printStackTrace();
        }
    }
        public static void getexceptionA() throws ExceptionA
        {
            throw new ExceptionA("Exception A");
            
        }
        public static void getexceptionC() throws ExceptionA
        {
            throw new ExceptionC("Exception c");
        
        }
        public static void getexceptionB() throws ExceptionA
        {
            throw new ExceptionB("Exception B");
        
            
        }
}
