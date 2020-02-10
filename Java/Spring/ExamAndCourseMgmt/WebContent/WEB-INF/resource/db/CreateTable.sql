create table register
(
	id int primary key,
	name varchar(50),
	email varchar(80),
	contact varchar(10),
	gender varchar(7),
	password varchar(16)
);

create sequence register_seq;

