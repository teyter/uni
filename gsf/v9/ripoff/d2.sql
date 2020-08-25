Create Table Studios (
    name varchar(255),
    address varchr(255),
    Primary Key(name)
);
Create Table Crews (
    studioName varchar(255),
    number int,
    crewChief varchar(255),
    Primary Key(studioName, number),
    Foreign Key(studioName) References Studios(name)
);
