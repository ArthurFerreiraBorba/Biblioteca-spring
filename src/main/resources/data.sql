INSERT INTO bibliotecario (email, nome, senha) VALUES
('bib1@example.com', 'João Silva', 123456),
('bib2@example.com', 'Maria Oliveira', 789012),
('bib3@example.com', 'Carlos Souza', 345678),
('bib4@example.com', 'Ana Pereira', 901234),
('bib5@example.com', 'Rafaela Santos', 567890),
('bib6@example.com', 'Marcos Costa', 123789),
('bib7@example.com', 'Juliana Almeida', 890123),
('bib8@example.com', 'Pedro Lima', 456789),
('bib9@example.com', 'Luiza Ferreira', 901567),
('bib10@example.com', 'Lucas Gomes', 678901);

INSERT INTO livro (ano_publicacao, autor, titulo) VALUES
(2000, 'Machado de Assis', 'Dom Casmurro'),
(2001, 'Clarice Lispector', 'A Hora da Estrela'),
(2002, 'Guimarães Rosa', 'Grande Sertão: Veredas'),
(2003, 'Jorge Amado', 'Gabriela, Cravo e Canela'),
(2004, 'Érico Veríssimo', 'O Tempo e o Vento'),
(2005, 'Cecília Meireles', 'Romanceiro da Inconfidência'),
(2006, 'Carlos Drummond de Andrade', 'Sentimento do Mundo'),
(2007, 'Adélia Prado', 'Bagagem'),
(2008, 'Rubem Fonseca', 'Agosto'),
(2009, 'Lygia Fagundes Telles', 'As Meninas');

INSERT INTO membro (endereco, nome, telefone) VALUES
('Rua das Flores, 123', 'Amanda Costa', 123456789),
('Avenida dos Sonhos, 456', 'Roberto Santos', 234567890),
('Travessa das Árvores, 789', 'Sofia Almeida', 345678901),
('Rua do Campo, 321', 'Mateus Oliveira', 456789012),
('Avenida da Praia, 654', 'Isabela Pereira', 567890123),
('Rua das Montanhas, 987', 'Lucas Rodrigues', 678901234),
('Avenida dos Rios, 159', 'Laura Lima', 789012345),
('Travessa do Mar, 357', 'Thiago Gomes', 890123456),
('Rua da Cidade, 753', 'Gabriela Ferreira', 901234567),
('Avenida das Estrelas, 951', 'Felipe Nascimento', 987654321);

INSERT INTO visitante (nome, telefone) VALUES
('Fernanda Silva', 111222333),
('Diego Oliveira', 222333444),
('Mariana Almeida', 333444555),
('Vinícius Pereira', 444555666),
('Camila Santos', 555666777),
('Gustavo Costa', 666777888),
('Isadora Lima', 777888999),
('Rafael Nascimento', 888999000),
('Luana Rodrigues', 999000111),
('Bruno Ferreira', 000111222);

INSERT INTO emprestimo (id_livro, id_membro, data_emprestimo, data_devolucao) VALUES
(1, 2, '2023-01-01', '2023-01-15'),
(2, 1, '2023-02-05', '2023-02-20'),
(3, 8, '2023-03-10', '2023-03-25'),
(4, 4, '2023-04-15', '2023-04-30'),
(5, 7, '2023-05-20', '2023-06-05'),
(6, 5, '2023-06-25', '2023-07-10'),
(7, 6, '2023-07-30', '2023-08-14'),
(8, 3, '2023-08-05', '2023-08-20'),
(9, 10, '2023-09-10', '2023-09-25'),
(10, 9, '2023-10-15', '2023-10-30');
