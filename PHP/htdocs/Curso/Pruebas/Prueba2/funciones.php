<?php

function generaArrayString($size, $min, $max){
    for($i = 0; $i < $size; $i++){
        $numArray[$i] = rand($min,$max);
    }
    foreach($numArray as $num){
        $arrayString = $arrayString." ".$num;
    }
    return $arrayString;
}

function arrayStringToArray($arrayString){
    $arrayString = trim($arrayString);
    $array = explode(" ", $arrayString);
    return $array;
}

function cambiarValores($array, $valor1, $valor2, $valor3){
    foreach($array as $a){
        if ($a == $valor1 || $a == $valor2){
            echo $valor3." ";
        } else {
            echo $a." ";
        }
    }
}