import java.util.Scanner;
public class Ejercicio8_1 {

	public static void main(String[] args) {
		new Ejercicio8_1().contenido();
		//Programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
	}

	public void contenido() {
		
		Scanner sc  = new Scanner (System.in);
		
		String dia;
		
		System.out.println("Introduzca un día de la semana:");
		dia = sc.next().toLowerCase();
		
		sc.close();
		
		switch(dia) {
		case "lunes":
			System.out.println("Los lunes a primera tocan 2 horas de Entornos de Desarrollo.");
			break;
		case "martes":
			System.out.println("Los martes a primera tocan 2 horas de Bases de Datos.");
			break;
		case "miercoles":
			System.out.println("Los miércoles a primera toca 1 hora de Sistemas Informáticos.");
			break;
		case "jueves":
			System.out.println("Los jueves a primera tocan 2 horas de Programación.");
			break;
		case "viernes":
			System.out.println("Los viernes a primera toca 1 hora de Lenguaje de Marcas.");
			break;
		case "sabado":
			System.out.println("¿También quieres ir a clase los fines de semama?");
			break;
		case "domingo":
			System.out.println("¿También quieres ir a clase los fines de semama?");
			break;
		default:
			System.out.println("Ha introducido parámetros inválidos.");
			break;
			
		}
		
	}
	
}
