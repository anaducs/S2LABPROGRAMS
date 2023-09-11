drop database employee;

create database employee;

use employee;

create table employee(emp_id int primary key, emp_name varchar(25),dept_id varchar(10),manager_id varchar(15));

create table department( dept_id varchar(10) primary key, dept_name varchar(20));

create table manager(manager_id varchar(15) primary key, manager_name varchar(20),dept_id varchar(10));

create table project(project_id varchar(20), project_name varchar(29),member_id varchar(20));

insert into employee values (101,"rahul","d1","m1"),(102,"manoj","d1","m1"),(103,"geetha","d2","m2"),(104,"shyam","d3","m2"),(105,"rohith","d4","m3");

insert into department values("d1","sales"),("d2","marketting"),("d3","finance"),("d4","hr");

insert into manager values("m1","anagha","d1"),("m2","nimya","d2,d3"),("m3","anandu","d4"),("m4","anamika","d5");

insert into project values("p1","data mining", "m1"),("p2","web scrap", "101"),("p3","e-cart", "106");

select * from employee;

select * from department;

select * from manager;

select * from project;
/* inner join*/

select employee.emp_name,department.dept_name from employee inner join department on employee.dept_id = department.dept_id;

select employee.emp_name,project.member_id from employee  inner join project  on employee.emp_id = project.member_id;

/*--left join*/

select e.emp_name,d.dept_name from employee e left join department d on e.dept_id = d.dept_id;

/*--right join*/

select e.emp_name,d.dept_name from employee e right join department d on e.dept_id = d.dept_id;

/*--mix*/

select e.emp_name,d.dept_name,m.manager_name,p.project_name from employee e left join department d on e.dept_id = d.dept_id inner join manager m on m.manager_id = e.manager_id inner join project p on p.member_id = e.emp_id;

/* natural joim */

select emp_name from employee natural join manager;