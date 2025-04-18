DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    password TEXT NOT NULL,
    answers INTEGER DEFAULT 0,
    hits INTEGER DEFAULT 0
);

DROP TABLE IF EXISTS questions;

CREATE TABLE questions (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    question TEXT NOT NULL,
    answer1 TEXT NOT NULL,
    answer2 TEXT NOT NULL,
    answer3 TEXT NOT NULL,
    answer4 TEXT NOT NULL,
    correct_answer INTEGER NOT NULL
);

INSERT INTO questions (question, answer1, answer2, answer3, answer4, correct_answer) VALUES
('¿Cuál es el planeta más cercano al Sol?', 'Mercurio', 'Venus', 'Tierra', 'Marte', 1),
('¿En qué año llegó el hombre a la Luna?', '1965', '1969', '1972', '1980', 2),
('¿Cuál es el idioma más hablado en el mundo?', 'Inglés', 'Español', 'Chino mandarín', 'Hindú', 3),
('¿Quién pintó la Mona Lisa?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet', 3),
('¿Cuál es el océano más grande del mundo?', 'Atlántico', 'Pacífico', 'Índico', 'Ártico', 2),
('¿Qué país tiene la mayor población del mundo?', 'India', 'Estados Unidos', 'China', 'Rusia', 3),
('¿Cuál es el metal más ligero?', 'Plata', 'Oro', 'Litio', 'Aluminio', 3),
('¿Quién escribió "Don Quijote de la Mancha"?', 'Miguel de Cervantes', 'Gabriel García Márquez', 'Jorge Luis Borges', 'Mario Vargas Llosa', 1),
('¿Cuál es el animal terrestre más rápido?', 'León', 'Guepardo', 'Tigre', 'Antílope', 2),
('¿Qué gas respiramos principalmente?', 'Oxígeno', 'Hidrógeno', 'Nitrógeno', 'Dióxido de carbono', 1);