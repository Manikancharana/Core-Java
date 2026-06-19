create database movies;
use movies;
create table movies (n0 int , M_name varchar(10), Hero varchar(10), director varchar(10), rating int , collection long , budget varchar(10));
select * from movies;
rename table movies to netflix;
alter table netflix modify collection bigint;

insert into netflix values(1,"Dragon","NTR","Neel",5,10000000,100000),(2,"RRR","NTR","Raj mouli",4.5,5000000,900000),(3,"KGf","Yesh","Neel",4,9100000,540000),
(4,"Jai lava","NTR","Mani",4,900000,300000),(5,"Dhurandhar","Varun","Sai",5,4000000,300000),(6,"Peddi","Ram charan","Buchi",4.5,8500000,6300000);

insert into netflix values(7,"Bhahubali","Prabash","raj mouli",4,9000000,500000),(8,"Puspha","AA Bhai","Sukumar",3,8000000,50000000);

alter table netflix modify M_name varchar(30);
insert into netflix values(9,"Bhahubali-2","Prabash","raj mouli",5,100000000,1000000),(10,"NTR","Yama donga","raj mouli",5,9800000,800000);
select * from netflix;

select * from netflix where rating>4;

select * from netflix where hero="NTR";

select * from netflix where director="raj mouli";

select * from netflix where director= "raj mouli" and hero="NTR";

alter table netflix modify column budget long;

select * from netflix where rating between 3 and 4.5;

select * from netflix where rating=null;

select count(M_name) from netflix where hero="NTR" ;

select (director) from netflix;

select count(distinct director) from netflix;

select max(collection)from netflix;

select min(collection) from netflix;

select sum(collection) from netflix where hero="NTR";

select max(collection) as High , min(collection)  Low from netflix where hero="AA bhai";

select max(collection) from netflix
 where collection <(select max(collection) from netflix
 where collection <(select max(collection) Firsthigh from netflix));
 
 select M_name from netflix 
 where collection >(select avg(collection) from netflix);
 
 select M_name from netflix
 where collection !=(select max(collection) from netflix) and collection != (select min(collection) from netflix); 
 
 select * from netflix;
 
 delete from netflix where n0 =10;
 
 select (M_name) from netflix where hero="AA bhai";
 
 