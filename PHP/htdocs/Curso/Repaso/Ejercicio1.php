<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Repaso</title>
</head>
<body>
	<h1>Ejercicio 1 PhP</h1>
	<p>Web que pide al usuario un número y muestre la suma de los siguientes 5 números posteriores.</p>
<?php 
$num = $_POST['num'];
if(empty($num)){
?>
    <form action="Ejercicio1.php" method="post">
        <input type="number" name="num">
        <input type="submit" value="Siguiente">
    </form>
<?php    
} else {
    for($i = 1; $i <= 5; $i++){
        $suma += $num;
        $num++;
    }
    echo "La suma de los 5 siguientes es $suma.";
}
?>
</body>
</html>