import java.util.Scanner;

//Importar la librería Scanner

public class Ejercicio5_2 {

	public static void main(String[] args) {
		new Ejercicio5_2().contenido();
		//Programa que dado un valor en millas, lo convierta a Kilómetros

	}

	public void contenido() {
		Scanner sc = new Scanner(System.in);
		//Abrir el escáner de teclado
		
		float millas;
		float km;
		//Crear las variables millas y km
		
		System.out.println("Introduzca el número de millas: ");
		millas = sc.nextInt();
		//Preguntar al usuario por el valor de la variable millas
		
		km = millas * 1.60934f;
		//Convertir millas a km multiplicando por 1.60934
		
		System.out.println(+ millas + " millas son " + km + " kilómetros");
		//Mostrar el resultado por pantalla
		
		sc.close();
		//Cerrar el escáner de teclado
		
	}

}