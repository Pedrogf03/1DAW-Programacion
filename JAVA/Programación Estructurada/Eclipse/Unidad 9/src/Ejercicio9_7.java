import java.util.Scanner;

public class Ejercicio9_7 {

	public static void main(String[] args) {
		new Ejercicio9_7().contenido();
		//Programa que dice cuántos dígitos tiene un número introducido por teclado

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cifras = 1;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		sc.close();
		
		while(num / 10 != 0) {
			
			num = num / 10;
			
			cifras++;
			
		}
		
		System.out.println("El número introducido tiene "+ cifras +" cifras");
		
	}
	
}