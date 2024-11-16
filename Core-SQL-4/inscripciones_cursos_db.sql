CREATE DATABASE inscripciones_cursos_db;

USE inscripciones_cursos_db;

-- Tabla "estudiantes"
CREATE TABLE estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT NOT NULL
);

-- Tabla "cursos"
CREATE TABLE cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    duracion INT NOT NULL 
);

-- Tabla intermedia "inscripciones"
CREATE TABLE inscripciones (
    id_estudiante INT NOT NULL,
    id_curso INT NOT NULL,
    PRIMARY KEY (id_estudiante, id_curso),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id) ON DELETE CASCADE,
    FOREIGN KEY (id_curso) REFERENCES cursos(id) ON DELETE CASCADE
);

INSERT INTO estudiantes (nombre, edad) VALUES
('Rodrigo Pérez', 32),
('Bastian Gómez', 22),
('Carlos López', 59),
('María Martínez', 41),
('Beatriz Torres', 53);

INSERT INTO cursos (nombre, duracion) VALUES
('Matemáticas', 40),
('Física', 50),
('Programación', 60),
('Historia', 30);

INSERT INTO inscripciones (id_estudiante, id_curso) VALUES
(1, 1), -- Rodrigo -> Matemáticas
(1, 2), -- Rodrigo -> Física
(2, 3), -- Bastian -> Programación
(2, 4), -- Bastian -> Historia
(3, 1), -- Carlos -> Matemáticas
(4, 3), -- María -> Programación
(4, 4); -- María -> Historia
		-- Beatriz -> Null

SELECT * FROM estudiantes;
SELECT * FROM cursos;
SELECT * FROM inscripciones;

-- Proyectar todos los estudiantes y sus respectivos cursos
SELECT e.nombre AS estudiante, c.nombre AS curso
FROM estudiantes e
JOIN inscripciones i ON e.id = i.id_estudiante
JOIN cursos c ON i.id_curso = c.id;

-- Proyectar todos los estudiantes inscritos en un curso específico
SELECT e.nombre AS estudiante
FROM estudiantes e
JOIN inscripciones i ON e.id = i.id_estudiante
JOIN cursos c ON i.id_curso = c.id
WHERE c.nombre = 'Programacion';

--  Proyectar todos los cursos en los que está inscrito un estudiante específico
SELECT c.nombre AS curso
FROM cursos c
JOIN inscripciones i ON c.id = i.id_curso
JOIN estudiantes e ON i.id_estudiante = e.id
WHERE e.nombre = 'Carlos López';

-- Contar el número de estudiantes inscritos en cada curso
SELECT c.nombre AS curso, COUNT(i.id_estudiante) AS num_estudiantes
FROM cursos c
LEFT JOIN inscripciones i ON c.id = i.id_curso
GROUP BY c.id, c.nombre;

-- Encontrar los estudiantes que no están inscritos en ningún curso
SELECT e.nombre AS estudiante
FROM estudiantes e
LEFT JOIN inscripciones i ON e.id = i.id_estudiante
WHERE i.id_curso IS NULL;
