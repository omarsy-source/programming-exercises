-- Studierende über eine Zuordnungstabelle mit Vorlesungen verbinden.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE vorlesoungen;
use vorlesoungen;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE student (
	matrikel_nr INT NOT NULL UNIQUE,
    name VARCHAR (100)
    );
    
CREATE TABLE vorlesung (
	vorlesung_id INT NOT NULL UNIQUE,
    titel VARCHAR (100)
    );
    
CREATE TABLE student_vorlesung_zuordnung (
	matrikel_nr INT NOT NULL,
    vorlesung_id INT NOT NULL,
    
	PRIMARY KEY (matrikel_nr, vorlesung_id),
    FOREIGN KEY (matrikel_nr) REFERENCES student (matrikel_nr),
	FOREIGN KEY (vorlesung_id) REFERENCES vorlesung (vorlesung_id)
);
-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO student (matrikel_nr, name ) VALUES
(800625, "Omar"),
(800726, "Ahmed"),
(800727, "Ramni");

INSERT INTO vorlesung (vorlesung_id, titel ) VALUES
(1, "DB"),
(2, "Pro2");

INSERT INTO student_vorlesung_zuordnung (matrikel_nr, vorlesung_id ) VALUES
(800625, 1),
(800625, 2),
(800726, 1),
(800727, 2);
-- Die gewünschten Daten aus den verknüpften Tabellen abfragen.
SELECT student.name, student.matrikel_nr, vorlesung.titel FROM student JOIN student_vorlesung_zuordnung on 
student.matrikel_nr = student_vorlesung_zuordnung.matrikel_nr JOIN vorlesung ON 
student_vorlesung_zuordnung.vorlesung_id = vorlesung.vorlesung_id;