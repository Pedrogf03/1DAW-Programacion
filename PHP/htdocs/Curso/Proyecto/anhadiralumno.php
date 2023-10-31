
<?php require_once 'includes/cabecera.php'; ?>	

<!-- CAJA PRINCIPAL -->
<div id="principal">
	
	<br/>
	<form action="guardaalumno.php" method="POST">
		<label for="numexp">Número de expediente:</label>
		<input type="number" name="numexp" />
		<?php echo isset($_SESSION['errores_entrada']) ? mostrarError($_SESSION['errores_entrada'], 'numexp') : ''; ?>
		
		<label for="nombre">Nombre:</label>
		<input type="text" name="nombre" />
		<?php echo isset($_SESSION['errores_entrada']) ? mostrarError($_SESSION['errores_entrada'], 'nombre') : ''; ?>
		

		<label for="apellidos">Apellidos:</label>
		<input type="text" name="apellidos" />
		<?php echo isset($_SESSION['errores_entrada']) ? mostrarError($_SESSION['errores_entrada'], 'apellidos') : ''; ?>
		
		<label for="correo">Email:</label>
		<input type="email" name="correo" />
		<?php echo isset($_SESSION['errores_entrada']) ? mostrarError($_SESSION['errores_entrada'], 'correo') : ''; ?>
		
		
		<input type="submit" value="Guardar" />
	</form>
	<?php borrarErrores(); ?>
</div> <!--fin principal-->