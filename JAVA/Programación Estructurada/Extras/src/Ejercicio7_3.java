import java.util.Scanner;
public class Ejercicio7_3 {

	public static void main(String[] args) {
		new Ejercicio7_3().contenido();
		//Programa que lee 10 números y luego los muestra en orden unverso.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número: ");
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(num[i]);
		}
		
	}
	
}
