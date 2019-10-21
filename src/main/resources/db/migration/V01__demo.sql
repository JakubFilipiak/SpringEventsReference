create table author
(
    id         serial primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null
);

create table book
(
    id        serial primary key,
    author_id int          not null,
    title     varchar(255) not null
);

insert into author (first_name, last_name)
values ('Cay S.', 'Horstman');
insert into author (first_name, last_name)
values ('Robert C.', 'Martin');

insert into book (author_id, title)
values (1, 'Core Java Volume I--Fundamentals (10th Edition)');

insert into book (author_id, title)
values (2, 'Clean Code');

insert into book (author_id, title)
values (2, 'Clean Architecture');

insert into book (author_id, title)
values (2, 'Agile Software Development, Principles, Patterns, and Practices');
