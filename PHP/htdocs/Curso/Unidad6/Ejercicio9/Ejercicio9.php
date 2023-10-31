<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 9 PhP</h1>
    <p>Muestra los números capicua que hay entre 1 y 99999.</p>
<?php
include_once('../Ejercicio7/Ejercicio7.php');

for($i = 1; $i <= 99999; $i++){
    if(esCapicua($i)){
        echo $i." ";
    }
}
?>
</body>
</html>