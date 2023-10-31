<?php

$filas = 0;
foreach(generaArrayBiInt(3, 4, 1, 9) as $a){
    $columnas = 0;
    foreach($a as $b){
        $array[$filas][$columnas] = $b;
        echo $array[$filas][$columnas]." ";
        $columnas++;
    }
    echo "<br>";
    $filas++;
}
echo "<br>";
foreach(filaArrayBiInt($array, 1) as $a){
    echo $a." ";
}
echo "<br>";
foreach(columnaArrayBiInt($array, 1) as $a){
    echo $a." ";
}
echo "<br>";
foreach(diagonalArrayBiInt($array, true) as $a){
    echo $a." ";
}
echo "<br>";
foreach(diagonalArrayBiInt($array, false) as $a){
    echo $a." ";
}





function generaArrayBiInt($n, $m, $min, $max){
    for($filas = 0; $filas < $n; $filas++){
        for($columnas = 0; $columnas < $m; $columnas++){
            $array[$filas][$columnas] = rand($min, $max);
        }
    }
    return $array;
}

function filaArrayBiInt($array, $fila){
    for($columnas = 0; $columnas < count($array[0]); $columnas++){
        $num[$columnas] = $array[$fila][$columnas];
    }
    return $num;
}

function columnaArrayBiInt($array, $columna){
    for($filas = 0; $filas < count($array); $filas++){
        $num[$filas] = $array[$filas][$columna];
    }
    return $num;
}

function diagonalArrayBiInt($array, $direccion){
    $max = 0;
    if(count($array) > count($array[0])){
        $max = count($array[0]);
    } else {
        $max = count($array);
    }

    if($direccion){
        for($i = 0; $i < $max; $i++){
            $num[$i] = $array[$i][$i];
        }
    } else {
        $j = count($array[0])-1;
        for($i = 0; $i < $max; $i++){
            $num[$i] = $array[$i][$j];
            $j--;
        }
    }
    return $num;
}