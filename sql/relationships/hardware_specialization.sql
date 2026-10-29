-- Die Eigenschaften verschiedener Hardwaretypen in eigenen Tabellen darstellen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE Spezialisierung;
use Spezialisierung;


-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Tastatur (
id INT PRIMARY KEY,
preis DECIMAL (7,3) NOT NULL,
switch VARCHAR (100),
layout VARCHAR (100)

);

CREATE TABLE Monito (
id INT PRIMARY KEY NOT NULL,
preis DECIMAL (7,3),
aufloesung VARCHAR (100),
is_ultrawide boolean

);