package com.company;

public class employee {
    int empid;
    float salary;
    String name, address;

    employee() {

    }

    employee(int eid, String name, float sal, String addrss) {
        this.empid = eid;
        this.salary = sal;
        this.name = name;
        this.address = addrss;
    }
}

