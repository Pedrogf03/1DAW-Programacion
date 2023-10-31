import java.util.Scanner;
public class Ejercicio9_14 {

	public static void main(String[] args) {
		new Ejercicio9_14().contenido();
		//Programa que pide un número por teclado y muestre ese número al revés.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		sc.close();
	    int volteado = 0;
	    while (num > 0) {
	      volteado = (volteado * 10) + (num % 10);
	      num /= 10;
	    }
	    System.out.println(volteado);
	}
}
