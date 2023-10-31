<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 4 PhP</h1>
    <p>Convierte en función el ejercicio 9.20, devolviendo un valor booleano diciendo si el número es capicúa
    o no.</p>
    <?php
$num = $_POST['num'];
?>
    <form action="Ejercicio4.php" method="post">
        <label for="num">Introduzca un número:</label><br>
        <input type="number" name="num">
        <input type="submit" value="Comprobar">
    </form>
<?php
if(!empty($num)){
   if(esCapicua($num)){
       echo "Es capicúa";
   } else {
       echo "No es capicúa";
   }
}

function esCapicua($num){
    
    $num2 = $num;
    while ($num2 > 1) {
        $volteado = ($volteado * 10) + ($num2 % 10);
        $num2 = $num2 / 10;
    }

    if($volteado == $num){
        $capicua = true;
    } else {
        $capicua = false;
    }

    return $capicua;

}

?>
</body>
</html>