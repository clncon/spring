create database if not exists spring;
use spring;
drop table if exists user;
create table if not exists user(
  id int primary key auto_increment,
  name varchar(20),
  age int 
);


drop table if exists log;

create table if not exists log(
  id int primary key auto_increment,
  message varchar(50)
);