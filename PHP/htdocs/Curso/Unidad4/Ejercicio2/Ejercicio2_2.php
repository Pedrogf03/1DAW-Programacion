<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Unidad 4</title>
</head>
<body>
    <h1>Ejercicio 2 PhP</h1>
    <p>Web de control de acceso a una caja fuerte.</p>
<?php 
$intentos = $_POST['intentos'];
$codigoIntroducido = $_POST['codigoIntroducido'];
$codigo = 1234;
if(empty($intentos)) {
    $intentos = 5;
}
if($intentos > 1 && $codigoIntroducido != $codigo) {
    echo "<h3>Tienes ",$intentos - 1, " intentos</h3>";
    ?>
    <form action="Ejercicio2_2.php" method="post">
    	<p>Introduzca la combinación:</p>
		<input type="hidden" name="intentos" value="<?= $intentos - 1?>">
		<input type="number" name="codigoIntroducido" min="0000" max="9999">
		<input type="submit" value="Continuar" />
	</form>
<?php 
} else if ($codigo == $codigoIntroducido) {
    echo "¡Enhorabuena, ha abierto la caja fuerte!";
} else if ($intentos == 1) {
    echo "Lo siento, ha agotado los intentos.";
}
?>
</body>
</html>