import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		new Ejercicio5_5().contenido();
		//Programa que calcula el voltaje a partir de la intensidad y resistencia dadas
	}

	public void contenido(){
		
		Scanner sc = new Scanner(System.in);
		//Abrir el escáner de teclado
		
		float intensidad;
		float resistencia;
		float voltaje;
		//Declarar las variables
		
		System.out.println("Introduca la intensidad:");
		intensidad = sc.nextInt();
		//Preguntar al usuario por la intensidad
		
		System.out.println("Introduzca la resistencia:");
		resistencia = sc.nextInt();
		//Preguntar al usuario por la resistencia
		
		voltaje = intensidad * resistencia;
		//Calcular el voltaje con la intensidad y resistencia
		
		System.out.println("El voltaje es de: " + voltaje + " voltios.");
		//Mostrar por pantalla el resultado
		
		sc.close();
		//Cerrar el escáner de teclado
		
	}
}