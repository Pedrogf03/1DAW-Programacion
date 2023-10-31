<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 3 PhP</h1>
    <p>Convierte en función el ejercicio 9.12, haciendo que la función nos devuelva si un entero es primo o
    no como valor booleano.</p>
<?php
$num = $_POST['num'];
?>
    <form action="Ejercicio3.php" method="post">
        <label for="num">Introduzca un número:</label><br>
        <input type="number" name="num">
        <input type="submit" value="Comprobar">
    </form>
<?php
if(!empty($num)){
   if(esPrimo($num)){
       echo "Es primo";
   } else {
       echo "No es primo";
   }
}

function esPrimo($num){
    
    $contador = 0;
    for($i = 1; $i <= $num; $i++){
        if($num % $i == 0){
            $contador++;
        }
    }

    if($contador <= 2) {
        $primo = true;
    } else {
        $primo = false;
    }

    return $primo;

}

?>
</body>
</html>