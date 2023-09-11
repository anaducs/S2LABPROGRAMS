/* login as root user*/
drop database college;
drop user 'cs'; 

create database college;

use college;

create table student(id int primary key, name varchar(20));

desc student;

create user cs IDENTIFIED BY '1998';

grant select,insert,update on student to cs;


