SELECT * FROM ESTOQUE

DROP TABLE ESTOQUE


SELECT 
P.ID AS [ID DO PRODUTO],
P.NOME AS [DESCRI��O DO PRODUTO],
E.QUANTIDADE 


FROM 
PRODUTO P INNER JOIN ESTOQUE E ON P.ID = E.ID_PRODUTO



SELECT COUNT(ID_PRODUTO) FROM COMPRA WHERE ID_PRODUTO = 2
SELECT * FROM COMPRA WHERE ID_PRODUTO = 2