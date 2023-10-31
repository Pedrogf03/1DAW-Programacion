<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Unidad 1</title>
</head>
<body>
	<h1>Ejercicio 1 PhP</h1>
	<p>Programa que utiliza las variables $x y $y con los valores 144 y 999 respectivamente.
	A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.</p>
	<?php 
	$x = 144;
	$y = 999;
	$suma = $x + $y;
	$resta = $x - $y;
	$mult = $x * $y;
	$div = $x / $y;
	echo "x vale $x, y vale $y<br/>";
	echo "x + y = $suma<br>";
	echo "x - y = $resta<br>";
	echo "x * y = $mult<br>";
	echo "x / y = $div<br>";
	?>
</body>
</html>
