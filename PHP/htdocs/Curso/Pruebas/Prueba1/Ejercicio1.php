<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Prácticas</title>
</head>
<body>
	<h1>Ejercicio 1 PhP</h1>
	<p>Web que dice si un número es par, divisible entre 7 y/o entre 10.</p>
<?php 
$num = $_POST['num'];
if(empty($num)){
    echo "Introduzca un número";
?>
	<form action="Ejercicio1.php" method="post">
		<input type="number" name="num"><br/>
		<input type="submit" value="Comprobar">
	</form>
<?php
} else {

    if ($num % 2 == 0){
        echo "$num es par";
    }else if ($num % 2 != 0){
        echo "$num no es par";
    }
    if ($num % 7 == 0){
        echo ", es divisible entre 7";
    } else if ($num % 7 != 0){
        echo ", no es divisible entre 7";
    }
    if ($num % 10 == 0){
        echo " y es divisible entre 10.<br/>";
    } else if ($num % 10 != 0){
        echo "  y no es divisible entre 10.<br/>";
    }
?>
	<form action="Ejercicio1.php" method="post">
		<input type="hidden" name="num" value="0">
		<input type="submit" value="Comprobar otro">
	</form>
<?php
}
?>
</body>
</html>