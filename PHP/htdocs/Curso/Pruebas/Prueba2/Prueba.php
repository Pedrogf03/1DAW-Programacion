<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Prueba 2do Trimestre</title>
</head>
<body>
    <h1>Ejercicio PhP</h1>
    <p>Escribe una web que genere 50 números aleatorios del 0 al 20 y que los
    muestre por pantalla. La web pedirá entonces tres valores y a continuación cambiará
    todas las ocurrencias del primer y segundo valor por el tercer valor en la lista
    generada anteriormente. Organiza tu código con funciones donde sea posible y usa
    include_once para importarlas.</p>
<?php
include_once('funciones.php');

$arrayString = generaArrayString(50, 0, 20);

?>
    <form action="Prueba_2.php" method="post">
        <label for="valor1"><p>Introduzca un número:</p></label>
        <input type="number" name="valor1" min=0 max=20>
        <label for="valor2"><p>Introduzca otro número:</p></label>
        <input type="number" name="valor2" min=0 max=20>
        <label for="valor3"><p>Introduzca el número por el cual quiere cambiar los dos valores anteriores:</p></label>
        <input type="number" name="valor3">
        <input type="hidden" name="arrayString" value="<?=$arrayString?>"><br>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>