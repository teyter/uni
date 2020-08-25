SELECT starName
FROM starsIn
WHERE starName
NOT IN (
    SELECT starName
    FROM starsIn
    WHERE movieYear = 1977 );

SELECT Studio.address 
FROM Studio, MovieStar, StarsIn
WHERE Movie.studioName = Studio.name
AND starsIn.starName = MovieStar.name;
