package com.company;

public class teacher extends employee {
    String dept, sub;

    teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.dept = department;
        this.sub = subject;
    }

    public void display() {
        System.out.println("Teacher ID: " + empid);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Address: " + address);
        System.out.println("Teacher Department: " + dept);
        System.out.println("Teacher Subject: " + sub);
    }
}
