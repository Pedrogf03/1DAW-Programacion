import java.util.Scanner;
public class Ejercicio11_2 {

	public static void main(String[] args) {
		new Ejercicio11_2().contenido();
		/*Programa que pida 10 números por teclado y que luego muestre los números introducidos
		 junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int maximo = 0;
		int minimo = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduzca un número: ");
			num[i] = sc.nextInt();
			
			if (i == 0) {
				
				maximo = num[0];
				minimo = num[0];
				
			} else if (num[i] < minimo) {
				
				minimo = num[i];
				
			} else if (num[i] > maximo) {
				
				maximo = num[i];
				
			}
			
		}
		
		sc.close();
		
		for (int n : num) {
			
			if (n == maximo) {
				
				System.out.println(n +" máximo");
				
			} else if (n == minimo) {
				
				System.out.println(n +" mínimo");
				
			} else {
				
				System.out.println(n);
				
			}
			
		}
		
	}
	
}
