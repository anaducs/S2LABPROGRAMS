CREATE TABLE student1( name VARCHAR(20),id int primary key, sex VARCHAR(6),salary int);

INSERT INTO student1 VALUES ('John Doe', 1, 'Male', 50000);
  INSERT INTO student1 VALUES  ('Jane Smith', 2, 'Female', 55000);
   INSERT INTO student1 VALUES ('Bob Johnson', 3, 'Male', 48000);
   INSERT INTO student1 VALUES ('Alice Brown', 4, 'Female', 52000);
   INSERT INTO student1 VALUES ('Charlie Wilson', 5, 'Male', 51000);
	
SELECT * FROM student1;	
	
UPDATE student1 set salary = 60000 where name ='John Doe';


SELECT * FROM student1;


DELETE from student1 where salary = 52000;


COMMIT;

DELETE from student1 where salary = 51000;

SELECT * FROM student1;

rollback;

SELECT * FROM student1;