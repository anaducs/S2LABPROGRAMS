package com.company;
import graphics.*;
import java.util.Scanner;
public class graphicmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double ss1,ss2,ts1,ts2,ts3,r;
		System.out.println("Enter radius of circle :");
		r=sc.nextDouble();
		sc.nextLine();
		gcircle c = new  gcircle(r);
		System.out.println("Area of circle :"+c.calcarea());
		System.out.println("Enter side 1 of square :");
		ss1=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter side 2 of square :");
		ss2=sc.nextDouble();
		sc.nextLine();
		Square s =new Square(ss1,ss2);
		System.out.println("Area of Square :"+s.calcarea());
		System.out.println("Enter side 1 of triangle :");
		ts1=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter side 2 of triangle :");
		ts2=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter side 3 of triangle :");
		ts3=sc.nextDouble();
		sc.nextLine();
		triangle t =new triangle(ts1,ts2,ts3);
		System.out.println("Area of triangle :"+t.calcarea());
	}

}
