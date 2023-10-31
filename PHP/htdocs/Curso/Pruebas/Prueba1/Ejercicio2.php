<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Prácticas</title>
</head>
<body>
	<h1>Ejercicio 2 PhP</h1>
	<p>Programa que muestra los números del 400 al 160 contando de 20 en 20 con un while.</p>
<?php
$i = 400;
while ($i >= 160){
    echo $i, "<br/>";
    $i = $i - 20;
}
?>
</body>
</html>