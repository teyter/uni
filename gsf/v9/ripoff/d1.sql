Create Table Movies (
    title varchar(255),
    year int,
    length int,
    genre varchar(255),
    primary key(title, year),
    Foreign Key(name) References Studios(name)
);
Create Table Stars (
    name varchar(255),
    address varchar(255),
    Primary Key(name)
);
Create Table Studios (
    name varchar(255),
    address varchar(255),
    Primary Key(name)
);
Create Table StarsIn (
    starName varchar(255),
    movieTitle varchar(15),
    movieYear int,
    Primary Key(starName, movieTitle, movieYear),
    Foreign Key(starName) References Stars(name),
    Foreign Key(movieTitle, movieYear) references Movies(title, year)
);
