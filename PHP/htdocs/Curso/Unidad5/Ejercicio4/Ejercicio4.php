<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
    <h1>Ejercicio 4 PhP</h1>
    <p>Programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
    un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
    array (del 0 en adelante) y todos los números impares a las celdas restantes.</p>
<?php
$pares = 0;
$impares = 0;
echo "Desordenados: <br>";
for($i = 0; $i < 20; $i++){
    $num[$i] = rand(0, 100);
    echo $num[$i]." ";
    if($num[$i] % 2 == 0){
        $par[$pares] = $num[$i];
        $pares++;
    } else if($num[$i] % 2 == 1){
        $impar[$impares] = $num[$i];
        $impares++;
    }
}
for($i = 0; $i < $pares; $i++){
    $num[$i] = $par[$i];
}
for($i = $pares; $i < 20; $i++){
    $num[$i] = $impar[$i - $pares];
}
echo "<br>Ordenados:<br>";
foreach($num as $a){
    echo $a." ";
}

?>
</body>
</html>