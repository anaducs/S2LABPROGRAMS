package com.company;
import java.util.Scanner;
public class circle implements AP {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=pi*r*r;
System.out.println("Area of circle :"+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
perimeter=2*Math.PI*r;
System.out.println("perimeter of circle :"+perimeter );
	}
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	Scanner s= new Scanner(System.in);
public void input()
{System.out.println("Enter radius :");
r=s.nextInt();


}
}
