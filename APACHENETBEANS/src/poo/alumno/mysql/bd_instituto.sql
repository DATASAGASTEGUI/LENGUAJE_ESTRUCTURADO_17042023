CREATE DATABASE INSTITUTO;

USE INSTITUTO;

CREATE TABLE Alumno (
   id       INT            NOT NULL AUTO_INCREMENT,
   nombre   VARCHAR(20)    NOT NULL,
   edad     INT            NOT NULL,
   estatura DOUBLE         NOT NULL,
   casado   TINYINT        NOT NULL,
   sexo     CHAR(1)        NOT NULL,
            PRIMARY KEY (id)
);

INSERT INTO Alumno (nombre,edad,estatura,casado,sexo) VALUES ("Luis",30,1.72,true,'H');
INSERT INTO Alumno (nombre,edad,estatura,casado,sexo) VALUES ("Carmen",31,1.67,false,'M');
INSERT INTO Alumno (nombre,edad,estatura,casado,sexo) VALUES ("María",32,1.72,false,'M');
INSERT INTO Alumno (nombre,edad,estatura,casado,sexo) VALUES ("Miguel",29,1.67,true,'H');
INSERT INTO Alumno (nombre,edad,estatura,casado,sexo) VALUES ("Arturo",30,1.72,true,'H');


SELECT * FROM Alumno;
