<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Unidad 4</title>
</head>
<body>
    <h1>Ejercicio 11 PhP</h1>
    <p>Programa que muestra las tablas de multiplicar.</p>
<?php 
$num = $_POST['num'];

if (empty($num)){
?>
	<form action="Ejercicio11.php" method="post">
		<input type="hidden" name="num" value="1">
		<input type="submit" value="Empezar">
	</form>
<?php
} else if ($num == 1) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num x $i = ", $num * $i, "<br/>";
    }
?>
	<form action="Ejercicio11.php" method="post">
		<input type="hidden" name="num" value="<?=$num + 1?>">
		<input type="submit" value="----->">
	</form>
<?php
} else if ($num > 1 and $num < 10) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num x $i = ", $num * $i, "<br/>";
    }
?>
    <form action="Ejercicio11.php" method="post">
		<input type="hidden" name="num" value="<?=$num + 1?>">
		<input type="submit" value="----->">
	</form>
    <form action="Ejercicio11.php" method="post">
		<input type="hidden" name="num" value="<?=$num - 1?>">
		<input type="submit" value="<-----">
	</form>
<?php
} else if ($num == 10) {
    
    for($i = 1; $i <= 10; $i++){
        echo "$num x $i = ", $num * $i, "<br/>";
    }
    ?>
	<form action="Ejercicio11.php" method="post">
		<input type="hidden" name="num" value="<?=$num - 1?>">
		<input type="submit" value="<-----">
	</form>
<?php
}
?>
</body>
</html>