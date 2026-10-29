-- Personen und ihre Ausgaben in getrennten Tabellen speichern.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE Aggregation;
use Aggregation;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Personen (
person_id INT primary key,
name VARCHAR (100)
);

CREATE TABLE Ausgaben (
ausgaben_id INT primary key,
betrag DECIMAL (7,3),
beschreibung VARCHAR (100),
person_id INT,

FOREIGN KEY (person_id) REFERENCES Personen (person_id)
);
