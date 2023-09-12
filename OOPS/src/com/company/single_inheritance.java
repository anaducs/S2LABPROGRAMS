package com.company;
import java.util.Scanner;

public class single_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        teacher[] teacherArray = new teacher[n];
        int id;
        float salary;
        String dept, name, address, subject;

        for (int i = 0; i < n; i++) {
            int t = i + 1;
            System.out.println("\nEnter details of teacher " + t);
            System.out.println("Teacher id: ");
            id = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Teacher Name: ");
            name = sc.nextLine();

            System.out.println("Teacher salary: ");
            salary = sc.nextFloat();
            sc.nextLine(); 

            System.out.println("Teacher address: ");
            address = sc.nextLine();

            System.out.println("Teacher department: ");
            dept = sc.nextLine();

            System.out.println("Teacher subject: ");
            subject = sc.nextLine();

            teacherArray[i] = new teacher(id, name, salary, address, dept, subject);
        }

        System.out.println("Teacher Details are:");
        for (teacher x : teacherArray) {
            x.display();
            System.out.println(); 
        }
    }
}
