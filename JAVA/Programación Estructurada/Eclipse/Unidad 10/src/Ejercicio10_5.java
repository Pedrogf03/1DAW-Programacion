import java.util.Scanner;
public class Ejercicio10_5 {

	public static void main(String[] args) {
		new Ejercicio10_5().contenido();
		//Programa que piensa un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades.

	}

	public void contenido(){
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			int oportunidades = 4;
			int numUser = 0;
			int num = (int)(Math.random()*101);
			
			System.out.println("Tienes 5 oportunidades para divinar el número entre 0 y 100 que estoy pensando.");
			numUser = sc.nextInt();
			
			while ((oportunidades > 0) && (num != numUser)) {
				System.out.println("Tienes "+ oportunidades +" intentos, prueba otra vez.");
				numUser = sc.nextInt();
				oportunidades--;
			}
			
			if (oportunidades == 0) {
				System.out.println("Te has quedado sin oportunidades, el número era "+ num +".");
			} else {
				System.out.println("¡Lo has adivinado!");
			}
			
			System.out.println("¿Quiere jugar otra vez?");
		} while (sc.next().toLowerCase().equals("si"));
		
		sc.close();
	}
}
