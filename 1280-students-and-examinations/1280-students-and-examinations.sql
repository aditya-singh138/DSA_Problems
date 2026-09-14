# Write your MySQL query statement below
SELECT s.student_id,
       s.student_name,
       sub.subject_name,
       COUNT(e.subject_name) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
ON sub.subject_name = e.subject_name AND s.student_id = e.student_id
GROUP BY student_name, student_id, subject_name
ORDER BY student_id, subject_name;