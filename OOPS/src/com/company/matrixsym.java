package com.company;

import java.util.Scanner;

public class matrixsym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col,i,j;
		boolean flag=true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num of rows:");
		row = s.nextInt();
		s.nextLine();
		System.out.println("Enter num of col:");
		col = s.nextInt();
		s.nextLine();
		int mat1[][]=new int[3][3];
	    System.out.println("Enter elements of matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat1[i][j]=s.nextInt();
			System.out.println();
			}
			
		}
		System.out.println("Entered matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose of Entered matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat1[j][i]+"\t");
			}
			System.out.println();
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(mat1[i][j]!=mat1[j][i])
				{
					 flag=false;
				}
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Symmetric");
		}
		else 
		{
			System.out.println("not Symmetric");
		}
	}

}
