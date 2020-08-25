create table R (
    a int,
    b int
);
create table S (
    b int,
    c int,
    d int
);
insert into R(a,b)
values
(11,22),
(33,44),
(55,66);
insert into S(b,c,d)
values
(22,44,66),
(44,66,88),
(44,77,99);

/* ef vinstri hlid er ekki superkey tha ekki BCNF*/
