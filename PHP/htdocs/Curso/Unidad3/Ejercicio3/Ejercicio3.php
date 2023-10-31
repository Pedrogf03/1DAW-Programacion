<?php
$number1 = $_GET['number1'];
$number2 = $_GET['number2'];
$number3 = $_GET['number3'];

if ($number1 < $number2 and $number1 < $number3){
    if($number2 < $number3){
        echo "$number1, $number2, $number3";
    }else if ($number3 < $number2){
        echo "$number1, $number3, $number2";
    }else if ($number2 == $number3){
        echo "$number1, $number2, $number3";
    }
}else if ($number2 < $number1 and $number2 < $number3){
    if($number1 < $number3){
        echo "$number2, $number1, $number3";
    }else if ($number3 < $number1){
        echo "$number2, $number3, $number1";
    }else if ($number1 == $number3){
        echo "$number2, $number1, $number3";
    }
}else if ($number3 < $number1 and $number3 < $number2){
    if($number1 < $number2){
        echo "$number3, $number1, $number2";
    }else if ($number2 < $number1){
        echo "$number3, $number2, $number1";
    }else if ($number1 == $number2){
        echo "$number3, $number1, $number2";
    }
}else if ($number1 == $number2 and $number2 == $number3){
    echo "$number1, $number2, $number3";
}