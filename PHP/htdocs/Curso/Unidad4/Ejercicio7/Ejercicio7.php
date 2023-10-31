<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Unidad 4</title>
</head>
<body>
	<h1>Ejercicio 7 PhP</h1>
	<p>Web que dice si un número introducido por teclado es o no primo.</p>
<?php
$num= $_POST['num'];
$contador = 0;
if(empty($num)){
?>
	<form action="Ejercicio7.php" method="post">
		<p>Introduzca un número:</p>
		<input type="number" name="num"><br/>
		<br/>
		<input type="submit" value="Comprobar">
	</form>
<?php
} else {
    for($i = 1; $i <= $num; $i++) {
        $primo = $num % $i;
        if($primo == 0) {
            $contador++;
        }
    }
    if($contador <= 2) {
        echo "$num es primo.";
    } else if ($contador > 2) {
        echo "$num no es primo.";
    }
?>
    <form action="Ejercicio7.php" method="post">
		<input type="hidden" name="num" value="0"><br/>
		<input type="submit" value="Comprobar otro">
	</form>
<?php
}
?>