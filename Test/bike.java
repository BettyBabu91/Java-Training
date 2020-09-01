package com.Test;

public class bike extends Vehicle {
	bike(String reg , String nme, int m)
    {
    super(reg , nme, m);
    }
    void display()
    {
        System.out.println("Bike Details:");
        super.display();
    }
}