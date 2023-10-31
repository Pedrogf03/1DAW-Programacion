import java.util.Scanner;

public class Ejercicio6_4 {

	public static void main(String[] args) {
		new Ejercicio6_4().contenido();
		//Programa que calcula el área de un triángulo

	}

	public void contenido(){
		
		Scanner sc = new Scanner(System.in);
		
		float base;
		float altura;
		
		System.out.println("Introduzca la base del triángulo:");
		base = sc.nextInt();
		
		System.out.println("Introduzca la altura del triángulo:");
		altura = sc.nextInt();
		
		float area = (base * altura) / 2;
		
		System.out.println("El área del triángulo es " + area);
		
		sc.close();
		
	}
	
}