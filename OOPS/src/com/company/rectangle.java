package com.company;
import java.util.Scanner;
public class rectangle implements AP {

	@Override
	public void area() {
		// TODO Auto-generated method stub
area=l*b;
System.out.println("Area of Rectangle :"+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*(l+b);
		
		System.out.println("perimeter of Rectangle :"+perimeter );

	}
	Scanner s= new Scanner(System.in);
	double l=0,b=0,area=0,perimeter=0;
public void input()
{ 
	System.out.println("Enter length :");
	l=s.nextDouble();
	s.nextLine();
	System.out.println("Enter Breadth :");
	b=s.nextDouble();
	s.nextLine();
}
}
