-- Verschiedene Hochschulrollen in einer gemeinsamen Tabelle speichern.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE uni;
USE uni;
-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE SingleTable (
id INT PRIMARY KEY,
name VARCHAR (75) NOT NULL,
personalnummer INT NULL,
matrikelnummer INT NULL,
role TINYINT
);