<?php

function crearMatriz($lado){
    for($i = 0; $i < $lado; $i++){
        for($j = 0; $j < $lado; $j++){
            $matriz[$i][$j] = rand(0 ,9);
        }
    }
    return $matriz;
}

function diagonalIzq($array){
    $diagonal = "";
    for($filas = 0; $filas < count($array); $filas++){
        $diagonal = $diagonal." ".$array[$filas][$filas];
    }
    return $diagonal;
}


function diagonalDcha($array){
    $diagonal = "";
    $columnas = count($array[0])-1;
    for($filas = 0; $filas < count($array); $filas++){
        $diagonal = $diagonal." ".$array[$filas][$columnas];
        $columnas--;
    }
    return $diagonal;
}
