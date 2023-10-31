import java.util.Scanner;
public class Ejercicio10_7 {

	public static void main(String[] args) {
		new Ejercicio10_7().contenido();
		/*Programa que intenta adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
		En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir. */

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int intentos = 5;
			int num = -1;
			int numUser;
			int min = 0;
			int max = 100;
			String respuesta;
			
			System.out.println("Introduce un número entre 0 y 100 y lo intentaré adivinar.");
			numUser = sc.nextInt();
			
			while (numUser < 0 || numUser > 100) {
				System.out.println("Debe estar entre 0 y 100");
				numUser = sc.nextInt();
			}
			
			while ((num != numUser) && (intentos > 0)) {
				num = (int)(Math.random()*(max - min)+ min);
				if (num != numUser) {
					System.out.println("¿Tú número es mayor o menor que "+ num +"?");
					respuesta = sc.next().toLowerCase();
					
					if (respuesta.equals("mayor")) {
						min = num + 1;
					} else if (respuesta.equals("menor")) {
						max = num - 1;
					} else if (respuesta.equals("+")) {
						min = num + 1;
					} else if (respuesta.equals("-")) {
						max = num - 1;
					}
					
				}
				intentos--;
			}
			
			if (intentos == 0 && num != numUser) {
				System.out.println("Lo siento, no he podido adivinarlo.");
			} else {
				System.out.println("¡Lo sé! Tu número es el "+ num +".");
			}
			
			System.out.println("¿Quiere jugar de nuevo?");
		} while (sc.next().toLowerCase().equals("si"));
		
		sc.close();
	}
}
