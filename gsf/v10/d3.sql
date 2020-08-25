-- which employee works on what project
SELECT lname, pname, pnumber
FROM employee e
INNER JOIN works_on w
ON e.ssn = w.essn
INNER JOIN project p
ON p.pnumber = w.pno
WHERE p.dnum != e.dno;

-- d3
SELECT lname
FROM employee e
INNER JOIN works_on w
On e.ssn = w.essn
WHERE NOT EXISTS (
    SELECT essn
    FROM works_on
);

SELECT lname
FROM employee
WHERE NOT EXISTS (
    SELECT * 
    FROM projects
    WHERE NOT EXISTS (
        SELECT *
        FROM works_on
        WHERE essn = ssn
    )
);
