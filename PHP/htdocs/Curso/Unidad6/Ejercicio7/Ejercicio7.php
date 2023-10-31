<?php

function voltea($num) {
    while($num >= 1){
        $volteado = ($volteado * 10) + ($num % 10);
        $num /= 10;
    }
    return $volteado;
}

function esCapicua($num){
    if(voltea($num) == $num){
        $capicua = true;
    } else {
        $capicua = false;
    }
    return $capicua;
}

function esPrimo($num){
    $primo = false;
    if($num != 1){
        $contador = 0;
        for($i = 1; $i <= $num; $i++){
            if($num % $i == 0){
                $contador++;
            }
        }
        if($contador <= 2) {
            $primo = true;
        }
    }
    return $primo;
}

function siguientePrimo($num){
    $num += 1;
    while(!esPrimo($num)){
        $num++;
    }
    return $num;
}

function potencia($base, $exponente){
    return $base**$exponente;
}

function digitos($num){
    $contador = 0;
    while($num > 1){
        $num /= 10;
        $contador++;
    }
    return $contador;
}

function digitoN($num, $posicionUser){
    
    $volteado = 0;
    $posicion = 0;
    $digito = 0;
    $num = voltea($num);
    while($num > 1) {
        $volteado = ($volteado * 10) + ($num % 10);
        $num /= 10;
        if($posicion == $posicionUser){
            $digito = $volteado % 10;
        }
        $posicion++;
    }
    return $digito;
}

function posicionDigito($num, $digito){
    $i = 0;
    while((digitoN($num, $i) != $digito) && ($i <= digitos($num))){
        $i++;
    }
    if(digitos($num) < $i){
        $posicion = -1;
    } else {
        $posicion = $i;
    }
    return $posicion;
}

function quitaDetras($num, $cantidad){
    for($i = 1; $i <= $cantidad; $i++){
        $num /= 10;
    }
    return (int)$num;
}

function quitaDelante($num, $cantidad){
    return voltea(quitaDetras(voltea($num), $cantidad));
}

function pegaDetras($num, $digito){
    return ($num * 10) + $digito;
}

function pegaDelante($num, $digito){
    return voltea(pegaDetras(voltea($num), $digito));
}

function trozoNumero($num, $inicio, $fin){
    $nuevoNum = 0;
    for($i = $inicio; $i <= $fin; $i++){
        $nuevoNum = ($nuevoNum * 10) + digitoN($num, $i);
    }
    return $nuevoNum;
}

function juntaNumeros($num1, $num2){
    for($i = 0; $i < digitos($num2); $i++){
        $num1 *= 10;
    }
    return $num1 + $num2;
}