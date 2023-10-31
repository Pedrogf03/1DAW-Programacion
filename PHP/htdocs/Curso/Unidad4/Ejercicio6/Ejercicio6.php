<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Unidad 4</title>
</head>
<body>
	<h1>Ejercicio 6 PhP</h1>
	<p>Web que calcula la potencia de un número introducido por teclado.</p>
<?php
$base = $_POST['base'];
$exponente = $_POST['exponente'];
if(empty($base)){
?>
	<form action="Ejercicio6.php" method="post">
		<p>Introduzca la base:</p>
		<input type="number" name="base"><br/>
		<p>Introduzca el exponente:</p>
		<input type="number" name="exponente"><br/>
		<br/>
		<input type="submit" value="Calcular">
	</form>
<?php
} else {
    echo "$base ^ $exponente = ", pow($base, $exponente);
?>
    <form action="Ejercicio6.php" method="post">
		<input type="hidden" name="base" value="0"><br/>
		<input type="submit" value="Calcular otro">
	</form>
<?php
}
?>
</body>
</html>