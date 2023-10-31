<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
    <h1>Ejercicio 3 PhP</h1>
    <p>Programa que genere 50 números aleatorios del 0 al 20 y que los muestre por pantalla
    separados por espacios. El programa pedirá entonces dos valores y a continuación cambiará todas
    las ocurrencias del primer valor por el segundo en la lista generada anteriormente.</p>
<?php
    for($i = 0; $i < 50; $i++){
        $numArray[$i] = rand(0,20);
    }
    foreach($numArray as $num){
        $arrayString = $arrayString." ".$num;
    }
    echo $arrayString;
    
?>
    <form action="Ejercicio3_1.php" method="post">
        <label for="valor1"><p>Introduzca un número:</p></label>
        <input type="number" name="valor1">
        <label for="valor2"><p>Introduzca otro número:</p></label>
        <input type="number" name="valor2">
        <input type="hidden" name="arrayString" value="<?=$arrayString?>"><br>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>