SELECT DISTINCT 
CL.ID   AS [ID DO CLIENTE],
CL.NOME AS [NOME DO CLIENTE],
CL.CPF	AS [CPF],
CL.EMAIL AS [EMAIL],

(SELECT SUM(PP.VALOR) FROM PRODUTO PP INNER JOIN COMPRA CC ON CC.ID_PRODUTO = PP.ID WHERE CC.ID_CLIENTE = CL.ID) AS [TOTAL DO VALOR DAS COMPRAS] 

FROM COMPRA C INNER JOIN CLIENTE CL ON C.ID_CLIENTE = CL.ID INNER JOIN PRODUTO P ON C.ID_PRODUTO = P.ID