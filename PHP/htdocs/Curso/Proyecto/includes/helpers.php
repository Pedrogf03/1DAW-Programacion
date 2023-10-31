<?php

// Muestra los errores que nos devuelven en la sesión.

function mostrarError($errores, $campo){
	$alerta = '';
	if(isset($errores[$campo]) && !empty($campo)){
		$alerta = "<div class='alerta alerta-error'>".$errores[$campo].'</div>';
	}
	
	return $alerta;
}

// Elimina los errores de la sesión

function borrarErrores(){
	$borrado = false;
	
	if(isset($_SESSION['errores'])){
		$_SESSION['errores'] = null;
		$borrado = true;
	}
	
	if(isset($_SESSION['errores_entrada'])){
		$_SESSION['errores_entrada'] = null;
		$borrado = true;
	}
	
	
	return $borrado;
}

// Obtiene todos los alumnos de la BBDD

function obtenerAlumnos($conexion){
    
    $sql = "SELECT * FROM alumnos ORDER BY numexp ASC;";
    $alumnos = mysqli_query($conexion, $sql);
    
    $resultado = [];
    
    if($alumnos && mysqli_num_rows($alumnos) >= 1){
        $resultado = $alumnos;
    }
    
    return $resultado;
    
}