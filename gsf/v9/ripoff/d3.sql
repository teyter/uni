Create Table Customers (
    ssno varchar(255),
    name varchar(255),
    address varchar(255),
    phone varchar(255),
    Primary Key(ssno)
);
Create Table Flights (
    number varchar(15),
    day date,
    aircraft varchar(255),
    Primary Key(number, day)
);

Create Table Bookings (
    row int,
    seat char,
    ssno varchar(255),
    day date,
    number varchar(255),
    Primary Key(ssno, day, number),
    Foreign Key(ssno) References Customers(ssno),
    Foreign Key(day, number) References Flights(day, number)
);
