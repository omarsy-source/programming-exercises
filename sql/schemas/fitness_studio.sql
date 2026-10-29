-- Mitglieder, Trainingspläne und Übungen über ihre Schlüssel verbinden.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

use Fitnessstudio;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE Trainingspläne (
id INT PRIMARY KEY, 
name VARCHAR(100) NOT NULL,
schwierigkeitslevel INT
);


CREATE TABLE Mitglieder (
id INT PRIMARY KEY,
name VARCHAR (75),
geburtsdatum DATE NOT NULL,
beitrittsdatum DATE,
id_trainingspläne INT,
FOREIGN KEY (id_trainingspläne) REFERENCES Trainingspläne (id)
);


CREATE TABLE Übungen (
id INT PRIMARY KEY,
name VARCHAR (75),
muskelgruppe VARCHAR (75)
);

CREATE TABLE Trainingspläne2Übungen (
id_Trainingspläne INT,
id_Übungen INT,
PRIMARY KEY ( id_Trainingspläne, id_Übungen),
FOREIGN KEY (id_Trainingspläne) REFERENCES  Trainingspläne (id),
FOREIGN KEY ( id_Übungen ) REFERENCES Übungen (id)
);