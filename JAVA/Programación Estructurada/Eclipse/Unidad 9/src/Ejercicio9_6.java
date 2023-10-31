import java.util.Scanner;

public class Ejercicio9_6 {

	public static void main(String[] args) {
		new Ejercicio9_6().contenido();
		//Programa que muestra la tabla de multiplicar de un número introducido por teclado

	}

	public void contenido() {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int numerador = 1;
		
		System.out.println("Introduzca un número:");
		num= sc.nextInt();
		
		sc.close();
		
		while(numerador <= 10) {
			
			System.out.println(num +" * "+ numerador +" = "+ num * numerador);
			
			numerador++;
			
		}

	}
	
}