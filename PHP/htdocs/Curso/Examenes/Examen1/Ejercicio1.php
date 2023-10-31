<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Examen</title>
</head>
<body>
	<h1>Ejercicio 1 PhP</h1>
	<p>Web que diga si un triángulo es o no rectángulo.</p>
<?php 
$lado1 = $_POST['lado1'];
$lado2 = $_POST['lado2'];
$lado3 = $_POST['lado3'];
if (empty($lado1) || empty($lado2) || empty($lado3)) {
?>
	<p>Introduzca los lados del triángulo:</p>
	<form action="Ejercicio1.php" method="post">
		<input type="number" name="lado1" value="<?=$lado1?>"><br/>
		<input type="number" name="lado2" value="<?=$lado2?>"><br/>
		<input type="number" name="lado3" value="<?=$lado3?>"><br/>
		<input type="submit" value="Enviar">
	</form>
<?php
} else {
    if (($lado1 + $lado2 < $lado3) || ($lado2 + $lado3 < $lado1) || ($lado3 + $lado1 < $lado2)) {
        echo "No se puede hacer un triángulo con esas medidas.";
    } else if ((pow($lado1, 2) + pow($lado2, 2) == pow($lado3, 2)) || (pow($lado2, 2) + pow($lado3, 2) == pow($lado1, 2)) || (pow($lado3, 2) + pow($lado1, 2) == pow($lado2, 2))){
        echo "Su triángulo es rectángulo.";
    } else {
        echo "Su triángulo no es rectángulo.";
    }
}
?>
</body>
</html>