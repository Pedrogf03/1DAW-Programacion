public class Ejercicio4_3 {

	public static void main(String[] args) {
		new Ejercicio4_3().contenido();

	}
	
	public void contenido() {
		
		int numeroAlumnos;
		int nuevasMatriculas;
		int alumnosTotales;
		
		numeroAlumnos = 12;
		nuevasMatriculas = 8;
		
		System.out.println("Número de alumnos antes: " + numeroAlumnos);
		
		alumnosTotales = numeroAlumnos + nuevasMatriculas;
		
		System.out.printf("Número de alumnos ahora: " + alumnosTotales + "\n");
		
		long habitantesEspana;
		
		habitantesEspana = 47394223;
		
		System.out.printf("España tiene " + habitantesEspana + " habitantes\n");

	}

}