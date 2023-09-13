package com.company;

public class overloaded {
	void calcarea(float r)
	{
		System.out.println("Area of Square :"+r*r);
	}
	void calcarea(float x, float y)
	{
		System.out.println("Area of rectangle :"+x*y);
	}
	void calcarea(double r)
	{
		System.out.println("Area of circlee :"+3.14*r*r);
	}
}
