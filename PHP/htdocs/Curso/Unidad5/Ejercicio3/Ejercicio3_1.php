<?php
$arrayString = $_POST['arrayString'];
$valor1 = $_POST['valor1'];
$valor2 = $_POST['valor2'];

$arrayString = trim($arrayString);
$array = explode(" ", $arrayString);
foreach($array as $a){
    if ($a == $valor1){
        echo $valor2." ";
    } else {
        echo $a." ";
    }
}