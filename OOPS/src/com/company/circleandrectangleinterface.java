package com.company;
import java.util.Scanner;
public class circleandrectangleinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		circle obj = new circle();
		rectangle obj1 = new rectangle();
		
		int ch;
		do
		{
		System.out.println("Select shape you want to find area of ");
		System.out.println("1.Area of circle \n 2.Area of rectangle \n 3.Perimeter of Circle \n 4.Perimeter of Rectangle \n 5.exit");
		
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			obj.input();
			obj.area();
			break;
		case 2:
			obj1.input();
			obj1.area();
	         break;
		case 3:
			obj.input();
			obj.perimeter();
			break;
		case 4:
			obj1.input();
			obj1.perimeter();
			break;
		case 5:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Choose a value between 1-5");
			break;
		}
		
	}while( ch!=5);
	}

}