<?php
$numIntroducido = $_GET['num'];
$digitos = 0;
$num = $numIntroducido;

while($num >= 1) {
    $num = $num / 10;
    $digitos = $digitos + 1;
}
echo "$numIntroducido tiene $digitos dígitos.";