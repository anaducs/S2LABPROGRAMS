package com.company;
import java.util.Scanner;
public class overloadmain {

	public static void main(String[] args) {
		float side,side1,side2;
		double rad;
		Scanner s = new Scanner(System.in);
		overloaded obj = new overloaded();
		System.out.println("Enter side of Square :\t \n");
		side=s.nextFloat();
		s.nextLine();
		obj.calcarea(side);
		
		System.out.println("Enter side of Rectangle side 1:\t \n");
		side1=s.nextFloat();
		s.nextLine();
		System.out.println("Enter side of Rectangle side 2:\t \n");
		side2=s.nextFloat();
		s.nextLine();
		obj.calcarea(side1, side2);
		System.out.println("Enter side of Circle : \t\n");
		rad=s.nextDouble();
		s.nextLine();
		obj.calcarea(rad);
	
	}

}
