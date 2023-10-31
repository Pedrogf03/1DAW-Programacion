import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		new Ejercicio2().contenido();
		//Programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana (domingo a las 00:00).

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		String dia;
		int hora;
		int minTotal = 0;
		int min = 0;
		System.out.println("Introduzca el día:");
		dia = sc.next().toLowerCase();
		
		switch(dia){
		case "lunes":
			minTotal = 1440 * 7;
			break;
		case "martes":
			minTotal = 1440 * 6;
			break;
		case "miercoles":
			minTotal = 1440 * 5;
			break;
		case "jueves":
			minTotal = 1440 * 4;
			break;
		case "viernes":
			minTotal = 1440 * 3;
			break;
		case "sabado":
			minTotal = 1440 * 2;
			break;
		case "domingo":
			minTotal = 1440;
			break;
		default: 
			System.out.println("Ha introduido parámetros inválidos");
			System.exit(0);
			break;
		}
		System.out.println("Introduzca la hora:");
		hora = sc.nextInt();
		if((hora > 24) || (hora < 0)) {
			System.out.println("Error, la hora no puede ser mayor que 24 ni menor que 0");
			System.exit(0);
		}else {
			System.out.println("Introduzca los minutos:");
			min = sc.nextInt();
			if((min > 59) || (min < 0)) {
				System.out.println("Error, los minutos no pueden ser mayor 59 ni menor que 0");
				System.exit(0);
			}else {
				minTotal = minTotal - (hora * 60) - min;
			}
		}
		sc.close();
		System.out.println("Quedan "+ minTotal +" minutos para que acabe la semana.");
	}
	
}