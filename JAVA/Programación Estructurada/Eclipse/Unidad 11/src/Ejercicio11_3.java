import java.util.Scanner;
public class Ejercicio11_3 {

	public static void main(String[] args) {
		new Ejercicio11_3().contenido();
		/*Programa que lee 15 números por teclado y los almacena en un array. Rota los
		elementos de ese array y, finalmente, muestra el contenido del array.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[15];
		int ultimo = 0;
		
		for(int i = 0; i < 15; i++) {
			
			System.out.println("Introduzca un número: ");
			num[i] = sc.nextInt();
			
			if (i == 14) {		
				ultimo = num[i];		
			}
			
		}
		sc.close();
		
		for(int i = 14; i >= 0; i--) {
			
			if (i == 0) {			
				num[i] = ultimo;		
			} else {	
				num[i] = num[i-1];		
			}		
		}
		
		for(int i = 0; i < 15; i++) {
			
			System.out.println(num[i]);
			
		}		
	}	
}
