import java.util.Scanner;
public class Ejercicio9_20 {

	public static void main(String[] args) {
		new Ejercicio9_20().contenido();
		//Programa que dice si un número introducido por teclado es o no capicúa.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		do {
			long numUser;
			System.out.println("Introduzca un número:");
			numUser = sc.nextInt();
			long num = numUser;
			long volteado = 0;
			while (num > 0) {
				volteado = (volteado * 10) + (num % 10);
				num /= 10;
			}
			if(volteado == numUser) {
				System.out.println(numUser +" es capicúa");
			}else {
				System.out.println(numUser +" no es capicúa");
			}
			System.out.println("¿Quiere comprobar otro número?");
		}while(sc.next().toLowerCase().equals("si"));
		sc.close();
	}
}
