﻿CREATE TABLE ANIMAL (  COD_ANIMAL                     SERIAL NOT NULL ,PESSOA_COD_PESSOA              INTEGER NOT NULL ,NOME                           VARCHAR(50) NOT NULL ,RACA                           VARCHAR(30) NOT NULL ,PEDIGRE                        VARCHAR(30) NOT NULL ,NASCIMENTO                     DATE NOT NULL ,PELAGEM                        VARCHAR(20) NOT NULL ,COR                            VARCHAR(20) NOT NULL ,FOTO                           INTEGER ,OBSERVACAO                     VARCHAR(250) ,CONSTRAINT PK_ANIMAL PRIMARY KEY (COD_ANIMAL, PESSOA_COD_PESSOA));CREATE INDEX IXFK_ANIMAL_1_PESSOA_COD_PESSOA ON ANIMAL (PESSOA_COD_PESSOA);CREATE TABLE FUNCIONARIO_HAS_SERVICO (  FUNCIONARIO_PESSOA_COD_PESSOA  INTEGER NOT NULL ,SERVICO_COD_SERVICO            INTEGER NOT NULL ,CONSTRAINT PK_FUNCIONARIO_HAS_SERVICO PRIMARY KEY (FUNCIONARIO_PESSOA_COD_PESSOA, SERVICO_COD_SERVICO));CREATE INDEX IXFK_FUNCIONARIO_HAS_SERVICO_1_FUNCIONARIO_PESSOA_COD_PESSOA ON FUNCIONARIO_HAS_SERVICO (FUNCIONARIO_PESSOA_COD_PESSOA);CREATE INDEX IXFK_FUNCIONARIO_HAS_SERVICO_2_SERVICO_COD_SERVICO ON FUNCIONARIO_HAS_SERVICO (SERVICO_COD_SERVICO);CREATE TABLE PESSOA (  COD_PESSOA                     SERIAL NOT NULL ,ENDERECO                       VARCHAR(50) NOT NULL ,NUMERO                         VARCHAR(10) NOT NULL ,COMPLEMENTO                    VARCHAR(20) ,BAIRRO                         VARCHAR(30) NOT NULL ,CIDADE                         VARCHAR(30) NOT NULL ,CEP                            VARCHAR(9) NOT NULL ,UF                             VARCHAR(2) NOT NULL ,TELEFONE1                      VARCHAR(12) NOT NULL ,TELEFONE2                      VARCHAR(12) ,EMAIL                          VARCHAR(50) NOT NULL ,DATACAD                        DATE NOT NULL ,GRUPO                          VARCHAR(20) NOT NULL ,CONSTRAINT PK_PESSOA PRIMARY KEY (COD_PESSOA));CREATE TABLE PRODUTO (  COD_PRODUTO                    SERIAL NOT NULL ,FORNECEDOR_PESSOA_COD_PESSOA   INTEGER NOT NULL ,NOME                           VARCHAR(50) NOT NULL ,MARCA                          VARCHAR(20) NOT NULL ,GRUPO                          VARCHAR(20) NOT NULL ,UNIDADE                        VARCHAR(5) NOT NULL ,PESO                           DOUBLE PRECISION NOT NULL ,COR                            VARCHAR(15) NOT NULL ,LOTE                           VARCHAR(20) NOT NULL ,DTVALIDADE                     DATE NOT NULL ,PRECOVENDA                     DOUBLE PRECISION NOT NULL ,PRECOCOMPRA                    DOUBLE PRECISION NOT NULL ,CONSTRAINT PK_PRODUTO PRIMARY KEY (COD_PRODUTO, FORNECEDOR_PESSOA_COD_PESSOA));CREATE INDEX IXFK_PRODUTO_1_FORNECEDOR_PESSOA_COD_PESSOA ON PRODUTO (FORNECEDOR_PESSOA_COD_PESSOA);CREATE TABLE SERVICO (  COD_SERVICO                    SERIAL NOT NULL ,DESCRICAO                      VARCHAR(50) NOT NULL ,DURACAO                        VARCHAR(5) NOT NULL ,VALOR                          DOUBLE PRECISION NOT NULL ,CONSTRAINT PK_SERVICO PRIMARY KEY (COD_SERVICO));CREATE TABLE SERVICO_HAS_ANIMAL (  SERVICO_COD_SERVICO            INTEGER NOT NULL ,ANIMAL_COD_ANIMAL              INTEGER NOT NULL ,ANIMAL_PESSOA_COD_PESSOA       INTEGER NOT NULL ,CONSTRAINT PK_SERVICO_HAS_ANIMAL PRIMARY KEY (SERVICO_COD_SERVICO, ANIMAL_COD_ANIMAL, ANIMAL_PESSOA_COD_PESSOA));CREATE INDEX IXFK_SERVICO_HAS_ANIMAL_1_SERVICO_COD_SERVICO ON SERVICO_HAS_ANIMAL (SERVICO_COD_SERVICO);CREATE INDEX IXFK_SERVICO_HAS_ANIMAL_2_ANIMAL_COD_ANIMAL_ANIMAL_PESSOA_COD_PESSOA ON SERVICO_HAS_ANIMAL (ANIMAL_COD_ANIMAL, 
ANIMAL_PESSOA_COD_PESSOA);CREATE TABLE SERVICO_HAS_PRODUTO (  SERVICO_COD_SERVICO            INTEGER NOT NULL ,PRODUTO_COD_PRODUTO            INTEGER NOT NULL ,PRODUTO_FORNECEDOR_PESSOA_COD_PESSOA INTEGER NOT NULL ,CONSTRAINT PK_SERVICO_HAS_PRODUTO PRIMARY KEY (SERVICO_COD_SERVICO, PRODUTO_COD_PRODUTO, PRODUTO_FORNECEDOR_PESSOA_COD_PESSOA));CREATE INDEX IXFK_SERVICO_HAS_PRODUTO_1_SERVICO_COD_SERVICO ON SERVICO_HAS_PRODUTO (SERVICO_COD_SERVICO);CREATE INDEX IXFK_SERVICO_HAS_PRODUTO_2_PRODUTO_COD_PRODUTO_PRODUTO_FORNECEDOR_PESSOA_COD_PESSOA ON SERVICO_HAS_PRODUTO 
(PRODUTO_COD_PRODUTO, PRODUTO_FORNECEDOR_PESSOA_COD_PESSOA);CREATE TABLE AGENDA (  COD_AGENDA                     SERIAL NOT NULL ,FUNCIONARIO_PESSOA_COD_PESSOA  INTEGER NOT NULL ,DTENTRADA                      DATE NOT NULL ,HRENTRADA                      VARCHAR(5) NOT NULL ,DTSAIDA                        DATE ,HRSAIDA                        VARCHAR(5) ,CONSTRAINT PK_AGENDA PRIMARY KEY (COD_AGENDA, FUNCIONARIO_PESSOA_COD_PESSOA));CREATE INDEX IXFK_AGENDA_1_FUNCIONARIO_PESSOA_COD_PESSOA ON AGENDA (FUNCIONARIO_PESSOA_COD_PESSOA);CREATE TABLE AGENDA_HAS_SERVICO (  AGENDA_COD_AGENDA              INTEGER NOT NULL ,SERVICO_COD_SERVICO            INTEGER NOT NULL ,AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA INTEGER NOT NULL ,CONSTRAINT PK_AGENDA_HAS_SERVICO PRIMARY KEY (AGENDA_COD_AGENDA, SERVICO_COD_SERVICO, AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA));CREATE INDEX IXFK_AGENDA_HAS_SERVICO_1_AGENDA_COD_AGENDA_AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA ON AGENDA_HAS_SERVICO (AGENDA_COD_AGENDA, 
AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA);CREATE INDEX IXFK_AGENDA_HAS_SERVICO_2_SERVICO_COD_SERVICO ON AGENDA_HAS_SERVICO (SERVICO_COD_SERVICO);CREATE TABLE STATUS_AGENDA (  COD_STATUS                     SERIAL NOT NULL ,AGENDA_COD_AGENDA              INTEGER NOT NULL ,AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA INTEGER NOT NULL ,DESCRICAO                      VARCHAR(50) NOT NULL ,CONSTRAINT PK_STATUS_AGENDA PRIMARY KEY (COD_STATUS, AGENDA_COD_AGENDA, AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA));CREATE INDEX IXFK_STATUS_AGENDA_1_AGENDA_COD_AGENDA_AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA ON STATUS_AGENDA (AGENDA_COD_AGENDA, 
AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA);CREATE TABLE ATENDENTE (  FUNCIONARIO_PESSOA_COD_PESSOA  INTEGER NOT NULL ,CONSTRAINT PK_ATENDENTE PRIMARY KEY (FUNCIONARIO_PESSOA_COD_PESSOA));CREATE INDEX IXFK_ATENDENTE_1_FUNCIONARIO_PESSOA_COD_PESSOA ON ATENDENTE (FUNCIONARIO_PESSOA_COD_PESSOA);CREATE TABLE CLIENTEF (  PESSOA_COD_PESSOA              INTEGER NOT NULL ,NOME                           VARCHAR(50) NOT NULL ,CPF                            VARCHAR(11) NOT NULL ,RG                             VARCHAR(10) NOT NULL ,DATANASC                       DATE NOT NULL ,CONSTRAINT PK_CLIENTEF PRIMARY KEY (PESSOA_COD_PESSOA));CREATE INDEX IXFK_CLIENTEF_1_PESSOA_COD_PESSOA ON CLIENTEF (PESSOA_COD_PESSOA);CREATE TABLE CLIENTEJ (  PESSOA_COD_PESSOA              INTEGER NOT NULL ,RAZAOSOCIAL                    VARCHAR(50) NOT NULL ,NOMEFANTASIA                   VARCHAR(50) ,CNPJ                           VARCHAR(14) NOT NULL ,IE                             VARCHAR(15) NOT NULL ,DATAABERTURA                   DATE NOT NULL ,CONSTRAINT PK_CLIENTEJ PRIMARY KEY (PESSOA_COD_PESSOA));CREATE INDEX IXFK_CLIENTEJ_1_PESSOA_COD_PESSOA ON CLIENTEJ (PESSOA_COD_PESSOA);CREATE TABLE FORNECEDOR (  PESSOA_COD_PESSOA              INTEGER NOT NULL ,RAZAOSOCIAL                    VARCHAR(50) NOT NULL ,NOMEFANTASIA                   VARCHAR(50) ,CNPJ                           VARCHAR(14) NOT NULL ,IE                             VARCHAR(15) NOT NULL ,DATAABERTURA                   DATE NOT NULL ,CONSTRAINT PK_FORNECEDOR PRIMARY KEY (PESSOA_COD_PESSOA));CREATE INDEX IXFK_FORNECEDOR_1_PESSOA_COD_PESSOA ON FORNECEDOR (PESSOA_COD_PESSOA);CREATE TABLE FUNCIONARIO (  PESSOA_COD_PESSOA              INTEGER NOT NULL ,MATRICULA                      VARCHAR(10) NOT NULL ,LOGIN                          VARCHAR(20) NOT NULL ,SENHA                          VARCHAR(12) NOT NULL ,NOME                           VARCHAR(50) NOT NULL ,CPF                            VARCHAR(11) NOT NULL ,RG                             VARCHAR(10) NOT NULL ,DATANASC                       DATE NOT NULL ,CONSTRAINT PK_FUNCIONARIO PRIMARY KEY (PESSOA_COD_PESSOA));CREATE INDEX IXFK_FUNCIONARIO_1_PESSOA_COD_PESSOA ON FUNCIONARIO (PESSOA_COD_PESSOA);CREATE TABLE VETERINARIO (  FUNCIONARIO_PESSOA_COD_PESSOA  INTEGER NOT NULL ,CRV                            VARCHAR(10) NOT NULL ,CONSTRAINT PK_VETERINARIO PRIMARY KEY (FUNCIONARIO_PESSOA_COD_PESSOA));CREATE INDEX IXFK_VETERINARIO_1_FUNCIONARIO_PESSOA_COD_PESSOA ON VETERINARIO (FUNCIONARIO_PESSOA_COD_PESSOA);ALTER TABLE ANIMAL  ADD CONSTRAINT FK_ANIMAL_PESSOA FOREIGN KEY (PESSOA_COD_PESSOA)    REFERENCES PESSOA (COD_PESSOA);ALTER TABLE ATENDENTE  ADD CONSTRAINT FK_ATENDENTE_FUNCIONARIO FOREIGN KEY (FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES FUNCIONARIO (PESSOA_COD_PESSOA);ALTER TABLE CLIENTEF  ADD CONSTRAINT FK_CLIENTEF_PESSOA FOREIGN KEY (PESSOA_COD_PESSOA)    REFERENCES PESSOA (COD_PESSOA);ALTER TABLE CLIENTEJ  ADD CONSTRAINT FK_CLIENTEJ_PESSOA FOREIGN KEY (PESSOA_COD_PESSOA)    REFERENCES PESSOA (COD_PESSOA);ALTER TABLE FORNECEDOR  ADD CONSTRAINT FK_FORNECEDOR_PESSOA FOREIGN KEY (PESSOA_COD_PESSOA)    REFERENCES PESSOA (COD_PESSOA);ALTER TABLE FUNCIONARIO  ADD CONSTRAINT FK_FUNCIONARIO_PESSOA FOREIGN KEY (PESSOA_COD_PESSOA)    REFERENCES PESSOA (COD_PESSOA);ALTER TABLE FUNCIONARIO_HAS_SERVICO  ADD CONSTRAINT FK_FUNCIONARIO_HAS_SERVICO_FUNCIONARIO FOREIGN KEY (FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES FUNCIONARIO (PESSOA_COD_PESSOA);ALTER TABLE FUNCIONARIO_HAS_SERVICO  ADD CONSTRAINT FK_FUNCIONARIO_HAS_SERVICO_SERVICO FOREIGN KEY (SERVICO_COD_SERVICO)    REFERENCES SERVICO (COD_SERVICO);ALTER TABLE PRODUTO  ADD CONSTRAINT FK_PRODUTO_FORNECEDOR FOREIGN KEY (FORNECEDOR_PESSOA_COD_PESSOA)    REFERENCES FORNECEDOR (PESSOA_COD_PESSOA);ALTER TABLE SERVICO_HAS_ANIMAL  ADD CONSTRAINT FK_SERVICO_HAS_ANIMAL_SERVICO FOREIGN KEY (SERVICO_COD_SERVICO)    REFERENCES SERVICO (COD_SERVICO);ALTER TABLE SERVICO_HAS_ANIMAL  ADD CONSTRAINT FK_SERVICO_HAS_ANIMAL_ANIMAL FOREIGN KEY (ANIMAL_COD_ANIMAL, ANIMAL_PESSOA_COD_PESSOA)    REFERENCES ANIMAL (COD_ANIMAL, PESSOA_COD_PESSOA);ALTER TABLE SERVICO_HAS_PRODUTO  ADD CONSTRAINT FK_SERVICO_HAS_PRODUTO_SERVICO FOREIGN KEY (SERVICO_COD_SERVICO)    REFERENCES SERVICO (COD_SERVICO);ALTER TABLE SERVICO_HAS_PRODUTO  ADD CONSTRAINT FK_SERVICO_HAS_PRODUTO_PRODUTO FOREIGN KEY (PRODUTO_COD_PRODUTO, PRODUTO_FORNECEDOR_PESSOA_COD_PESSOA)    REFERENCES PRODUTO (COD_PRODUTO, FORNECEDOR_PESSOA_COD_PESSOA);ALTER TABLE VETERINARIO  ADD CONSTRAINT FK_VETERINARIO_FUNCIONARIO FOREIGN KEY (FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES FUNCIONARIO (PESSOA_COD_PESSOA);ALTER TABLE AGENDA  ADD CONSTRAINT FK_AGENDA_FUNCIONARIO FOREIGN KEY (FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES FUNCIONARIO (PESSOA_COD_PESSOA);ALTER TABLE AGENDA_HAS_SERVICO  ADD CONSTRAINT FK_AGENDA_HAS_SERVICO_AGENDA FOREIGN KEY (AGENDA_COD_AGENDA, AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES AGENDA (COD_AGENDA, FUNCIONARIO_PESSOA_COD_PESSOA);ALTER TABLE AGENDA_HAS_SERVICO  ADD CONSTRAINT FK_AGENDA_HAS_SERVICO_SERVICO FOREIGN KEY (SERVICO_COD_SERVICO)    REFERENCES SERVICO (COD_SERVICO);ALTER TABLE STATUS_AGENDA  ADD CONSTRAINT FK_STATUS_AGENDA_AGENDA FOREIGN KEY (AGENDA_COD_AGENDA, AGENDA_FUNCIONARIO_PESSOA_COD_PESSOA)    REFERENCES AGENDA (COD_AGENDA, FUNCIONARIO_PESSOA_COD_PESSOA);