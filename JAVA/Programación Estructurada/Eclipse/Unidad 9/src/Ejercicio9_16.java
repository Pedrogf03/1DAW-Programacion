import java.util.Scanner;

public class Ejercicio9_16 {

	public static void main(String[] args) {
		new Ejercicio9_16().contenido();
		//Programa que calcula el factorial de un número entero leído por teclado.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int num;
		long factorial = 1;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		sc.close();
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
	}
}
