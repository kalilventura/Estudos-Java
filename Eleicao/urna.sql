/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Internet
 * Created: 30/04/2019
 */

CREATE TABLE "usuario"
(
    "idUsuario" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1 ),
    "usuario" VARCHAR (50),
    "senha" VARCHAR (50)
);

CREATE TABLE "tb_eleicao"
(
    "idEleicao" INT not null primary key
     GENERATED ALWAYS AS IDENTITY
     (START WITH 1, INCREMENT BY 1),
"nomeEleicao" VARCHAR (20),
"descricao" VARCHAR (255)
);

CREATE TABLE "tb_candidato"
(
    idCandidato INTEGER NOT NULL  PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nome VARCHAR (100),   
    idEleicao INTEGER,
    CONSTRAINT fk_candidato_eleicao FOREIGN KEY (idEleicao)
    REFERENCES "tb_eleicao"
);

CREATE TABLE "tb_votos"
(
    idUsuario INTEGER NOT NULL,
    IdCandidato INTEGER NOT NULL,
    IdEleicao INTEGER NOT NULL,
    CONSTRAINT fk_idUsuario FOREIGN KEY (idUsuario) REFERENCES "usuario",
    CONSTRAINT fk_candidato FOREIGN KEY (IdCandidato) REFERENCES "tb_candidato",
    CONSTRAINT fk_idEleicao FOREIGN KEY (IdEleicao) REFERENCES "tb_eleicao"
 );


 INSERT INTO UNINOVE."usuario" ("usuario", "senha")
	VALUES ('traue', 'Senha123');
INSERT INTO UNINOVE."usuario" ("usuario", "senha")
	VALUES ('teste', 'Senha1234');
INSERT INTO UNINOVE."usuario" ("usuario", "senha")
	VALUES ('bla', 'Senha');


  INSERT INTO UNINOVE."tb_eleicao" ("nomeEleicao", "descricao")
  	VALUES ('Presidente 2018', 'Eleição para presidente do Brasil em 2018');
  INSERT INTO UNINOVE."tb_eleicao" ("nomeEleicao", "descricao")
  	VALUES ('Prefeito - SP - 2020', 'Eleição para prefeitura de SP de 2020');

    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Jaspion', 1);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Jiraya', 1);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Bucefalo', 2);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Zé gotinha', 2);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Zezé di Camargo', 2);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('Boo', 2);
    INSERT INTO UNINOVE."tb_candidato" (NOME, IDELEICAO)
    	VALUES ('James Bond', 1);