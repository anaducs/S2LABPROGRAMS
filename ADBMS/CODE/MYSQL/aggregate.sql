drop database aggregate;

create database aggregate;

use aggregate;

create table department( dept_id varchar(10) primary key, dept_name varchar(20));

create table staff( staff_id varchar(15) primary key, staff_name varchar(20), designation varchar(20),Qualification varchar(20), type_of_appointment varchar(20),dept_id varchar(20),salary int, foreign key(dept_id) references department(dept_id ));

/*-- Insert 5 rows into the "department" table*/
INSERT INTO department (dept_id, dept_name)
VALUES
  ('D1', 'Sales'),
  ('D2', 'Marketing'),
  ('D3', 'Finance'),
  ('D4', 'HR'),
  ('D5', 'IT');

/*-- Insert 5 rows into the "staff" table*/
INSERT INTO staff (staff_id, staff_name, designation, Qualification, type_of_appointment, dept_id, salary)
VALUES
  ('S1', 'John', 'Manager', 'MBA', 'Full-time', 'D1', 75000),
  ('S2', 'Alice', 'Analyst', 'B.Sc', 'Full-time', 'D2', 60000),
  ('S3', 'Bob', 'Accountant', 'B.Com', 'part-time', 'D3', 45000),
  ('S4', 'Eve', 'HR Specialist', 'MBA', 'Full-time', 'D4', 65000),
  ('S5', 'David', 'Developer', 'B.Sc', 'Full-time', 'D5', 70000),
  ('S6', 'James', 'Marketing', 'MBA', 'Full-time', 'D1', 58000);

select * from staff;

select * from department;


select count(staff_id) as pcount,dept_name from staff inner join department where type_of_appointment="part-time" and staff.dept_id = department.dept_id GROUP by staff.staff_id ;


select count(staff_id) as pcount,dept_name from staff inner join department where Qualification="MBA" and staff.dept_id = department.dept_id GROUP by department.dept_name;

select AVG(salary) as average_salary,dept_name from staff inner join department on staff.dept_id = department.dept_id  group by dept_name;

select staff_name,department.dept_id,max(salary) as highest_paid from staff inner join department on staff.dept_id = department.dept_id  group by dept_name;

select SUM(salary) as total_salary,dept_name from staff inner join department on staff.dept_id = department.dept_id  group by dept_name;
