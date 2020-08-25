CREATE TABLE Stars (
    name varchar(255),
    address varchar(255),
    primary key(name)
);

CREATE TABLE Movies (
    title varchar(255),
    year int,
    length int,
    gendre varchar(255),
);

CREATE TABLE Studios (
    name varchar(255),
    address varchar(255)
);

CREATE TABLE StarsIn (
    movieTitle varchar(255),
    movieYear int,
    starName varchar(255),
    foreign key(movieTitle) references Movies(title)
);
