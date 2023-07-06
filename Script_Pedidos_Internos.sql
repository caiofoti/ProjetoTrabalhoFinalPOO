CREATE DATABASE meubanco;
use meubanco;

CREATE TABLE login(
	usuario varchar(100) primary key,
    senha varchar(100) not null
);

INSERT INTO login(usuario, senha)
VALUES(
"victor",
"123456"
);

CREATE TABLE cortinas(
	id varchar(6) not null,
	substituicao varchar(3),
    telf varchar(100),
    email varchar(100),
    predio_sala varchar(100),
    justificativa varchar(100),
    responsavel varchar(100),
    primary key(id)
);

CREATE TABLE incendio(
	id varchar(6) not null,
	irregularidade varchar(100),
    sistema varchar(100),
    sala_predio varchar(100),
    telf varchar(100),
    observacoes varchar(100),
    primary key(id)
);

select * from cortinas;
