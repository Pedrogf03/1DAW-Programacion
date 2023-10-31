<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
    <h1>Ejercicio 6 PhP</h1>
    <p>Programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
    posición en el sentido de las agujas del reloj. La matriz debe tener 6 filas por 6 columnas y debe
    contener números generados al azar entre 1 y 99. Se debe mostrar tanto la matriz original como la
    matriz resultado, ambas con los números convenientemente alineados.</p>
<?php
for($filas = 0; $filas < 6; $filas++){
    for($columnas = 0; $columnas < 6; $columnas++){
        $matriz[$filas][$columnas] = rand(0, 100);
    }
}
?>
    <table border=1>
        <tr>
            <th colspan=6>Matriz original</th>
        </tr>
        <?php
        for($filas = 0; $filas < 6; $filas++){
        ?>
        <tr>
        <?php
            for($columnas = 0; $columnas < 6; $columnas++){
        ?>
            <td>
            <?php
                echo $matriz[$filas][$columnas];
            ?>
            </td>
        <?php
            }
        ?>
        </tr>
        <?php
        }
        ?>
    </table>
<?php
    $size = count($matriz);
    for($filas = 0; $filas < 6; $filas++){
        for($columnas = 0; $columnas < 6; $columnas++){
            $nuevaMatriz[$size-1-$columnas][$filas] = $matriz[$filas][$columnas];
        }
    }
?>
    <table border=1>
        <tr>
            <th colspan=6>Matriz rotada</th>
        </tr>
        <?php
        for($filas = 0; $filas < 6; $filas++){
        ?>
        <tr>
        <?php
            for($columnas = 0; $columnas < 6; $columnas++){
        ?>
            <td>
            <?php
                echo $nuevaMatriz[$filas][$columnas];
            ?>
            </td>
        <?php
            }
        ?>
        </tr>
        <?php
        }
        ?>
    </table>
</body>
</html>