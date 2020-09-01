package com.Test;

public class car extends Vehicle {
	car(String reg , String nme, int m )
    {
        super(reg, nme, m);
        
    }
    void display()
    {
    System.out.println("Car Details:");
    super.display();
}
}