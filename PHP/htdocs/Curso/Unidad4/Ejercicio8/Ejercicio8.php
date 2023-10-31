<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Unidad 4</title>
</head>
<body>
	<h1>Ejercicio 8 PhP</h1>
	<p>Web que pide un número por teclado y lo muestra del revés.</p>
<?php
$num = $_POST['num'];
$numTeclado = $num;
$volteado = 0;
if(empty($num)) {
?>
	<form action="Ejercicio8.php" method="post">
		<input type="number" name="num"><br/>
		<input type="submit" value="Aceptar"><br/>
	</form>
<?php
} else {
    while ($num > 1) {
        $volteado = ($volteado * 10) + ($num % 10);
        $num = $num / 10;
    }
    echo "$numTeclado al revés es $volteado.";
?>
    <form action="Ejercicio8.php" method="post">
    	<input type="hidden" name="num" value="0"><br/>
    	<input type="submit" value="Otro"><br/>
    </form>
<?php
}
?>