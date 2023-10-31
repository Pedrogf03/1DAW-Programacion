<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Prácticas</title>
</head>
<body>
    <h1>Ejercicio 4 PhP</h1>
    <p>Programa que muestra el cuadrado de un número entre 1 y 10.</p>
<?php 
$num = $_POST['num'];

if (empty($num)){
?>
	<form action="Ejercicio4.php" method="post">
		<input type="hidden" name="num" value="1">
		<input type="submit" value="Empezar">
	</form>
<?php
} else if ($num == 1) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num<sup>$i</sup>= ", $num ** $i, "<br/>";
    }
?>
	<form action="Ejercicio4.php" method="post">
		<input type="hidden" name="num" value="<?=$num + 1?>">
		<input type="submit" value="Siguiente">
	</form>
<?php
} else if ($num > 1 and $num < 10) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num<sup>$i</sup>= ", $num ** $i, "<br/>";
    }
?>
    <form action="Ejercicio4.php" method="post">
		<input type="hidden" name="num" value="<?=$num + 1?>">
		<input type="submit" value="Siguiente">
	</form>
    <form action="Ejercicio4.php" method="post">
		<input type="hidden" name="num" value="<?=$num - 1?>">
		<input type="submit" value="Anterior">
	</form>
<?php
} else if ($num == 10) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num<sup>$i</sup>= ", $num ** $i, "<br/>";
    }
    ?>
	<form action="Ejercicio4.php" method="post">
		<input type="hidden" name="num" value="<?=$num - 1?>">
		<input type="submit" value="Anterior">
	</form>
<?php
}
?>
</body>
</html>