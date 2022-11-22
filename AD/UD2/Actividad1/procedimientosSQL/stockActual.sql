CREATE DEFINER=`usuario`@`%` FUNCTION `stockActual`(idProducto int) RETURNS int
    DETERMINISTIC
BEGIN
	DECLARE vStockActual int;
    
    SELECT STOCKACTUAL into vStockActual FROM PRODUCTOS WHERE ID = idProducto;

RETURN vStockActual;
END