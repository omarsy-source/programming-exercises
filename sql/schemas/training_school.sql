-- Kurse und Einschreibungen verbinden und die Teilnehmer pro Kurs zählen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die gleichnamige Übungsdatenbank wird hier entfernt und neu aufgebaut.
DROP DATABASE IF EXISTS training_school;
-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE IF NOT EXISTS training_school;
USE training_school;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    city VARCHAR(50),
    age INT
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    teacher_name VARCHAR(100)
);

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY,
    student_id INT,
    course_id INT,
    grade DECIMAL(4,2),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO students VALUES
(1, 'Ali', 'Berlin', 20),
(2, 'Sara', 'Hamburg', 22),
(3, 'Omar', 'Berlin', 19),
(4, 'Lina', 'Munich', 21),
(5, 'Noor', 'Cologne', 23);

INSERT INTO courses VALUES
(101, 'SQL Basics', 'Mr. Ahmed'),
(102, 'Web Design', 'Ms. Hana'),
(103, 'Java Programming', 'Mr. Sami');

INSERT INTO enrollments VALUES
(1, 1, 101, 85.5),
(2, 1, 103, 78.0),
(3, 2, 101, 91.0),
(4, 3, 102, 88.0),
(5, 4, 101, 73.5),
(6, 4, 102, 95.0),
(7, 5, 103, 80.0);



-- Die gewünschten Daten aus den verknüpften Tabellen abfragen.
SELECT courses.course_name , COUNT(students.student_id) AS studentenAnzahl FROM courses
JOIN enrollments ON courses.course_id = enrollments.course_id
JOIN students ON enrollments.student_id = students.student_id GROUP BY courses.course_name 
ORDER BY studentenAnzahl DESC;

