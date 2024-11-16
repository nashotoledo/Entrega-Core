CREATE DATABASE clientes_pedidos_db;

USE clientes_pedidos_db;

-- Tabla "clientes"
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15)
);

-- Tabla "pedidos"
CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    fecha DATE NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id) ON DELETE CASCADE
);

-- Inserts
INSERT INTO clientes (nombre, direccion, telefono) VALUES
('Juan Pérez', 'Calle Falsa 123', '123456789'),
('Olivia Quintero', 'Calle Falsa 123', '746456789'),
('Angel Ruiz', 'Calle Falsa 123', '351456789'),
('Michael Jackson', 'Calle Falsa 123', '1234380789'),
('Felipe Camiroaga', 'Calle Falsa 123', '558456789');

INSERT INTO pedidos (cliente_id, fecha, total) VALUES
(1, '2024-11-01', 150.00),
(2, '2024-11-01', 200.50),
(1, '2024-11-03', 700.00),
(3, '2024-11-04', 100.00),
(2, '2024-11-05', 250.75),
(4, '2024-11-05', 400.00),
(5, '2024-11-06', 120.00),
(3, '2024-11-06', 980.00),
(5, '2024-11-07', 310.00),
(1, '2024-11-07', 275.00);

-- Selects
SELECT * FROM clientes;
SELECT * FROM pedidos;

-- Entrega todos los clientes y sus pedidos
SELECT c.id AS cliente_id, c.nombre, p.id AS pedido_id, p.fecha, p.total
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id;

-- Entrega todos los pedidos de un cliente específico
SELECT * 
FROM pedidos 
WHERE cliente_id = 1;

-- Calcular el total de todos los pedidos por cliente
SELECT c.id AS cliente_id, c.nombre, SUM(p.total) AS total_pedidos
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nombre;

-- Eliminar un cliente y sus pedidos asociados
DELETE FROM clientes WHERE id = 3;

-- Proyectar los tres clientes con más pedidos
SELECT c.id AS cliente_id, c.nombre, COUNT(p.id) AS numero_pedidos
FROM clientes c
LEFT JOIN pedidos p ON c.id = p.cliente_id
GROUP BY c.id, c.nombre
ORDER BY numero_pedidos DESC
LIMIT 3;
