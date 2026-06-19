use movies;

select * from netflix;

select * from netflix 
order by collection desc;

select * from netflix 
order by collection 
limit 3;

select director,count(M_name) as Count from netflix 
group by director ;

select hero, min(collection), max(collection) from netflix group by hero;

select director from netflix 
group by director having  count(*)>=3 ;

select director, hero,sum(collection) from netflix 
group by director ,hero;

select hero,sum(collection) as totalCollection from netflix where collection >5000000 group by hero order by collection desc;
 
select * from netflix order by collection desc limit 1 offset 2;

select * from netflix order by collection desc;

select case(10%2) when 0 then 'Even' 
when 1 then 'Odd' end as EvenOdd ;

create table employee (eId int , eName varchar(20),designation varchar(10), salary bigint);
select * from employee;
insert into employee values(1,"mani","manager",1000000),(2,"sai","teamlead",2000000),(3,"harish","manager",300000),(4,"vamsi","teamlead ",500000),(5,"varun","teamlead",8000000);

select case(designation) when "manager" then salary+5000 when "teamlead" then salary+2000 else salary end as new_salary from employee ;

select eName,(new_salary_salary)increment ,
(select *, case designation when "manager" then salary+5000 when "teamlead" then salary+2000 else salary end as new_salary from employee) as t1;

with cte1 as (select * , case designation when "manager" then salary+5000 when "teamlead" then salary+2000 else salary end as new_salary from employee) select Ename,(new_salary) increment from cte1;

select * from student;

insert into student values(5,"shiva", 99),(6,"chandu",89),(7,"vamshi",69);

insert into employee values(6,"maani","teamlead",950000),(7,"maaha","teamlead",950000),(8,"man","manager",950000);
select * , case 
when stdMarks>90 then "Excellent "
when stdMarks>80 then "Very good"
when stdMarks>70 then "good "
when stdMarks>60 then "ok "
else "Need to  impove "
end from employee;

select * from employee where eName not like '%s%';

select * from employee where eName like '&a%a';

select * from employee where eName like '___';

select *from employee where eName like '___h_';

select * from employee where eName like '%a%a' and eName not like '%a%a%a';

insert into employee values(11,"aaaa","teamlead",90000);

 select *,rank() over (order by stdMarks desc) Ranking from student;
 
 select *,dense_rank() over(order by stdMarks desc ) denseranking from student; 


