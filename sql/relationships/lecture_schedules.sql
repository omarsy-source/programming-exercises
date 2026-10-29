-- Vorlesungen und Termine mit einem zusammengesetzten Schlüssel verknüpfen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE Komposition;
use Komposition;
-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Vorlesung (
Vorlesung_id INT PRIMARY KEY,
title VARCHAR (100)
);
CREATE TABLE Termin (
Termin_id INT,
raum VARCHAR (50) NOT NULL,
datum DATE NOT NULL,

Vorlesung_id INT NOT NULL,
primary key (Termin_id, Vorlesung_id),
FOREIGN KEY (Vorlesung_id) REFERENCES Vorlesung (Vorlesung_id) ON DELETE CASCADE
);