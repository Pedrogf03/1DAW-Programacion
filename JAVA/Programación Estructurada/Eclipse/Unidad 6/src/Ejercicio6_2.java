import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		new Ejercicio6_2().contenido();
		//Programa que dados dos números, calcula su suma, resta multiplicación y division con resto
		
	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.println("Inserte el primer número:");
		num1 = sc.nextInt();
		
		System.out.println("Inserte el segundo número:");
		num2 = sc.nextInt();
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float mult = num1 * num2;
		float div = num1 / num2;
		float resto = num1 % num2;
		
		System.out.println("Resultados:");
		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + resta);
		System.out.println(num1 + " x " + num2 + " = " + mult);
		System.out.println(num1 + " / " + num2 + " = " + div + " Resto = " + resto);
		
		sc.close();
		
	}
	
}