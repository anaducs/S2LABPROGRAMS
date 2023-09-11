create table person(person_id int primary key, name varchar(30) not null, aadhaar int not null unique, age int,check(age>18));
create table ordertable(order_id int primary key, order_number int not null, person_id int, foreign key(person_id) references person(person_id));
desc person;
desc ordertable;

