<?php

$conexion = mysqli_connect('localhost', 'root', '', 'alumnos');

if(mysqli_connect_errno()){
    echo "Error al conectar";
} else {
    echo "Conectado a la base de datos. </br>";
}

$insert = mysqli_query($conexion, "INSERT INTO alumnos VALUES ('2', 'Sulaiman', 'Taieb', 'taieb@protonmail.com')");

if($insert) {
    echo "Inserción correcta.";
} else {
    echo mysqli_error($conexion);
}

$select = mysqli_query($conexion, "SELECT * FROM alumnos");

while($tupla=mysqli_fetch_assoc($select)){
    echo $tupla['numexp']." ";
    echo $tupla['nombre']." ";
    echo $tupla['apellidos']." ";
    echo $tupla['email']." ";
    echo "<hr>";
}

?>