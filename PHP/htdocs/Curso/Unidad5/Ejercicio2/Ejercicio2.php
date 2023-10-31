<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
    <h1>Ejercicio 2 PhP</h1>
    <p>Web que pida 10 números por teclado y que luego muestre los números introducidos
    junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.</p>
<?php
    $numero = $_GET['numero'];
    $contador = $_GET['contador'];
    $arrayString = $_GET['arrayString'];

    if(!isset($contador)) {
        $contador = 0;
        $arrayString = "";
    }
    if($contador == 10){
        $arrayString = $arrayString." ".$numero;
        $arrayString = trim($arrayString);
        $array = explode(" ", $arrayString);
        for($i = 0; $i < 10; $i++){
            if($i == 0){
                $max = (int)$array[$i];
                $min = (int)$array[$i];
            } else {
                if((int)$array[$i] < $min){
                    $min = (int)$array[$i];
                } else if ((int)$array[$i] > $max){
                    $max = (int)$array[$i];
                }
            }
        }
        foreach($array as $a){
            if((int)$a == $max){
                echo $a." máximo<br>";
            } else if ((int)$a == $min){
                echo $a." mínimo<br>";
            } else {
                echo $a."<br>";
            }
        }
    }
    if ($contador < 10){
        $arrayString = $arrayString." ".$numero;    
?>
    <form action="#" method="get">
        <label for="numero"><p>Número:</p></label>
        <input type="number" name="numero">
        <input type="hidden" name="arrayString" value="<?=$arrayString?>">
        <input type="hidden" name="contador" value="<?=$contador+1?>">
        <input type="submit" value="Enviar">
    </form>
<?php
    }
?>
</body>
</html>