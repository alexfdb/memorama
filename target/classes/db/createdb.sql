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
('¿Qué gas respiramos principalmente?', 'Oxígeno', 'Hidrógeno', 'Nitrógeno', 'Dióxido de carbono', 1),
('¿Cuál es el río más largo del mundo?', 'Nilo', 'Amazonas', 'Yangtsé', 'Misisipi', 2),
('¿Qué país es conocido como la cuna del Renacimiento?', 'Francia', 'Italia', 'España', 'Grecia', 2),
('¿Quién desarrolló la teoría de la evolución?', 'Isaac Newton', 'Charles Darwin', 'Albert Einstein', 'Galileo Galilei', 2),
('¿Cuál es el elemento químico con símbolo O?', 'Oxígeno', 'Oro', 'Osmio', 'Óxido', 1),
('¿Qué deporte se juega en Wimbledon?', 'Fútbol', 'Tenis', 'Críquet', 'Rugby', 2),
('¿Qué instrumento mide los terremotos?', 'Barómetro', 'Sismógrafo', 'Anemómetro', 'Higrómetro', 2),
('¿Cuál es el país más grande del mundo?', 'Canadá', 'China', 'Rusia', 'Estados Unidos', 3),
('¿Qué animal es conocido como el rey de la selva?', 'Elefante', 'León', 'Tigre', 'Jaguar', 2),
('¿Qué planeta es conocido como el planeta rojo?', 'Venus', 'Marte', 'Júpiter', 'Saturno', 2),
('¿Quién escribió "Romeo y Julieta"?', 'William Shakespeare', 'Charles Dickens', 'Jane Austen', 'Mark Twain', 1),
('¿Cuál es la capital de Japón?', 'Seúl', 'Pekín', 'Tokio', 'Bangkok', 3),
('¿Qué gas es el más abundante en la atmósfera terrestre?', 'Oxígeno', 'Nitrógeno', 'Dióxido de carbono', 'Hidrógeno', 2),
('¿Qué continente tiene más países?', 'África', 'Asia', 'Europa', 'América', 1),
('¿Qué órgano del cuerpo humano bombea sangre?', 'Pulmones', 'Hígado', 'Corazón', 'Riñones', 3),
('¿Qué artista pintó "La última cena"?', 'Miguel Ángel', 'Leonardo da Vinci', 'Rafael', 'Donatello', 2),
('¿Qué país es famoso por la Torre Eiffel?', 'Italia', 'España', 'Francia', 'Alemania', 3),
('¿Qué metal se utiliza principalmente en la fabricación de cables eléctricos?', 'Oro', 'Cobre', 'Plata', 'Aluminio', 2),
('¿Qué océano está entre América y Europa?', 'Índico', 'Pacífico', 'Atlántico', 'Ártico', 3),
('¿Qué animal pone huevos pero no es un ave?', 'Delfín', 'Ornitorrinco', 'Tiburón', 'Canguro', 2),
('¿Qué país tiene forma de bota?', 'España', 'Italia', 'Grecia', 'Portugal', 2),
('¿Qué gas se utiliza en los globos aerostáticos?', 'Hidrógeno', 'Helio', 'Oxígeno', 'Nitrógeno', 2),
('¿Qué planeta tiene anillos visibles?', 'Júpiter', 'Saturno', 'Urano', 'Neptuno', 2),
('¿Qué instrumento tiene teclas blancas y negras?', 'Violín', 'Piano', 'Guitarra', 'Flauta', 2),
('¿Qué país inventó el sushi?', 'China', 'Japón', 'Corea del Sur', 'Tailandia', 2),
('¿Qué animal es el símbolo de la paz?', 'Paloma', 'Águila', 'Cisne', 'Gaviota', 1),
('¿Qué continente es conocido como el continente blanco?', 'Asia', 'Antártida', 'Europa', 'Oceanía', 2),
('¿Qué número romano representa el 100?', 'L', 'C', 'D', 'M', 2),
('¿Qué país es famoso por el carnaval de Río de Janeiro?', 'Argentina', 'Brasil', 'México', 'Colombia', 2),
('¿Qué planeta es el más cercano a la Tierra?', 'Venus', 'Marte', 'Mercurio', 'Júpiter', 1),
('¿Qué animal es conocido por su capacidad de camuflaje?', 'Camaleón', 'Pulpo', 'Serpiente', 'Rana', 1),
('¿Qué país tiene el monte Everest?', 'India', 'Nepal', 'China', 'Pakistán', 2),
('¿Qué instrumento mide la presión atmosférica?', 'Barómetro', 'Termómetro', 'Higrómetro', 'Anemómetro', 1),
('¿Qué país es conocido por sus tulipanes?', 'Bélgica', 'Países Bajos', 'Dinamarca', 'Suecia', 2),
('¿Qué animal es el más grande del mundo?', 'Elefante', 'Ballena azul', 'Tiburón blanco', 'Jirafa', 2),
('¿Qué país tiene la ciudad de Venecia?', 'España', 'Italia', 'Francia', 'Grecia', 2),
('¿Qué gas se encuentra en mayor cantidad en el sol?', 'Oxígeno', 'Hidrógeno', 'Helio', 'Nitrógeno', 2),
('¿Qué país es famoso por el Big Ben?', 'Francia', 'Reino Unido', 'Alemania', 'Italia', 2),
('¿Qué animal es conocido por construir presas?', 'Castor', 'Nutria', 'Rata', 'Topo', 1),
('¿Qué continente tiene el desierto del Sahara?', 'Asia', 'África', 'América', 'Oceanía', 2);