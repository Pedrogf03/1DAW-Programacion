<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Examen</title>
</head>
<body>
	<h1>Ejercicio 2 PhP</h1>
	<p>Web que pregunta al usuario el presupuesto a gastar. Una vez introducido
 	se le preguntará el precio de los artículos y se irán restando al presupuesto.</p>
<?php 
$presupuesto = $_POST['presupuesto'];
$resta = $_POST['resta'];
if (empty($presupuesto)){
    echo "<h2>Introduzca el presupuesto:</h2>";
?>
	<form action="Ejercicio2.php" method="post">
		<input type="number" min=1 name="presupuesto">
		<input type="submit" value="Enviar">
	</form>
<?php
} else if (empty($resta)){
    echo "<h2>Tienes ", $presupuesto ,"€ de presupuesto restante.</h2>";
?>
	<p>Vas a gastar:</p>
	<form action="Ejercicio2.php" method="post">
		<input type="number" min=1 name="resta">
		<input type="hidden" name="presupuesto"  value="<?=$presupuesto?>">
		<input type="submit" value="Aceptar">
	</form>
<?php
} else {
    if(($presupuesto - $resta) > 0){
        echo "<h2>Tienes ", $presupuesto - $resta ,"€ de presupuesto restante.</h2>";
?>
	<p>Vas a gastar:</p>
	<form action="Ejercicio2.php" method="post">
		<input type="number" min=1 name="resta">
		<input type="hidden" name="presupuesto"  value="<?=$presupuesto - $resta?>">
		<input type="submit" value="Aceptar">
	</form>
<?php
    } else if (($presupuesto - $resta) == 0){
     echo "Se ha agotado el presupuesto, no sobra nada.";
    } else {
        echo "No queda suficiente presupuesto, han sobrado ", $presupuesto ,"€.";
    }
}
?>
</body>
</html>