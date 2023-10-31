import java.util.Scanner;
public class Ejercicio10_6 {

	public static void main(String[] args) {
		new Ejercicio10_6().contenido();
		//Programa que genera numeros pares entre 0 y 100 de forma aleatoria hasta que adivine el del usuario.

	}

	public void contenido(){
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int numUser;
			int num = -1;
			int contador = 0;
			
			System.out.println("Introduce un número par entre 0 y 100:");
			numUser = sc.nextInt();
			
			while((numUser % 2 == 1) || (numUser < 0) || (numUser > 100)) {
				System.out.println("Debe ser un número par entre 0 y 100.");
				numUser = sc.nextInt();
			}

			while (num != numUser) {
				num = (int)(Math.random()*51)*2;
				contador++;
			}
			
			System.out.println("El número que ha introducido es "+ numUser +", he usado "+ contador +" intentos para adivinarlo.");
			
			System.out.println("¿Quiere jugar de nuevo?");
			
		} while (sc.next().toLowerCase().equals("si"));
		
		sc.close();
	}
}
