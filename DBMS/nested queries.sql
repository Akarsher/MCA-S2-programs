4 - SELECT crs_name,(SELECT COUNT(DISTINCT std_id)FROM Grades WHERE crs_id = Courses.crs_id) AS num_students FROM Courses;
5 - 

1: select std_name from student where major='science';
2: select std_name from student where std_name like 'a%';
3: select avg(mark),crs_id from grades group by crs_id;
4: SELECT c.crs_name, AVG(g.mark) FROM Grades g JOIN Courses c ON g.crs_id = c.crs_id GROUP BY c.crs_name HAVING AVG(g.mark) > 85;
5: select * from student order by std_name asc;
6: SELECT s.std_name, c.crs_name FROM Student s INNER JOIN Grades g ON s.std_id = g.std_id INNER JOIN Courses c ON g.crs_id = c.crs_id;
7: SELECT s.std_name, c.crs_name FROM Student s LEFT JOIN Grades g ON s.std_id = g.std_id LEFT JOIN Courses c ON g.crs_id = c.crs_id;
8: SELECT s.std_name, g.crs_id, g.mark FROM Student s JOIN Grades g ON s.std_id = g.std_id WHERE g.mark > ANY (SELECT AVG(mark) FROM Grades WHERE g.crs_id = Grades.crs_id GROUP BY crs_id);
9: SELECT s.std_name, g.crs_id, g.mark FROM Student s JOIN Grades g ON s.std_id = g.std_id
WHERE g.mark >= ALL (SELECT mark FROM Grades WHERE crs_id = (SELECT crs_id FROM Courses WHERE crs_name = 'Math 101' ));
10: 
