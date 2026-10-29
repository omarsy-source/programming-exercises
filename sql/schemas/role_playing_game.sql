-- Gilden, Spieler und Missionen mit ihren Zuordnungen speichern und abfragen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die gleichnamige Übungsdatenbank wird hier entfernt und neu aufgebaut.
DROP DATABASE IF EXISTS RPG_Spiel;
-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE IF NOT EXISTS RPG_Spiel;
USE RPG_Spiel;
-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE IF NOT EXISTS Gilder (
	ID INT NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR(100),
    region VARCHAR(100)
);

-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO Gilder VALUES (null, ' Tel_Harra ', ' Darra ');
INSERT INTO Gilder VALUES (null, ' Tel_Gommu ', ' Daraa ');

CREATE TABLE IF NOT EXISTS Spieler (
	ID INT NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR (75), 
    level INT,
    Gilder_ID INT,
    FOREIGN KEY (Gilder_ID) REFERENCES Gilder(ID)
);

INSERT INTO Spieler VALUES (null, ' Omar ' , 2, 1);
INSERT INTO Spieler VALUES (null, ' Ahmed ' , 7,1);
INSERT INTO Spieler VALUES (null, ' Waleed ' , 19, 2);
INSERT INTO Spieler VALUES (null, ' Abu Wattan ' , 10,2);
INSERT INTO Spieler VALUES (null, ' Khalid ' , 13, 2);
INSERT INTO Spieler VALUES (null, ' Leo ' , 11,2);

CREATE TABLE IF NOT EXISTS Mission (
	ID INT NOT NULL PRIMARY KEY auto_increment,
    title VARCHAR (200),
    Belohnung DECIMAL (7,4)
);

INSERT INTO Mission VALUES (null, ' Rette den Schmied ', 500);
INSERT INTO Mission VALUES (null, ' Erobere die Burg ', 900.45);

CREATE TABLE IF NOT EXISTS Spieler_Mission_Zuordnung (
Spieler_ID INT,
Mission_ID INT,

FOREIGN KEY (Spieler_ID) REFERENCES Spieler(ID),
FOREIGN KEY (Mission_ID) REFERENCES Mission(ID),

PRIMARY KEY (Spieler_ID, Mission_ID)
);

INSERT INTO Spieler_Mission_Zuordnung VALUES (3,1);
INSERT INTO Spieler_Mission_Zuordnung VALUES (3,2);
INSERT INTO Spieler_Mission_Zuordnung VALUES (1,1);
INSERT INTO Spieler_Mission_Zuordnung VALUES (5,2);


-- Die gewünschten Daten aus den verknüpften Tabellen abfragen.
SELECT name, level FROM Spieler JOIN Spieler_Mission_Zuordnung ON Spieler.Spieler_ID = Spieler_Mission_Zuordnung.Spieler_ID;

