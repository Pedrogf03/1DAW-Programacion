<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 2 PhP</h1>
    <p>Convierte en función el ejercicio 8.4, haciendo que la función devuelva el resultado de una ecuación
    de segundo grado.</p>
<?php
$cont = $_POST['cont'];
if(empty($cont)){
?>
    <form action="Ejercicio2.php" method="post">
        <table>
            <tr>
                <td><label for="a">Variable a =</label></td>
                <td><input type="number" name="a"></td>
            </tr>
            <tr>
                <td><label for="a">Variable b =</label></td>
                <td><input type="number" name="b"></td>
            </tr>
            <tr>
                <td><label for="a">Variable c =</label></td>
                <td><input type="number" name="c"></td>
            </tr>
            <tr>
                <td colspan=2>
                    <input type="hidden" name="cont" value=1>
                    <input type="submit" value="Calcular">
                </td>
            </tr>
        </table>
    </form>
<?php
} else {
    $a = $_POST['a'];
    $b = $_POST['b'];
    $c = $_POST['c'];
    calcularEcuacion2($a, $b, $c);
}

function calcularEcuacion2($a, $b, $c){

    $x1 = ($b * (-1) + sqrt(pow($b, 2) - 4 * $a * $c)) / (2 * $a);
    $x2 = ($b * (-1) - sqrt(pow($b, 2) - 4 * $a * $c)) / (2 * $a);

    if((pow($b, 2) - 4 * $a * $c) < 0){

        $potencia = pow($b, 2) - 4 * $a * $c;
        $mult = 2 * $a;

        echo "(".$b * (-1)." ± √". $potencia .") / ".$mult;

    } else {
        echo "X = ".$x1." y ".$x2;
    }

}

?>
</body>
</html>