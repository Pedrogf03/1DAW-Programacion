import java.util.Scanner;
import funciones.Funciones;
public class Prueba2 {

	public static void main(String[] args) {
		/*Crea un programa al que se le introduzcan dos números y muestre los
		números capicúa existentes entre ambos números, incluyendo los números
		introducidos si lo fuesen.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		int inicio = sc.nextInt();
		System.out.println("Introduzca otro número:");
		int fin = sc.nextInt();
		sc.close();
		
		for(int i = inicio; i <= fin; i++) {
			if(Funciones.esCapicua(i)) {
				System.out.println(i +" ");
			}
		}

	}

}
