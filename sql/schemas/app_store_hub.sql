-- Benutzer, Entwickler, Apps, Downloads, Bewertungen und Abonnements modellieren.
-- Jedes Skript ist eine eigenständige Übung; vorhandene Datenbank- und Spaltennamen gehören zum Beispiel.

-- Die gleichnamige Übungsdatenbank wird hier entfernt und neu aufgebaut.
DROP DATABASE IF EXISTS appStoreHub;
-- Die Datenbank für diese Übung anlegen.
CREATE DATABASE IF NOT EXISTS appStoreHub;
USE appStoreHub;

-- Eine Tabelle mit ihren Spalten und Schlüsselbedingungen anlegen.
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(120) NOT NULL UNIQUE,
    country VARCHAR(60) NOT NULL,
    city VARCHAR(60) NOT NULL,
    birth_date DATE,
    registration_date DATE NOT NULL,
    account_status ENUM('ACTIVE','SUSPENDED','PENDING') DEFAULT 'ACTIVE',
    wallet_balance DECIMAL(10,2) DEFAULT 0.00
);

CREATE TABLE developers (
    developer_id INT AUTO_INCREMENT PRIMARY KEY,
    developer_name VARCHAR(100) NOT NULL,
    country VARCHAR(60) NOT NULL,
    verified BOOLEAN DEFAULT TRUE
);

CREATE TABLE apps (
    app_id INT AUTO_INCREMENT PRIMARY KEY,
    developer_id INT NOT NULL,
    app_name VARCHAR(100) NOT NULL UNIQUE,
    category VARCHAR(60) NOT NULL,
    release_date DATE NOT NULL,
    app_price DECIMAL(8,2) DEFAULT 0.00,
    subscription_available BOOLEAN DEFAULT FALSE,
    age_rating VARCHAR(10) DEFAULT '4+',
    current_version VARCHAR(20) NOT NULL,
    average_rating DECIMAL(3,2) DEFAULT 0.00,
    FOREIGN KEY (developer_id) REFERENCES developers(developer_id)
);

CREATE TABLE downloads (
    download_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    app_id INT NOT NULL,
    download_date DATE NOT NULL,
    price_paid DECIMAL(8,2) DEFAULT 0.00,
    payment_method ENUM('CARD','PAYPAL','WALLET','NONE') DEFAULT 'NONE',
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (app_id) REFERENCES apps(app_id)
);

CREATE TABLE reviews (
    review_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    app_id INT NOT NULL,
    rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
    review_title VARCHAR(120),
    review_text VARCHAR(255),
    review_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (app_id) REFERENCES apps(app_id)
);

CREATE TABLE subscriptions (
    subscription_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    app_id INT NOT NULL,
    plan_type ENUM('FREE','PLUS','FAMILY','STUDENT') NOT NULL,
    monthly_price DECIMAL(8,2) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    active BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (app_id) REFERENCES apps(app_id)
);
-- Die folgenden Beispieldaten in die Tabelle einfügen.
INSERT INTO users (first_name, last_name, email, country, city, birth_date, registration_date, account_status, wallet_balance) VALUES
('Lina','Schmidt','user001@apphub.demo','Egypt','Hamburg','1993-02-28','2025-01-02','ACTIVE',13.91),
('Nour','Saleh','user002@apphub.demo','Jordan','Greifswald','1993-12-11','2025-12-21','ACTIVE',72.82),
('Jana','Weber','user003@apphub.demo','Austria','Paris','1990-10-22','2026-02-25','ACTIVE',147.44),
('Mira','Ibrahim','user004@apphub.demo','France','Stockholm','1993-06-16','2024-03-07','ACTIVE',30.71),
('Samir','Weber','user005@apphub.demo','Sweden','Munich','1997-07-08','2024-11-05','ACTIVE',214.30),
('Adam','Fischer','user006@apphub.demo','Egypt','Paris','2005-03-03','2023-06-17','ACTIVE',208.70),
('Samir','Fischer','user007@apphub.demo','Netherlands','Amsterdam','1990-06-22','2025-05-03','PENDING',75.31),
('Khaled','Hoffmann','user008@apphub.demo','Jordan','Hamburg','2005-04-15','2026-01-10','ACTIVE',96.23),
('Aya','Adel','user009@apphub.demo','Sweden','Madrid','1999-03-27','2024-07-16','ACTIVE',0.65),
('Tariq','Mahmoud','user010@apphub.demo','Egypt','Paris','1991-11-15','2024-11-22','ACTIVE',209.85),
('Samir','Kaya','user011@apphub.demo','Jordan','Vienna','1998-07-07','2023-07-12','ACTIVE',222.22),
('Aya','Weber','user012@apphub.demo','Germany','Warsaw','1993-03-26','2025-03-22','ACTIVE',196.43),
('Yousef','Demir','user013@apphub.demo','Sweden','Hamburg','1994-11-06','2025-05-13','ACTIVE',22.29),
('Ahmad','Adel','user014@apphub.demo','Poland','Greifswald','2000-01-29','2023-03-16','ACTIVE',240.91),
('Mira','Yildiz','user015@apphub.demo','Netherlands','Hamburg','2004-07-11','2026-04-16','ACTIVE',152.96),
('Faris','Ahmed','user016@apphub.demo','Sweden','Amsterdam','1997-03-03','2025-10-28','ACTIVE',171.31),
('Mariam','Fischer','user017@apphub.demo','France','Madrid','1994-11-02','2023-09-09','ACTIVE',161.53),
('Mira','Schmidt','user018@apphub.demo','Poland','Berlin','2000-11-09','2024-03-25','ACTIVE',133.89),
('Adam','Hassan','user019@apphub.demo','Germany','Warsaw','1995-09-11','2026-02-11','ACTIVE',130.69),
('Khaled','Adel','user020@apphub.demo','Poland','Stockholm','2000-11-02','2025-02-15','ACTIVE',3.12),
('Sara','Nasser','user021@apphub.demo','Spain','Munich','2002-03-10','2024-11-29','ACTIVE',128.89),
('Omar','Khaled','user022@apphub.demo','Sweden','Berlin','1996-07-04','2025-06-14','ACTIVE',97.53),
('Lina','Becker','user023@apphub.demo','Sweden','Munich','1991-09-12','2023-12-04','ACTIVE',98.30),
('Jana','Ibrahim','user024@apphub.demo','UAE','Warsaw','1998-07-02','2024-10-18','ACTIVE',227.77),
('Tariq','Wagner','user025@apphub.demo','Germany','Amsterdam','2004-08-09','2023-01-01','ACTIVE',13.19),
('Lina','Ahmed','user026@apphub.demo','Germany','Vienna','1988-05-06','2023-08-30','ACTIVE',207.33),
('Aya','Wagner','user027@apphub.demo','Netherlands','Berlin','1997-11-02','2024-04-29','ACTIVE',61.40),
('Tariq','Schmidt','user028@apphub.demo','Jordan','Hamburg','1997-05-19','2026-01-25','PENDING',222.04),
('Yousef','Schmidt','user029@apphub.demo','UAE','Madrid','2004-01-02','2024-06-02','ACTIVE',20.42),
('Yousef','Becker','user030@apphub.demo','Spain','Paris','1993-08-31','2026-04-27','ACTIVE',145.35),
('Yousef','Nasser','user031@apphub.demo','Poland','Greifswald','1991-03-09','2023-02-13','ACTIVE',201.70),
('Lina','Wagner','user032@apphub.demo','Poland','Stockholm','1991-08-01','2025-12-10','ACTIVE',82.17),
('Sara','Nasser','user033@apphub.demo','Netherlands','Paris','1993-12-17','2025-06-16','ACTIVE',138.34),
('Samir','Hoffmann','user034@apphub.demo','Sweden','Paris','2004-02-22','2023-06-11','ACTIVE',65.75),
('Jana','Becker','user035@apphub.demo','Poland','Greifswald','1998-12-18','2025-02-08','ACTIVE',247.23),
('Khaled','Weber','user036@apphub.demo','Jordan','Paris','2002-12-04','2024-05-19','ACTIVE',61.49),
('Jana','Mahmoud','user037@apphub.demo','Poland','Amsterdam','2003-08-15','2025-11-24','SUSPENDED',20.23),
('Khaled','Mahmoud','user038@apphub.demo','Poland','Berlin','1989-08-28','2024-03-02','ACTIVE',201.58),
('Adam','Fischer','user039@apphub.demo','Austria','Berlin','1992-08-10','2026-02-05','ACTIVE',207.69),
('Mariam','Saleh','user040@apphub.demo','Spain','Stockholm','1995-07-23','2023-04-10','ACTIVE',218.15),
('Lina','Saleh','user041@apphub.demo','Netherlands','Berlin','1993-06-08','2025-08-25','ACTIVE',46.57),
('Noor','Karim','user042@apphub.demo','Netherlands','Warsaw','2006-05-06','2025-01-31','ACTIVE',27.36),
('Rama','Karim','user043@apphub.demo','Austria','Madrid','1994-09-08','2023-07-06','ACTIVE',172.39),
('Lina','Schmidt','user044@apphub.demo','UAE','Amsterdam','1990-02-03','2023-02-03','ACTIVE',68.32),
('Noor','Weber','user045@apphub.demo','Spain','Stockholm','1999-09-09','2025-07-19','ACTIVE',33.04),
('Omar','Saleh','user046@apphub.demo','Netherlands','Warsaw','1998-05-01','2025-02-21','ACTIVE',163.90),
('Sara','Becker','user047@apphub.demo','Egypt','Amsterdam','1996-10-20','2025-06-03','ACTIVE',160.15),
('Ali','Ahmed','user048@apphub.demo','Germany','Madrid','2002-08-25','2023-01-22','ACTIVE',11.33),
('Nour','Saleh','user049@apphub.demo','UAE','Hamburg','1991-04-12','2024-10-04','ACTIVE',236.42),
('Aya','Ahmed','user050@apphub.demo','Spain','Munich','1996-06-21','2026-01-14','ACTIVE',179.19);

