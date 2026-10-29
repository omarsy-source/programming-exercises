-- Autoren und Beiträge anlegen und Beispieldaten einfügen.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE blog;
USE blog;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE auto (
    autor_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);

CREATE TABLE post (
    post_id INT PRIMARY KEY AUTO_INCREMENT,
    text TEXT,
    autor_id INT NOT NULL,
    
    FOREIGN KEY (autor_id) REFERENCES auto (autor_id)
);

/* Richtig: Nur 'name' angeben */
-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO auto (name) VALUES 
("Omar"),
("Ahmed");

/* Richtig: Nur 'text' und 'autor_id' angeben */
INSERT INTO post (text, autor_id) VALUES 
("Hallo how are you?", 1),
("Hallo how?", 1),
("Hallo?", 2);