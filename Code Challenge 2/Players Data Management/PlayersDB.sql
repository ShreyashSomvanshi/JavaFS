show databases;

create database if not exists playersdata;

use playersdata;

create table players(id int, pname varchar(50), 
skill varchar(30), exp int, country varchar(50), 
overall_score double);

-- drop table players;

desc players;

select * from players;



