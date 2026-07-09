-- Last updated: 09/07/2026, 15:08:35
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary