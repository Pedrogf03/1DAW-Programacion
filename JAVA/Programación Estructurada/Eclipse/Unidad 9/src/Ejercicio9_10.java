import java.util.Scanner;
public class Ejercicio9_10 {

	public static void main(String[] args) {
		new Ejercicio9_10().contenido();
		//Programa que muestra los n primeros términos de la serie de Fibonacci

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int suma = 1;
		int numeroUsuario;
		int repetir = 0;
		System.out.println("Introduzca un número:");
		numeroUsuario = sc.nextInt();
		sc.close();
		while(repetir < numeroUsuario) {
			System.out.print(num1 +" ");
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			repetir++;
		}
	}
}