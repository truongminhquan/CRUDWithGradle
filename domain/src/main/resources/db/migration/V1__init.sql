create table book (
	id SERIAL primary key,
	title varchar (255) not null,
	description varchar (255) not null
);

insert into book (title, description) values ('title1', 'description1');
insert into book (title, description) values ('title2', 'description2');
insert into book (title, description) values ('title3', 'description3');