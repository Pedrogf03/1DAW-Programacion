<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
</head>
<body>
<?php 
$intentos = $_POST['intentos'];
$codigoIntroducido = $_POST['codigoIntroducido'];
$codigo = 1234;

if($codigoIntroducido == $codigo) {
    echo "¡Enhorabuena, ha conseguido abrir la caja!";
} else if ($codigoIntroducido != $codigo) {
    if ($intentos == 1) {
        echo "Lo siento, se ha quedado sin intentos.";
    } else {
?>
	<p>Quedan <?= $intentos = $intentos - 1 ?> intentos para abrir la caja.</p>
	<p>Introduzca un código:</p>
	<form action="Ejercicio2.php" method="post">
		<input type="number" name="codigoIntroducido" />
		<input type="hidden" name="intentos" value="<?= $intentos ?>" />
		<input type="submit" value="Continuar">
	</form>
<?php
    }
}
?>
</body>
</html>