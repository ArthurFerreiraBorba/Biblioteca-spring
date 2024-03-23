
CREATE TABLE IF NOT EXISTS bibliotecario
(
    id SERIAL PRIMARY KEY,
    email VARCHAR(255),
    nome VARCHAR(255),
    senha INTEGER
);

CREATE TABLE IF NOT EXISTS emprestimo
    id SERIAL PRIMARY KEY,
    id_livro INTEGER NOT NULL,
    id_membro INTEGER NOT NULL,
    data_emprestimo DATE,
    data_devolucao DATE,
    FOREIGN KEY (id_livro) REFERENCES Livro (id),
    FOREIGN KEY (id_membro) REFERENCES Membro (id)
);

CREATE TABLE IF NOT EXISTS livro
(
    id SERIAL PRIMARY KEY,
    ano_publicacao INTEGER,
    autor VARCHAR(255),
    titulo VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS membro
(
    id SERIAL PRIMARY KEY,
    endereco VARCHAR(255),
    nome VARCHAR(255),
    telefone INTEGER
);

CREATE TABLE IF NOT EXISTS visitante
(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    telefone INTEGER
);