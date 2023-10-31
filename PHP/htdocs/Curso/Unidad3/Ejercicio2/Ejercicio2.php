<?php
$number = $_GET['number'];

if ($number % 2 == 0){
    echo "$number es par";
}else if ($number % 2 != 0){
    echo "$number no es par";
}
if ($number % 5 == 0){
    echo " y es divisible entre 5";
} else if ($number % 5 != 0){
    echo " y no es divisible entre 5";
}