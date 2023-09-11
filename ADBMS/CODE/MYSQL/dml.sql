drop database org;


create database org;

use org;

create table employee(emp_no int primary key, emp_name varchar(25),dob date,address varchar(60),mob int,dept_num varchar(15),salary int,designation varchar(20));

create table department(dept_num varchar(15) primary key, dept_name varchar(20),location varchar(25));

show tables;

insert into employee values(101,"john","1990-02-12","cherthala","8921767292","D01",35000,"professor"),
(102,"jame","1990-06-18","mararikulam","8921767294","D01",35000,"professor"),(103,"vishnu","1990-02-12","chethy","8921767296","D02",55000,"HOD"),
(104,"SHIV","1998-05-15","Mararikulam","8921767393","D01",100000,"MANAGER"),(105,"nabi","1960-02-12","cherthala","8921767299","D01",7000,"peon");

insert into department values("d01","mca","block A"),("d02","bba","block A"),("d03","bca","block b"),("d04","mba","block b"),("d05","btech","block c");

select * from employee;

select * from department;

select emp_no,emp_name from employee where dept_num = 2;

select emp_no,emp_name,dept_num,salary,designation from employee order  by salary desc;

select emp_no,emp_name from employee where salary between "5000" and "50000";

update employee set salary = "150000" where designation = "manager";

select * from employee;

update employee set mob = " 9142706015" where emp_name = "john";

select * from employee;

delete from employee where salary = "7000";

select emp_name,mob from employee where emp_name like "s%";

select emp_no,emp_name,salary from employee where designation = "hod" or designation = " manager";




