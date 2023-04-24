-- 1. BORRAR UNA BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS INSTITUTO2;

-- 2. CREAR UNA BASE DE DATOS

CREATE DATABASE INSTITUTO2;

-- 3. USAR UNA BASE DE DATOS

USE INSTITUTO2;

-- 4. CREAR UNA TABLA

DROP TABLE IF EXISTS Alumno;

CREATE TABLE Alumno (
  idAlumno INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre   VARCHAR(25) NOT NULL,
  edad     INT         NOT NULL,
  estatura DOUBLE      NOT NULL,
  imagen   VARCHAR(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
					  
-- 5. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

DESCRIBE Alumno; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Carlos',15,1.71,'1.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Miguel',16,1.72,'2.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Luis',17,1.73,'3.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Carmen',18,1.74,'4.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Lucho',19,1.75,'5.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Lucia',19,1.65,'6.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Vanessa',15,1.71,'7.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Arturo',16,1.70,'8.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'José',16,1.70,'9.png');
INSERT INTO Alumno (idAlumno, nombre, edad, estatura, imagen) VALUES (NULL,'Ismael',16,1.70,'10.png');

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;

