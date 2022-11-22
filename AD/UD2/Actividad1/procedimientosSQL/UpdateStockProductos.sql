CREATE DEFINER=`usuario`@`%` PROCEDURE `UpdateStockProductos`(idProducto int, cantidad int)
BEGIN
	UPDATE PRODUCTOS SET STOCKACTUAL = STOCKACTUAL - cantidad WHERE ID = idProducto;
END