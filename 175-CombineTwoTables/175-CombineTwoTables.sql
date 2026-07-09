-- Last updated: 09/07/2026, 15:08:44
# Write your MySQL query statement below
# Write your MySQL query statement below
select Person.firstName, Person.lastName, Address.city ,Address.state 
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;
