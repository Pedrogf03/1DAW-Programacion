<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Unidad 4</title>
</head>
<body>
	<h1>Ejercicio 9 PhP</h1>
	<p>Web que pide un número y comeinza una cuenta atrás que se
	decrementará en una unidad cada vez que se pulse un botón “Siguiente”.</p>
<?php 
$num = $_POST['num'];
if(empty($num)){
?>
    <form action="Ejercicio9.php" method="post">
        <input type="number" name="num">
        <input type="submit" value="Siguiente">
    </form>
<?php    
} else {
        echo $num;
        $num--;
?>
		<form action="Ejercicio9.php" method="post">
			<input type="hidden" name="num" value="<?=$num?>">
			<input type="submit" value="Siguiente">
		</form>
<?php
}
?>
</body>
</html>