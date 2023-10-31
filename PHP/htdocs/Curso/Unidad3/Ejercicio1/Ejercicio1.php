<?php
$mes = $_GET['mes'];
$dia = $_GET['dia'];

if(($dia > 31) or ($dia < 1)) {
    echo 'Ha introducido parámetros inválidos';
} else {
    switch($mes){
        case 1:
            if($dia <= 19){
                echo 'Su signo es Capricornio';
            } else if ($dia >= 20){
                echo 'Su signo es Acuario';
            }
            break;
        case 2:
            if($dia <= 19){
                echo 'Su signo es Acuario';
            } else if ($dia >= 20){
                echo 'Su signo es Piscis';
            }
            break;
        case 3:
            if($dia <= 20){
                echo 'Su signo es Piscis';
            } else if ($dia >= 21){
                echo 'Su signo es Aries';
            }
            break;
        case 4:
            if($dia <= 20){
                echo 'Su signo es Aries';
            } else if ($dia >= 21){
                echo 'Su signo es Tauro';
            }
            break;
        case 5:
            if($dia <= 21){
                echo 'Su signo es Tauro';
            } else if ($dia >= 22){
                echo 'Su signo es Géminis';
            }
            break;
        case 6:
            if($dia <= 21){
                echo 'Su signo es Géminis';
            } else if ($dia >= 22){
                echo 'Su signo es Cáncer';
            }
            break;
        case 7:
            if($dia <= 23){
                echo 'Su signo es Cáncer';
            } else if ($dia >= 24){
                echo 'Su signo es Leo';
            }
            break;
        case 8:
            if($dia <= 23){
                echo 'Su signo es Leo';
            } else if ($dia >= 24){
                echo 'Su signo es Virgo';
            }
            break;
        case 9:
            if($dia <= 22){
                echo 'Su signo es Virgo';
            } else if ($dia >= 23){
                echo 'Su signo es Libra';
            }
            break;
        case 10:
            if($dia <= 22){
                echo 'Su signo es Libra';
            } else if ($dia >= 23){
                echo 'Su signo es Escorpio';
            }
            break;
        case 11:
            if($dia <= 22){
                echo 'Su signo es Escorpio';
            } else if ($dia >= 23){
                echo 'Su signo es Sagitario';
            }
            break;
        case 12:
            if($dia <= 21){
                echo 'Su signo es Sagitario';
            } else if ($dia >= 22){
                echo 'Su signo es Capricornio';
            }
            break;
        default:
            echo 'Ha introducido parámetros inválidos';
    }
}