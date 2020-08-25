CREATE TABLE Product ( 
    maker varchar(255),
    model varchar(255),
    type varchar(255)
    PRIMARY KEY(maker, model)
);

CREATE TABLE PC (
    model varchar(255),
    speed int,
    ram int,
    hd int,
    price int
    PRIMARY KEY(maker)
);

CREATE TABLE Laptop (
    model varchar(255),
    speed int,
    ram int,
    ram int,
    hd int,
    screen int,
    price int
    PRIMARY KEY(maker)
);

CREATE TABLE Printer (
    model varchar(255),
    color int,
    type varchar(255),
    price int
    PRIMARY KEY(maker)
);
