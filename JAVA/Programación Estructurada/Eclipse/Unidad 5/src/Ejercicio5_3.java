import java.util.Scanner;

//Importar la librería Scanner
public class Ejercicio5_3 {

	public static void main(String[] args) {
		new Ejercicio5_3().contenido();
		//Programa que dado un valor en pies, lo pasa a metros
		
	}
	
	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		//Abrir el escáner de teclado
		
		float pies;
		float metros;
		//Crear las variables pies y metros
		
		System.out.println("Introduzca el número de pies: ");
		pies = sc.nextInt();
		//Preguntar al usuario por el valor de la variable pies
		
		metros = pies / 3.28084f;
		//Convertir pies a metros dividiendo entre 0.3048
		
		System.out.println(pies + " pies son " + metros + " metros");
		//Mostrar el resultado por pantalla
		
		sc.close();
		//Cerrar el escáner de teclado
		
	}

}