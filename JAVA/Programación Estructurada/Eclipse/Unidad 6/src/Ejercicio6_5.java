import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		new Ejercicio6_5().contenido();
		//Programa que calcula el salario semanal de un empleado en base a las horas trabajadas a razón de 12 euros la hora
		
	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int precioHora;
		String opcion;
		
		System.out.println("Indique el valor de la hora:");
		precioHora = sc.nextInt();
		
		System.out.println("Número de horas trabajadas:");
		horas = sc.nextInt();
		
		System.out.println("¿Salario mensual o semanal?");
		opcion = sc.next();
		
		sc.close();
		
		if (opcion.equals("mensual")) {
			
			int salario = horas * precioHora * 30;
			
			System.out.println("Su salario mensual es de "+ salario +"€");
			
		}else if(opcion.equals("semanal")) {
			
			int salario = horas * precioHora * 7;
			
			System.out.println("Su salario semanal es de "+ salario +"€");
			
		}else {
			
			System.out.println("Tiene que elegir mensual o semanal");
			
		}
		
	}
	
}