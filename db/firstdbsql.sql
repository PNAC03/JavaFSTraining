CREATE DATABASE firstdb;
USE firstdb;

CREATE TABLE students(
roll_num int,
student_name varchar(50),
course_id int,
PRIMARY KEY(roll_num)
);

insert into students values(1,'Monu', 21);
insert into students values(2,'Sonu', 22);
insert into students values(3,'Name3', 23);
insert into students values(4,'Name4',24);
insert into students values(5,'Monu',21);
Select * from students;

Select * from students
where student_name = 'Monu';

Select * from students
where student_name ='Sonu'
and (course_id = 22
OR course_id = 23);

DELETE FROM `firstdb`.`students`
WHERE roll_num=5;


UPDATE `firstdb`.`students`
SET course_id = 5, student_name='spcial'
WHERE roll_num=4;


