SELECT CC.*, C.DATA_DA_COMPRA FROM COMPRA_CLIENTE CC INNER JOIN COMPRAS C ON CC.COD_DA_COMPRA = C.COD_DA_COMPRA
WHERE CC.COD_DA_COMPRA = 
(SELECT TOP 1 COD_DA_COMPRA FROM COMPRAS WHERE ID_CLIENTE = CC.ID_CLIENTE ORDER BY DATA_DA_COMPRA DESC)
AND CC.ID_CLIENTE = 27