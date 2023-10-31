import java.util.Scanner;
public class Ejercicio9_12 {

	public static void main(String[] args) {
		new Ejercicio9_12().contenido();
		//Programa que diga si un número introducido por teclado es o no primo

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int primo = 0;
		int contador = 0;
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		sc.close();
		for(int i = 1; i <= num; i++) {
		
			primo = num % i;
			if(primo == 0) {
				
				contador++;
			}
		}
		
		if(contador <= 2) {
			
			System.out.println("El número es primo");
		}else if(contador > 2) {
			
			System.out.println("El número no es primo");
		}
	}
}
