-- Last updated: 09/07/2026, 15:07:35
select name from Employee
where id IN ( select managerId from Employee
group by managerId
having count(*)>=5);