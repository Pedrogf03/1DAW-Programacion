<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Prácticas</title>
</head>
<body>
	<h1>Ejercicio 3 PhP</h1>
	<p>Web que pide un número y comienza una cuenta hacia delante que se
	incrementará en una unidad cada vez que se pulse un botón “Siguiente”.</p>
<?php 
$num = $_POST['num'];
$start = $_POST['start'];
if(empty($num)){
?>
    <form action="Ejercicio3.php" method="post">
        <input type="number" name="num"><br/>
        <input type="hidden" name="start" value="1">
        <input type="submit" value="Siguiente">
    </form>
<?php    
} else {
    if($start <= $num){
        echo $start;
?>
		<form action="Ejercicio3.php" method="post">
			<input type="hidden" name="num" value="<?=$num?>">
			<input type="hidden" name="start" value="<?=$start + 1?>">
			<input type="submit" value="Siguiente">
		</form>
<?php
    } else if ($start > $num) {
?>
		<form action="Ejercicio3.php" method="post">
        	<input type="number" name="num"><br/>
        	<input type="hidden" name="start" value="1">
        	<input type="submit" value="Siguiente">
    	</form>
<?php
    }
}
?>
</body>
</html>