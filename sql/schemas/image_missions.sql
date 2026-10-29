-- Benutzer, Missionen, Bilder, Betrachtungen und Bewertungen miteinander verknüpfen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE erdiagrammen;
use erdiagrammen;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE benutzer (
	benutzer_id INT NOT NULL PRIMARY KEY,
    username VARCHAR (100),
    password VARCHAR (100),
    email VARCHAR (255) UNIQUE

);

CREATE TABLE mission (
	name VARCHAR (100) PRIMARY KEY,
    organisation VARCHAR (100),
    startdautm TIMESTAMP,
    enddatum DATE

);

CREATE TABLE bild (
	bild_URL VARCHAR (255) PRIMARY KEY,
    speicherformat VARCHAR (100),
    veröffentlichungsdatum DATE ,
    verarbeitungsschritte INT,
    ziel_position FLOAT,
    geschwindigkeit DECIMAL (7,3),
	
    misson_name VARCHAR (100) NOT NULL,
    FOREIGN KEY (misson_name) REFERENCES mission (misson_name)
);

CREATE TABLE benutzer_bild_betrachtung (
	betrachtungszeit TIMESTAMP,
    benutzer_id INT,
    bild_URL VARCHAR (255),
    
    FOREIGN KEY (benutzer_id) REFERENCES benutzer (benutzer_id),
    FOREIGN KEY (bild_URL) REFERENCES bild (bild_URL),
	
    PRIMARY KEY (betrachtungszeit, benutzer_id, bild_URL)
);

CREATE TABLE benutzer_bild_bewertung (
	bewertung INT CHECK (bewertung BETWEEN 1 AND 5),
    benutzer_id INT,
    bild_URL VARCHAR (255),
    
    FOREIGN KEY (benutzer_id) REFERENCES benutzer (benutzer_id),
    FOREIGN KEY (bild_URL) REFERENCES bild (bild_URL),
	
    PRIMARY KEY (bewertung, benutzer_id, bild_URL)
);

