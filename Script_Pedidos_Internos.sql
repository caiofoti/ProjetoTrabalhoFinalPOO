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

INSERT INTO login(usuario, senha)
VALUES(
"luciano",
"123456"
);


CREATE TABLE cortinas(
	usuario varchar(100) ,
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
	usuario varchar(100),
	id varchar(6) not null,
	irregularidade varchar(100),
    sistema varchar(100),
    sala_predio varchar(100),
    telf varchar(100),
    observacoes varchar(100),
    primary key(id)
);

CREATE TABLE epis(
	usuario varchar(100),
	id varchar(6) not null,
	luva_seg_borracha varchar(100),
    luva_seg_nao_cirurgico varchar(100),
    luva_vaq varchar(100),
    luva_seg_temp varchar(200),
    luva_seg_cong varchar(100),
    manga_seg varchar(100),
    avental_TNT varchar(100),
    cartucho_quim_GA varchar(100),
    cartucho_quim_form varchar(100),
    resp_semi_manutenção varchar(100),
    resp_puri varchar(100),
    masc_tripla varchar(100),
    resp_semi_pff2 varchar(100),
    prot_aud_trad varchar(100),
    prot_auri varchar(100),
    sapatilha_desc varchar(100),
    touca_descartavel varchar(100),
    oculos_seg_poli varchar(100),
    oculos_seg_ampla varchar(100),
    escudo varchar(100),
    matricula varchar(100),
    telf varchar(100),
    funcao varchar(100),
    observacoes varchar(100),
    primary key(id)
);



