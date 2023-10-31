import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		new Ejercicio2().contenido();
		//Programa que calcula y muestra la suma de los múltiplos de 5 comprendidos entre dos valores A y B.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int valorA;
		int valorB;
		int suma = 0;
		
		do {
			
			System.out.println("Introduzca un número positivo: ");
			valorA = sc.nextInt();
			System.out.println("Introduzca otro número positivo: ");
			valorB = sc.nextInt();
			
			
		} while ((valorA < 0) || (valorB < 0));
		
		sc.close();
		
		if (valorA > valorB) {
			
			int intercambio = valorA;
			valorA = valorB;
			valorB = intercambio;;
			
		}
			
		for (int i = valorA; i <= valorB; i++) {
				
			if (i % 5 == 0) {
					
				suma += i;
					
			}
				
		}
			
			System.out.println("La suma de los múltiplos de 5 comprendidos entre "+ valorA +" y "+ valorB +" es "+ suma +".");
		
	}
	
}
