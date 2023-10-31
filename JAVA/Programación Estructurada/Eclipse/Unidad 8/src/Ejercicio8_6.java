import java.util.Scanner;

public class Ejercicio8_6 {

	public static void main(String[] args) {
		new Ejercicio8_6().contenido();
		//Programa que dice cuál es la última cifra de un número entero introducido por teclado.

	}
	
	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		long num;
		
		System.out.println("Introduzca un número");
		num = sc.nextLong();
		
		sc.close();
		
		long cifra = num % 10;
		
		System.out.println(cifra);
		
	}

}