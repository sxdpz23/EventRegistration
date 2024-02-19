show databases;
drop database if exists registration;
create database registration;
use registration;
show tables;

create table registered_users (
	id int not null auto_increment,
	name varchar(20) not null ,
    email varchar(50) not null,
    phone long not null,
    city varchar(20) not null,
    grade int not null,
    state varchar(20) not null,
    school varchar(50) not null,
    constraint registered_users_pk primary key ( id )
);

create table otp (
	email varchar(50) not null,
    code varchar(6) not null,
    constraint otp_pk primary key ( email )
);

create table temp (
	name varchar(20) not null ,
    email varchar(50) not null,
    phone long not null,
    city varchar(20) not null,
    grade int not null,
    state varchar(20) not null,
    school varchar(50) not null,
    constraint temp_pk primary key ( email )
);

create table events_registration (
	userId int not null, 
    date Date not null, 
    constraint events_registration_pk primary key ( userId )
);

show tables;

insert into registered_users(name, email, phone, city, grade, state, school) values ('Shantanu', 'shantanu@gmail.com', 9823942446, 'Pune', 9, 'Maharashtra', 'AECS'); 
insert into registered_users(name, email, phone, city, grade, state, school) values ('Sameer', 'sameer@gmail.com', 8394023657, 'Mumbai', 8, 'Maharashtra', 'AECS'); 

insert into otp(email, code) values ('shantanu@gmail.com', 'SBD78S');
insert into otp(email, code) values ('sameer@gmail.com', 'SYBFOT');

select * from registered_users;
select * from otp;
select * from temp;
select * from events_registration;

drop table registered_users;
drop table registration.otp;
drop table registration.temp;
drop table registration.events_registration;