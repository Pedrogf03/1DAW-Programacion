<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 8 PhP</h1>
    <p>Muestra los números primos que hay entre 1 y 1000.</p>
<?php
include_once('../Ejercicio7/Ejercicio7.php');

for($i = 1; $i <= 1000; $i++){
    if(esPrimo($i)){
        echo $i." ";
    }
}
?>
</body>
</html>