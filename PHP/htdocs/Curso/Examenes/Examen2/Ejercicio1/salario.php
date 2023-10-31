<?php
$nombre = $_POST['nombre'];
$apellidos = $_POST['apellidos'];
$salario = $_POST['salario'];
$edad = $_POST['edad'];

function nuevoSalario($salario, $edad){

    if($salario <= 2500){
        if ($salario >= 1500 && $salario <= 2500){
            if ($edad > 45){
                $salario += $salario * 0.03;
            } else if ($edad <= 45){
                $salario += $salario * 0.1;
            }
        } else if ($salario < 1500){
            if ($edad < 30){
                $salario = 1600;
            } else if ($edad >= 30 && $edad <= 45){
                $salario += $salario * 0.03;
            } else if ($edad > 45){
                $salario += $salario * 0.15;
            }
        }
    }
    return $salario;
}

echo "Nombre completo: ".$nombre." ".$apellidos.".<br/>";
echo "Edad: ".$edad." años.<br/>";
echo "Cobra: ".nuevoSalario($salario, $edad)."€";