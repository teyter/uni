SELECT starName
FROM StarsIn
INNER JOIN MovieStar
ON StarsIn.starName = MovieStar.name
WHERE StarsIn.movieTitle = 'Titanic'
AND gender = 'M';

SELECT starName
FROM StarsIn
INNER JOIN Movie
ON StarsIn.movieTitle = Movie.title
WHERE Movie.studioName = 'MGM'
AND year = 1980;

SELECT name
FROM MovieExec
INNER JOIN Studio
ON MovieExec.name = Studio.presC

SELECT title
FROM Movie
WHERE length > (
    SELECT length 
    FROM Movie
    WHERE title = 'Star Wars'
);

SELECT name
FROM MovieExec
where netWorth > (
    SELECT netWorth
    FROM MovieExec
    WHERE name = 'Merv Griffin'
);
