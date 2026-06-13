use student;
create table student(n0 int, stdName varchar(10),stdMarks varchar(10));
select * from student;

insert into student values(1,"Mani",90),(2,"Varun",99),(3,"Meghana",99),(4,"sai",90);

update student set stdName="Hima" where n0=1;

select * from student;

alter table student add attendence float;

select * from student;

alter table student modify attendence int;

update student set attendence=1 where n0=1;

alter table student drop attendence;

rename table student to students;

alter table students rename column stdName to Name;

select *from students;

delete from students where n0=3;

insert into students values(3,"Meghana",99);

create table employee