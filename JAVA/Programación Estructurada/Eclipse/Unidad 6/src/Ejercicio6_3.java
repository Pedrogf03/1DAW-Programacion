import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		new Ejercicio6_3().contenido();
		//Programa que calcula el área de un rectángulo
		
	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		float lado;
		
		System.out.println("Introduzca la longitud del lado del cuadrado:");
		lado = sc.nextInt();
		
		float area = lado * lado;
		
		System.out.println("El área del cuadrado es " + area);
		
		sc.close();
		
	}
	
}