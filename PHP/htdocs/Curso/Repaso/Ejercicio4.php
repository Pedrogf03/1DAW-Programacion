<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Repaso para el Examen</title>
</head>
<body>
<h1>Ejercicio 4 PhP</h1>
<p>Web que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, ambos incluidos.</p>
<?php
$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
if ($num1 == $num2) {
?>
	<p><strong>Introduzca dos números, tienen que ser distintos.</strong></p>
	<form action="Ejercicio4.php" method="post">
		<input type="number" name="num1">
		<input type="number" name="num2">
		<input type="submit" value="Siguiente">
	</form>
<?php
} else if ($num1 < $num2) {
    for ($i = $num1; $i <= $num2; $i++) {
        echo $i, " ";
    }
} else if ($num2 < $num1) {
    for ($i = $num2; $i <= $num1; $i++) {
        echo $i, " ";
    }
}
?>
</body>
</html>