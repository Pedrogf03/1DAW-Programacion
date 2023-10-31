<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unidad 5</title>
</head>
<body>
    <h1>Ejercicio 7 PhP</h1>
    <p>Mejora la web anterior de forma que cada vez que se pulse un botón siguiente muestre la matriz
    rotada de nuevo.</p>
<?php
    $cont = $_POST['cont'];
    $matrizString = $_POST['matrizString'];
    if(empty($cont)){
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
    } else {
        $matrizString = trim($matrizString);
        $arrayString = explode(" ", $matrizString);
        $matrizString = "";
        $i = 0;
        for($filas = 0; $filas < 6; $filas++){
            for($columnas = 0; $columnas < 6; $columnas++){
                $matriz[$filas][$columnas] = (int)$arrayString[$i];
                $i++;
            }
        }
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
    <?php
        for($filas = 0; $filas < 6; $filas++){
            for($columnas = 0; $columnas < 6; $columnas++){
                $matrizString = $matrizString." ".$nuevaMatriz[$filas][$columnas];
            }
        }
    }
    for($filas = 0; $filas < 6; $filas++){
        for($columnas = 0; $columnas < 6; $columnas++){
            $matrizString = $matrizString." ".$matriz[$filas][$columnas];
        }
    }
?>
    <br>
    <form action="Ejercicio7.php" method="post">
        <input type="hidden" name="cont" value="<?=$cont+1?>">
        <input type="hidden" name="matrizString" value="<?=$matrizString?>">
        <input type="submit" value="Rotar">
    </form>
</body>
</html>