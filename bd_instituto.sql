-- 1. BORRAR UNA BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS INSTITUTO;

-- 2. CREAR UNA BASE DE DATOS

CREATE DATABASE INSTITUTO;

-- 3. USAR UNA BASE DE DATOS

USE INSTITUTO;

-- 4. CREAR UNA TABLA

DROP TABLE IF EXISTS Alumno;

CREATE TABLE Alumno (
  idAlumno INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre   VARCHAR(25) NOT NULL,
  edad     VARCHAR(50) NOT NULL,
  estatura VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
					  
-- 5. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

DESCRIBE Alumno; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Carlos',15,1.71);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Miguel',16,1.72);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Luis',17,1.73);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Carmen',18,1.74);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Lucho',19,1.75);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Lucia',19,1.65);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Vanessa',15,1.71);
INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Arturo',16,1.70);

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;

