<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <title>Repaso</title>
</head>
<body>
	<h1>Ejercicio 3 PhP</h1>
	<p>Web que da cinco intentos de acertar un número aleatorio entre 1 y 100
	e indique al usuario si el número introducido es mayor o menor al número a acertar.</p>
<?php 
$numUser = $_POST['numUser'];
$intentos = $_POST['intentos'];
$num = $_POST['num'];
if (empty($intentos)){
    $intentos = 6;
    $num = rand(0, 100);
}
if(((empty($numUser)) || ($numUser > 100 || $numUser < 0)) && $intentos > 1) {
    echo "Introduzca un número entre 0 y 100.  Tiene ", $intentos - 1, " intentos.";
?>
	<form action="Ejercicio3.php" method="post">
		<input type="number" name="numUser" min="0" max="100">
		<input type="hidden" name="intentos" value="<?=$intentos - 1?>">
		<input type="hidden" name="num" value="<?=$num?>">
		<input type="submit" value="Enviar">
	</form>
<?php
}  else if (($numUser > $num) && ($intentos > 1)) {
    echo "$numUser es mayor que mi número. Tiene ", $intentos - 1, " intentos.";
?>
	<form action="Ejercicio3.php" method="post">
		<input type="number" name="numUser" min="0" max="100">
		<input type="hidden" name="intentos" value="<?=$intentos - 1?>">
		<input type="hidden" name="num" value="<?=$num?>">
		<input type="submit" value="Enviar">
	</form>
<?php
} else if ($numUser < $num && ($intentos > 1)) {
    echo "$numUser es menor que mi número. Tiene ", $intentos - 1, " intentos.";
?>
	<form action="Ejercicio3.php" method="post">
		<input type="number" name="numUser" min="0" max="100">
		<input type="hidden" name="intentos" value="<?=$intentos - 1?>">
		<input type="hidden" name="num" value="<?=$num?>">
		<input type="submit" value="Enviar">
	</form>
<?php
} else if ($num == $numUser && ($intentos > 0)) {
    echo "¡Ha acertado! El número era $numUser";
?>
	<form action="Ejercicio3.php" method="post">
		<input type="hidden" name="intentos" value="0">
		<input type="submit" value="Jugar otra vez">
	</form>
<?php
} else if ($intentos == 1) {
    echo "Lo siento, se ha quedado sin intentos. El número era $num.";
?>
	<form action="Ejercicio3.php" method="post">
		<input type="hidden" name="intentos" value="0">
		<input type="submit" value="Jugar otra vez">
	</form>
<?php
}
?>
</body>
</html>