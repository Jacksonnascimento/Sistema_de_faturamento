CREATE TABLE USUARIO(
ID INT,
NOME VARCHAR(40), 
NOME_USUARIO VARCHAR(40),
TIPO VARCHAR(10),
SENHA VARCHAR(30),
EMAIL VARCHAR (40),

PRIMARY KEY (ID)

);


SELECT * FROM USUARIO WHERE NOME_USUARIO = 'jack'

INSERT INTO USUARIO VALUES(1, 'JACKSON NASCIMENTO', 'jack', 'ADM', '87519023', 
'jacksonnascimento84@hotmail.com'); 