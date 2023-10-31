<?php
$i = 0;
foreach(generaArrayInt(10, 1,9) as $a){
    echo $a." ";
    $num[$i] = $a;
    $i++;
}
echo "<br>";
echo minimoArrayInt($num)."<br>";
echo maximoArrayInt($num)."<br>";
echo mediaArrayInt($num)."<br>";
if(estaArrayInt($num, 4)){
    echo "Está";
} else {
    echo "No está";
}
echo "<br>";
echo posicionArrayInt($num, 4)."<br>";
foreach(volteaArrayInt($num) as $a){
    echo $a." ";
}
echo "<br>";
foreach(rotaDerechaArrayInt($num, 1) as $a){
    echo $a." ";
}
echo "<br>";
foreach(rotaIzquierdaArrayInt($num, 1) as $a){
    echo $a." ";
}

function generaArrayInt($size, $min, $max){
    for($i = 0; $i < $size; $i++){
        $num[$i] = rand($min, $max);
    }
    return $num;
}

function minimoArrayInt($num){
    for($i = 0; $i < count($num); $i++){
        if($i == 0){
            $min = $num[0];
        } else if($num[$i] < $min){
            $min = $num[$i];
        }
    }
    return $min;
}

function maximoArrayInt($num){
    for($i = 0; $i < count($num); $i++){
        if($i == 0){
            $max = $num[0];
        } else if($num[$i] > $max){
            $max = $num[$i];
        }
    }
    return $max;
}

function mediaArrayInt($num){
    $suma = 0;
    for($i = 0; $i < count($num); $i++){
        $suma += $num[$i];
    }
    return (int)($suma / count($num));
}

function estaArrayInt($num, $digito){
    $esta = false;
    for($i = 0; $i < count($num); $i++){
        if($num[$i] == $digito){
            $esta = true;
        }
    }
    return $esta;
}

function posicionArrayInt($num, $digito){
    $i = -1;
    if(estaArrayInt($num, $digito)){
        $i += 1;
        while(($i < count($num)) && ($digito != $num[$i])){
            $i++;
        }
    }
    return $i;
}

function volteaArrayInt($num){
    $j = 0;
    for($i = count($num)-1; $i >= 0; $i--){
        $numAux[$j] = $num[$i];
        $j++;
    }
    return $numAux;
}

function rotaDerechaArrayInt($num, $posiciones){

    while($posiciones > 0){
        $ultimo = $num[count($num)-1];
        for($i = count($num)-1; $i >= 0; $i--){
            if($i == 0){
                $num[$i] = $ultimo;
            } else {
                $num[$i] = $num[$i-1];
            }
        }
        $posiciones--;
    }
    return $num;
}

function rotaIzquierdaArrayInt($num, $posiciones){
    return volteaArrayInt(rotaDerechaArrayInt(volteaArrayInt($num), $posiciones));
}