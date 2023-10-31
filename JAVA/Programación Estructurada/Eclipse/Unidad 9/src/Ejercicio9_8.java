import java.util.Scanner;
public class Ejercicio9_8 {

	public static void main(String[] args) {
		new Ejercicio9_8().contenido();
		//Programa que calcule la media de un conjunto de números
	}
	
	public void contenido() {
		
		double numeros = 0;
		double num = 0;
		double suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vaya introduciendo números, introduzca un negativo para acabar.");
		while(num >= 0) {
			num = sc.nextInt();
			numeros++;
			suma += num;
		}
		
		sc.close();
		double media = (suma - num) / (numeros - 1);
		System.out.println("La media es "+ media);
	}

}
		