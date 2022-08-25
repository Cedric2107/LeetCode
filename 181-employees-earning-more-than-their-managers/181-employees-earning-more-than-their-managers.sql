/* Write your PL/SQL query statement below */


SELECT e.name as "Employee" FROM Employee e JOIN Employee b on e.managerId=b.id WHERE e.salary>b.salary