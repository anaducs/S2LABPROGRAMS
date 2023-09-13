package com.company;
import arithmetic.*;
import java.util.Scanner;
public class CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter 2nd number :");
		int b=sc.nextInt();
		sc.nextLine();
		Arithmetic_operation ap = new Arithmetic_operation(a,b);
		System.out.println("Sum is : "+ap.add());
		System.out.println("after subtraction ans is : "+ap.sub());
		System.out.println("ans is : "+ap.div());
		System.out.println("product is : "+ap.mul());
	}

}
