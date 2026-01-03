-- Create Database
CREATE DATABASE CollegeDB;

-- Use Database
USE CollegeDB;

-- Create Table
CREATE TABLE Student (
    id INT PRIMARY KEY,                 -- Primary Key (unique + not null)
    name VARCHAR(50) NOT NULL,           -- Not Null constraint
    age INT CHECK (age >= 18),           -- Check constraint
    email VARCHAR(100) UNIQUE,           -- Unique constraint
    dept_id INT,
    city VARCHAR(30) DEFAULT 'Unknown'   -- Default value
);

-- Insert Data
INSERT INTO Student VALUES (1, 'Alpha', 20, 'alpha@gmail.com', 101, 'Pune');
INSERT INTO Student VALUES (2, 'Kinjal', 22, 'kinjal@gmail.com', 102, 'Mumbai');

-- Select all records
SELECT * FROM Student;

-- Select specific columns
SELECT name, age FROM Student;

-- DISTINCT (remove duplicates)
SELECT DISTINCT city FROM Student;

-- WHERE condition
SELECT * FROM Student WHERE age > 20;

-- AND / OR
SELECT * FROM Student WHERE age > 18 AND city = 'Pune';

-- ORDER BY
SELECT * FROM Student ORDER BY age DESC;

-- LIKE (pattern matching)
SELECT * FROM Student WHERE name LIKE 'A%';   -- Starts with A

-- Wildcards
SELECT * FROM Student WHERE name LIKE '%al';  -- Ends with 'ul'

-- IN
SELECT * FROM Student WHERE city IN ('Pune', 'Mumbai');

-- BETWEEN
SELECT * FROM Student WHERE age BETWEEN 18 AND 22;

-- ALIAS
SELECT name AS Student_Name, age AS Student_Age FROM Student;

-- TOP (SQL Server)
SELECT TOP 1 * FROM Student;

-- NULL values
SELECT * FROM Student WHERE email IS NULL;

-- JOINS

-- Department table (Parent)
CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

-- Employee table (Child)
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT
);

INSERT INTO Department VALUES
(10, 'IT'),
(20, 'HR'),
(30, 'Finance');

INSERT INTO Employee VALUES
(1, 'Rahul', 10),
(2, 'Amit', 20),
(3, 'Neha', NULL);

--INNER JOIN
SELECT e.emp_name, d.dept_name
FROM Employee e
INNER JOIN Department d
ON e.dept_id = d.dept_id;

--LEFT JOIN
SELECT e.emp_name, d.dept_name
FROM Employee e
LEFT JOIN Department d
ON e.dept_id = d.dept_id;

--RIGHT JOIN
SELECT e.emp_name, d.dept_name
FROM Employee e
RIGHT JOIN Department d
ON e.dept_id = d.dept_id;

--FULL JOIN
SELECT e.emp_name, d.dept_name
FROM Employee e
FULL JOIN Department d
ON e.dept_id = d.dept_id;

--SELF JOIN
-- Example: Manager–Employee relationship
SELECT e1.emp_name AS Employee, e2.emp_name AS Manager
FROM Employee e1
LEFT JOIN Employee e2
ON e1.dept_id = e2.emp_id;

--CROSS JOIN
SELECT e.emp_name, d.dept_name
FROM Employee e
CROSS JOIN Department d;

--UNION
SELECT city FROM Student
UNION
SELECT dept_name FROM Department;

--INSERT INTO SELECT
CREATE TABLE Student_Backup (
    id INT,
    name VARCHAR(50)
);

INSERT INTO Student_Backup
SELECT id, name FROM Student;


--CREATE INDEX
CREATE INDEX idx_student_name ON Student(name);



--UPDATE & DELETE
-- Update data
UPDATE Student SET city = 'Pune' WHERE id = 2;

-- Delete data
DELETE FROM Student WHERE id = 2;

--ALTER, DROP
-- Add column
ALTER TABLE Student ADD marks INT;

-- Drop column
ALTER TABLE Student DROP COLUMN marks;

-- Drop table
DROP TABLE Student_Backup;


--AUTO INCREMENT (IDENTITY in SQL Server)
CREATE TABLE Employees (
    emp_id INT IDENTITY(1,1),   -- Auto Increment
    emp_name VARCHAR(50)
);

--GROUP BY, HAVING, FUNCTIONS

-- Aggregate functions
SELECT COUNT(*) FROM Student;
SELECT AVG(age) FROM Student;
SELECT MAX(age) FROM Student;

-- GROUP BY
SELECT city, COUNT(*) AS total_students
FROM Student
GROUP BY city;

-- HAVING
SELECT city, COUNT(*)
FROM Student
GROUP BY city
HAVING COUNT(*) > 1;

-- VIEWS


CREATE VIEW StudentView AS SELECT name, city FROM Student;

--3. CALLABLE STATEMENT, PREPARED STATEMENT, STORED PROCEDURE

-- Stored Procedure
CREATE PROCEDURE GetStudents AS
BEGIN
    SELECT * FROM Student;
END;

--CONCEPT OF NORMALIZATION


-- Unnormalized (bad design)
-- Student(id, name, dept_name, dept_location)

-- Normalized (good design)
-- Student(id, name, dept_id)
-- Department(dept_id, dept_name, dept_location)

-- Reduces redundancy and improves data integrity


