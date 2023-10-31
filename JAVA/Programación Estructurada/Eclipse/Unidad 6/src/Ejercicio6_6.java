import java.util.Scanner;

public class Ejercicio6_6 {

	public static void main(String[] args) {
		new Ejercicio6_6().contenido();
		//Programa que calcula la nota de Programación, sabiendo que las prácticas valen 20% y examen 80%
	

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		float notaPractica;
		float notaExamen;
		
		System.out.println("Nota de las prácticas:");
		notaPractica = sc.nextFloat();
		
		System.out.println("Nota del exámen:");
		notaExamen = sc.nextFloat();
		
		float notaProgramacion = (notaPractica * 0.2f) + (notaExamen * 0.8f);
		
		System.out.println("Nota final de Programación: " + notaProgramacion);
		
		sc.close();
		
	}
	
}