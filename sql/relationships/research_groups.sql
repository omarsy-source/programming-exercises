-- Forschungsgruppen und Dozenten über einen Fremdschlüssel verbinden.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE Aggregation;
use Aggregation;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Forschungsgruppen (
forschungsgruppen_id INT PRIMARY KEY,
theama VARCHAR (150) NOT NULL
);

CREATE TABLE Dozenten  (
dozenten_id INT PRIMARY KEY,
name VARCHAR (75) NOT NULL,
email VARCHAR (100) NOT NULL ,
telephone VARCHAR (100),

forschungsgruppen_id INT ,
FOREIGN KEY (forschungsgruppen_id) REFERENCES Forschungsgruppen (forschungsgruppen_id)
);

