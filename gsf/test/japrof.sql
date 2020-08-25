CREATE TABLE Scores (
    Team varchar(255),
    Opponent varchar(255),
    RunsFor int,
    RunsAgainst int
);

insert into Scores(Team,Opponent,RunsFor,RunsAgainst)
values
('Dragons','Tigers',5,3),
('Carp','Swallows',4,6),
('Bay Stars','Giants',2,1),
('Marines','Hawks',5,3),
('Ham Fighters','Buffaloes',1,6),
('Lions','Golden Eagles',8,12),
('Tigers','Dragons',3,5),
('Swallows','Carp',6,4),
('Giants','Bay Stars',1,2),
('Hawks','Marines',3,5),
('Buffaloes','Ham Fighters',6,1),
('Golden Eagles','Lions',12,8);
