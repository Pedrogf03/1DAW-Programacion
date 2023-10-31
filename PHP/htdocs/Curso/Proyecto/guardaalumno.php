<?php

if(isset($_POST)){
    
    require_once 'includes/conexion.php';
    
    //var_dump($_POST);
    
    $numexp = $_POST['numexp'];
    $nombre = $_POST['nombre'];
    $apellidos = $_POST['apellidos'];
    $correo= $_POST['correo'];
    
    // Validación
    $errores = array();
    
    if(empty($nombre)){
        $errores['nombre'] = 'El nombre no es válido';
    }
    
    if(empty($apellidos)){
        $errores['apellidos'] = 'Los apellidos no son válidos';
    }
    
    if(empty($numexp) || !is_numeric($numexp)){
        $errores['numexp'] = 'El número de expediente no es válido';
        
    }
    
    if(empty($correo) || !filter_var($correo, FILTER_VALIDATE_EMAIL)){
        $errores['correo'] = 'El correo electrónico no es válido';
    }
    

    
    if(count($errores) == 0){
           
            $sql = "INSERT INTO `alumnos` (`numexp`, `nombre`, `apellidos`, `email`) VALUES ('$numexp', '$nombre', '$apellidos', '$correo');";
            
      
        $guardar = mysqli_query($db, $sql);
        
        //var_dump($guardar);
        

    }else{
        
        $_SESSION["errores_entrada"] = $errores;
        var_dump($_SESSION);
        
    }
    
    header("Location: anhadiralumno.php");
}
