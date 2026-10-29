-- Level und Hindernisse verbinden; beim Löschen eines Levels werden seine Hindernisse mitgelöscht.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE Komposition;
use Komposition;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Level (
level_id INT PRIMARY KEY,
name VARCHAR (100),
schwierigkeit INT
);

CREATE TABLE Hindernisse (
hindernis_id INT,
x_koordinate  VARCHAR (100),
y_koordinate VARCHAR (100),

level_id INT NOT NULL,

PRIMARY KEY (hindernis_id , level_id ),
FOREIGN KEY (level_id) REFERENCES Level (level_id) ON DELETE CASCADE
);