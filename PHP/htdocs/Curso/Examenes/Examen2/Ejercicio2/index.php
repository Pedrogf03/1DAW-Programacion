<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Examen 2do Trimestre</title>
</head>
<body>
    <h1>Ejercicio 2</h1>
<?php
$lado = $_POST['lado'];
if (empty($lado)){
?>
    <form action="index.php" method="post">
        <label for="lado">Introduzca el lado de la matriz:</label>
        <br/>
        <input type="number" min=1 name="lado">
        <br/>
        <input type="submit" value="Crear matriz">
    </form>
<?php
} else {
    include_once('funciones.php');
    $i = 0;
    foreach(crearMatriz($lado) as $filas){
        $j = 0;
        echo "<br/> ";
        foreach($filas as $matriz){
            echo $matriz." ";
            $array[$i][$j] = $matriz;
            $j++;
        }
        $i++;
    }
    echo "<br/>";
    echo "<br/>";
    echo diagonalIzq($array);
    echo "<br/>";
    echo "<br/>";
    echo diagonalDcha($array);

}
?>
</body>
</html>