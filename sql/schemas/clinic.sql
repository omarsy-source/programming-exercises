-- Patienten, Ärzte und Termine anlegen und anschließend Tabellen mit ALTER TABLE ändern.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die gleichnamige Übungsdatenbank wird hier entfernt und neu aufgebaut.
DROP DATABASE IF EXISTS clinic_db;
-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE clinic_db;
USE clinic_db;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE patients (
    patient_id INT PRIMARY KEY,
    patient_name VARCHAR(100) NOT NULL,
    city VARCHAR(50),
    birth_year INT
);

CREATE TABLE doctors (
    doctor_id INT PRIMARY KEY,
    doctor_name VARCHAR(100) NOT NULL,
    specialty VARCHAR(100)
);

CREATE TABLE appointments (
    appointment_id INT PRIMARY KEY,
    patient_id INT,
    doctor_id INT,
    appointment_date DATE,
    status VARCHAR(30),
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
);

-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO patients VALUES
(1, 'Ali Hasan', 'Berlin', 2001),
(2, 'Sara Omar', 'Hamburg', 1999),
(3, 'Lina Noor', 'Munich', 2003),
(4, 'Omar Salem', 'Berlin', 1998);

INSERT INTO doctors VALUES
(1, 'Dr. Ahmad', 'Dentist'),
(2, 'Dr. Hana', 'Cardiology'),
(3, 'Dr. Sami', 'Dermatology');

INSERT INTO appointments VALUES
(1, 1, 1, '2026-06-10', 'planned'),
(2, 2, 2, '2026-06-11', 'done'),
(3, 3, 1, '2026-06-12', 'planned'),
(4, 4, 3, '2026-06-14', 'cancelled');

-- Die Struktur einer bereits angelegten Tabelle ändern.
ALTER TABLE patients ADD phone VARCHAR (100); 
ALTER TABLE doctors ADD email VARCHAR (100);
ALTER TABLE appointments MODIFY status VARCHAR (150);
ALTER TABLE patients RENAME COLUMN city TO patient_city;