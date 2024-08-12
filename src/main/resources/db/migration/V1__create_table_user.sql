CREATE TABLE user (
    id BIGINT PRIMARY KEY UNIQUE NOT NULL,
	nome varchar(255) NOT NULL,
    senha varchar(255)  NOT NULL,
	foto varchar(500),
	tipo varchar(255)
);