<?php
$arrayString = $_POST['arrayString'];
$valor1 = $_POST['valor1'];
$valor2 = $_POST['valor2'];
$valor3 = $_POST['valor3'];

include_once('funciones.php');

cambiarValores(arrayStringToArray($arrayString), $valor1, $valor2, $valor3);

