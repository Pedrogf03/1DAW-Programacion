<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 6</title>
</head>
<body>
    <h1>Ejercicio 6 PhP</h1>
    <p>Realiza una función que pinte la letra L por pantalla hecha con asteriscos. A la función se le pasará la
    altura como parámetro. El palo horizontal de la L tendrá una longitud de la mitad de la altura más uno.</p>
<?php
$altura = $_POST['altura'];
?>
    <form action="Ejercicio6.php" method="post">
        <label for="altura"><p>Introduzca la altura de la L:</p></label>
        <input type="number" min=0 name="altura">
        <input type="submit" value="Crear">
    </form>
    <br>
<?php
if(isset($altura)){
    pintarL($altura);
}

function pintarL($altura){
    for($i = 1; $i < $altura; $i++){
        echo "*<br>";
    }
    for($i = 1; $i < ($altura / 2) + 1; $i++){
        echo "* ";
    }
}

?>
</body>
</html>