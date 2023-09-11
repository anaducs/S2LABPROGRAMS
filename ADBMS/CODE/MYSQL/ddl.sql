create table student (roll_no int primary key, Name varchar(30), DOB date, Address varchar(40), Mob int, Blood_group varchar(30));
create table course( course_id varchar(30) primary key, course_name varchar(30),course_duration varchar(25));
show tables;
desc student;
desc course;
alter table student add column(aadhaar_number int);
desc student;
alter table student modify column mob varchar(11);
desc student;
truncate table student;
rename table student to student_details;
drop table student;
drop table course;
show tables;

