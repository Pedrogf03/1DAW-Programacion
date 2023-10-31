<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Examen 2do Trimestre</title>
</head>
<body>
    <h1>Ejercicio 1</h1>
    <form action="salario.php" method="post">
        <label for="nombre">Nombre:</label>
        <br/>
        <input type="text" name="nombre">
        <br/>
        <label for="apellidos">Apellidos:</label>
        <br/>
        <input type="text" name="apellidos">
        <br/>
        <label for="salario">Salario:</label>
        <br/>
        <input type="number" name="salario" min=0>
        <br/>
        <label for="edad">Edad:</label>
        <br/>
        <input type="number" name="edad" min=0>
        <br/>
        <br/>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>