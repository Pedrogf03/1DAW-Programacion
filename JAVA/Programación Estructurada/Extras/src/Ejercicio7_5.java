import java.util.Scanner;
public class Ejercicio7_5 {

	public static void main(String[] args) {
		new Ejercicio7_5().contenido();
		//Programa que pide 10 números por teclado y luego los muestre indicando cual es el maximo y cual es el minimo.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num2 = 1;
		int num3 = 1;
		int maximo = 0;
		int minimo = 0;
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número: ");
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			
			if (num[i] > num2) {
				
				maximo = num[i];
				num2 = num[i];
				
			} else if (num[i] < num2) {
				
				maximo = num2;
				
			}
			
			if(num[i] < num3) {
				
				minimo = num[i];
				num3 = num[i];
				
			} else if (num[i] > num3) {
				
				minimo = num3;

			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			
			if (num[i] == maximo) {
				
				System.out.println(num[i] +" maximo");
				
			} else if (num[i] == minimo) {
				
				System.out.println(num[i] +" minimo");
				
			} else {
				
				System.out.println(num[i]);
				
			}
			
		}
		
	}
	
}
