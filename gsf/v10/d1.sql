-- all employees who have supervisor
SELECT fname,lname
FROM employee
WHERE super_ssn NOT NULL;

-- employees who have subordinates
SELECT fname,lname
FROM employee
WHERE NOT EXISTS (
    SELECT ssn
    FROM employee
    WHERE NOT EXISTS (
        SELECT super_ssn
        FROM employee
        WHERE ssn = super_ssn
    )
);

SELECT Fname
FROM EMPLOYEE E1
WHERE E1.Super_ssn NOT NULL
AND EXISTS (
    SELECT Ssn
    FROM EMPLOYEE E2
    WHERE E1.Ssn = E2.Super_ssn
);
