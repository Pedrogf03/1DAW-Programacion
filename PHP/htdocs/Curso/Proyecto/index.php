<?php require_once 'includes/cabecera.php'; ?>
		

<div id="principal">
	 <h2> Alumnos:</h2>

	 
	
	<table class="styled-table">
	 <tr>
	 <th>Número de expediente </th>
	 <th>Nombre </th>
	 <th>Apellidos </th>
	 <th>Email </th>

	 </tr>
	 
	<?php 
		$alumnos = obtenerAlumnos($db);
		if(!empty($alumnos)){
		while($alumno = mysqli_fetch_assoc($alumnos)){
	?>
				  <tr>
					
					<td><?=$alumno['numexp']?></td>
					<td><?=$alumno['nombre']?></td>
					<td><?=$alumno['apellidos']?></td>
					<td><?=$alumno['email']?></td>
					
					
				</tr>
				
	<?php
		} //Fin while
		} //Fin if
	?>
	
	</table>
	
</div> 



		</div>
		
	</body>
</html>
