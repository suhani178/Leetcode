# Write your MySQL query statement below
SELECT E.name,B.bonus from Employee E 
left join Bonus B
ON E.empId = B.empId
where bonus <1000 or bonus IS NULL;