<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
	<h1>Ejercicio 1 PhP</h1>
	<p>Web que genere 50 números aleatorios entre 1 y 100, los almacene en un array y que
    luego muestre los números junto con las palabras “máximo” y “mínimo” al lado del máximo y del
    mínimo respectivamente.</p>
<?php
for($i = 0; $i < 50; $i++){
    $arrayNum[$i] = rand(1, 100);
}
for($i = 0; $i < 50; $i++){
    if($i == 0){
        $max = $arrayNum[$i];
        $min = $arrayNum[$i];
    } else {
        if($arrayNum[$i] > $max){
            $max = $arrayNum[$i];
        } else if($arrayNum[$i] < $min){
            $min = $arrayNum[$i];
        }
    }
}
for($i = 0; $i < 50; $i++){
    if($arrayNum[$i] == $max){
        echo $arrayNum[$i]." máximo<br>";
    } else if ($arrayNum[$i] == $min){
        echo $arrayNum[$i]." mínimo<br>";
    } else {
        echo $arrayNum[$i]."<br>";
    }
}
?>
</body>
</html>