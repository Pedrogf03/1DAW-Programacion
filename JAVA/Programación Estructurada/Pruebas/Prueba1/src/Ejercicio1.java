import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		new Ejercicio1().contenido();
		//Programa que pide introducir números y muestre el mayor de ellos. El programa se interrumpirá al introducir un número negativo.

	}
	public void contenido() {
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int mayor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vaya introduciendo números, introduzca un negativo para acabar.");
		while(num >= 0) {
			num = sc.nextInt();
			num1 = num;
			if(num1 > num2) {
				
				mayor = num1;
				num2 = num1;
				
			}else if(num2 > num1) {
				
				mayor = num2;
				
			}
		}
		sc.close();
		System.out.println("El número más grande es "+ mayor);
	}
}