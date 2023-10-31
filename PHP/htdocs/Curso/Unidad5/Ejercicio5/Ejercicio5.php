<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad5</title>
</head>
<body>
    <h1>Ejercicio 5 PhP</h1>
    <p>Crea un mini-diccionario español-inglés que contenga, al menos, 10 palabras (con su traducción).
    Utiliza un array asociativo para almacenar las parejas de palabras. El programa pedirá una palabra
    en español y dará la correspondiente traducción en inglés.</p>
    <p>(Números del 1 al 10)</p>
<?php
$palabra = $_POST['palabra'];
$dictionary = ["Uno" => "One", "Dos" => "Two", "Tres" => "Three", "Cuatro" => "Four", "Cinco" => "Five", "Seis" => "Six", "Siete" => "Seven", "Ocho" => "Eight", "Nueve" => "Nine", "Diez" => "Ten"];
?>
    <form action="Ejercicio5.php" method="post">
        <label for="palabra">Introduzca una palabra:</label>
        <input type="text" name="palabra">
        <input type="submit" value="Traducir">
    </form>
<?php
if(isset($palabra)){
    echo "<br>Traducción: ".$dictionary[$palabra];
}
?>
</body>
</html>