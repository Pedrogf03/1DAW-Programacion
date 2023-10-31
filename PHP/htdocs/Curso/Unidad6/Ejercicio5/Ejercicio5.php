<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 5 PhP</h1>
    <p>Convierte en función el ejercicio 9.21, devolviendo el número con el dígito insertado.</p>
<?php
$num = $_POST['num'];
$digito = $_POST['digito'];
$posicionUser = $_POST['posicionUser'];
if(empty($num)) {
?>
    <form action="Ejercicio5.php" method="post">
        <label for="num"><p>Introduzca un número:</p></label>
        <input type="number" name="num">
        <label for="digito"><p>Introduzca el dígito que quiere insertar:</p></label>
        <input type="number" name="digito" min=0 max=9>
        <label for="posicionUser"><p>Introduzca la posicion donde quiere insertar el dígito</p></label>
        <input type="number" name="posicionUser">
        <input type="submit" value="Introducir">
    </form>
<?php
} else {
    introducirDigito($num, $digito, $posicionUser);
}

function introducirDigito($num, $digito, $posicionUser){

    while($num > 1) {
        $volteado = ($volteado * 10) + ($num % 10);
        $num /= 10;
    }
    $posicion = 1;
    $num = 0;
    while($volteado > 1){
        if($posicion == $posicionUser){
            $num = ($num * 10) + $digito;
        }
        $num = ($num * 10) + ($volteado % 10);
        $volteado /= 10;
        $posicion++;
    }

    echo $num;

}

?>
</body>
</html>