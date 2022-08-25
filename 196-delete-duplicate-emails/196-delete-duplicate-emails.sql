/*
 Please write a DELETE statement and DO NOT write a SELECT statement.
 Write your PL/SQL query statement below
 */

      DELETE FROM Person p3 where p3.id IN (SELECT p2.id
                                          from Person p JOIN Person p2 on p.email=p2.email WHERE p.id!=p2.id AND p.id<p2.id);