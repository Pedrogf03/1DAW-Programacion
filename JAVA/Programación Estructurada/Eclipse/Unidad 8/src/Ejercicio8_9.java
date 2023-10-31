import java.util.Scanner;

public class Ejercicio8_9 {

	public static void main(String[] args) {
		new Ejercicio8_9().contenido();
		//Juego de piedra, papel, tijeras

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		String turno1;
		String turno2;
		
		System.out.println("Turno del jugador 1:");
		turno1 = sc.next().toLowerCase();
		
		System.out.println("Turno del jugador 2:");
		turno2 = sc.next().toLowerCase();
		
		sc.close();
		
		switch (turno1) {
		
		case "piedra":
			
			if(turno2.equals("papel")) {
				
				System.out.println("Gana el jugador 2");
				
			}else if(turno2.equals("tijeras")) {
				
				System.out.println("Gana el jugador 1");
				
			}else if(turno2.equals("piedra")) {
				
				System.out.println("Empate");
				
			}else {
				
				System.out.println("Error, inténtelo de nuevo");
				
			}
			
		break;
		
		case "papel":
			
			if(turno2.equals("papel")) {
				
				System.out.println("Empate");
				
			}else if(turno2.equals("tijeras")) {
				
				System.out.println("Gana el jugador 2");
				
			}else if(turno2.equals("piedra")) {
				
				System.out.println("Gana el jugador 1");
				
			}else {
				
				System.out.println("Error, inténtelo de nuevo");
				
			}
			
		break;
		
		case "tijeras":
			
			if(turno2.equals("papel")) {
				
				System.out.println("Gana el jugador 1");
				
			}else if(turno2.equals("tijeras")) {
				
				System.out.println("Empate");
				
			}else if(turno2.equals("piedra")) {
				
				System.out.println("Gana el jugador 2");
				
			}else {
				
				System.out.println("Error, inténtelo de nuevo");
				
			}
			
		break;
			
		}
		
	}
	
}