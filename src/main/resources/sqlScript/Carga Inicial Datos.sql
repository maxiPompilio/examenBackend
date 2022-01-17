DROP DATABASE IF EXISTS examenbackend;

CREATE DATABASE examenbackend;

USE examenbackend;

DROP TABLE IF EXISTS examenbackend.dbo.Users;

CREATE TABLE examenbackend.dbo.Users (
	ID_USER numeric(38,0) IDENTITY(0,1) NOT NULL,
	EMAIL varchar(100) COLLATE Modern_Spanish_CI_AS NOT NULL,
	FIRST_NAME varchar(100) COLLATE Modern_Spanish_CI_AS NOT NULL,
	LAST_NAME varchar(100) COLLATE Modern_Spanish_CI_AS NOT NULL,
	CONSTRAINT Users_PK PRIMARY KEY (ID_USER),
	CONSTRAINT Users_UN UNIQUE (EMAIL)
);

DROP TABLE IF EXISTS examenbackend.dbo.Loans;

CREATE TABLE examenbackend.dbo.Loans (
	ID_LOAN numeric(38,0) IDENTITY(0,1) NOT NULL,
	TOTAL numeric(19,4) NULL,
	USER_ID numeric(38,0) NOT NULL,
	CONSTRAINT LOANS_PK PRIMARY KEY (ID_LOAN)
);

ALTER TABLE examenbackend.dbo.Loans ADD CONSTRAINT Loans_FK FOREIGN KEY (USER_ID) REFERENCES examenbackend.dbo.Users(ID_USER);

INSERT INTO examenbackend.dbo.Users (EMAIL,FIRST_NAME,LAST_NAME)
	VALUES (N'test@test.com',N'Test',N'Test');
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (0,0);
INSERT INTO examenbackend.dbo.Users (EMAIL,FIRST_NAME,LAST_NAME)
	VALUES (N'test@app.com.ar',N'Pepe',N'Argento');
INSERT INTO examenbackend.dbo.Users (EMAIL,FIRST_NAME,LAST_NAME)
	VALUES (N'maxi.prueba@app.com.ar',N'Maxi',N'Prueba');
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (2500,1);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (65120.75,1);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (100,2);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (200.75,2);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (300,2);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (400.75,2);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (500.75,2);
INSERT INTO examenbackend.dbo.Loans (TOTAL,USER_ID)
	VALUES (600.75,2);