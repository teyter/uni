SELECT fname
FROM employee
WHERE EXISTS (
    SELECT *
    FROM department 
    WHERE EXISTS (
        SELECT *
        FROM project 
        WHERE EXISTS (
            SELECT *
            FROM works_on
            WHERE ssn = mgr_ssh
            AND NOT dnumber = dnum
            AND pnumber = pno
        )
    )
)

SELECT lname, ss, hours, super_ssn
FROM employee
JOIN works_on
WHERE ssn = essn;
-- which employee works on what project
SELECT lname, pname, pnumber
FROM employee e
INNER JOIN works_on w
ON e.ssn = w.essn
INNER JOIN project p
ON p.pnumber = w.pno
WHERE p.dnum != e.dno;
