import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		new Ejercicio8_2().contenido();
		//Programa que pida una hora y muestre buenos días, buenas tardes o buenas noches según la hora.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduzca la hora:");
		hora = sc.nextInt();
		
		sc.close();
		
		if((hora > 24) || (hora < 0)) {
			
			System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
			
		}else {
			
			if((hora >= 6) && (hora <= 12)) {
				
				System.out.println("Buenos días");
				
			}else if ((hora >= 13) && (hora <= 20)) {
				
				System.out.println("Buenas tardes");
				
			}else if ((hora >= 21) || (hora <= 5)) {
				
				System.out.println("Buenas noches");
			
			}
		
		}
	
	}
	
}