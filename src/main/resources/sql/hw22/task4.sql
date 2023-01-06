SELECT * FROM Customer
WHERE firstName LIKE 'A%';

SELECT * FROM Customer
WHERE country = 'Ukraine';

SELECT * FROM Customer
WHERE sex = 'male';

UPDATE Customer
SET country = 'USA'
WHERE dateOfBirth < '2000-01-01';

DELETE FROM Customer
WHERE country = 'Russia';

SELECT firstName FROM Customer
GROUP BY firstName;

SELECT * FROM Customer
ORDER BY dateOfBirth DESC;



