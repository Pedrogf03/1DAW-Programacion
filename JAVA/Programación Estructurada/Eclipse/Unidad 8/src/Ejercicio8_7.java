import java.util.Scanner;

public class Ejercicio8_7 {

	public static void main(String[] args) {
		new Ejercicio8_7().contenido();
		//Programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana (viernes a las 14:15).

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		String dia;
		int hora;
		
		System.out.println("Introduzca el día:");
		dia = sc.next().toLowerCase();
		
		switch(dia){
		
		case "lunes":
			
			System.out.println("Introduzca la hora");
			hora = sc.nextInt();
			
			if((hora < 0) || (hora > 24)) {
				
				System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
				
			}else if(hora > 0) {
				
				int min;
				
				System.out.println("Introduzca los minutos");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser menor que 0 ni mayor que 59");
					
				}else if(min == 0) {
					
					int diaMin = (24 - hora) * 60;
					int minTotal = diaMin + (1440 * 3) + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else if(min > 0) {
					
					int diaMin = (23 - hora) * 60;
					int minTotal = diaMin + (1440 * 3) + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else {
					
					System.out.println("Ha ocurrido un error, inténtelo de nuevo");
					
				}
				
			}else {
				
				System.out.println("Ha ocurrido un error, inténtelo de nuevo");
				
			}
			
			break;
			
		case "martes":
			
			System.out.println("Introduzca la hora");
			hora = sc.nextInt();
			
			if((hora < 0) || (hora > 24)) {
				
				System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
				
			}else if(hora > 0) {
				
				int min;
				
				System.out.println("Introduzca los minutos");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser menor que 0 ni mayor que 59");
					
				}else if(min == 0) {
					
					int diaMin = (24 - hora) * 60;
					int minTotal = diaMin + (1440 * 2) + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else if(min > 0) {
					
					int diaMin = (23 - hora) * 60;
					int minTotal = diaMin + (1440 * 2) + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else {
					
					System.out.println("Ha ocurrido un error, inténtelo de nuevo");
					
				}
				
			}else {
				
				System.out.println("Ha ocurrido un error, inténtelo de nuevo");
				
			}
			
			break;
			
		case "miercoles":
			
			System.out.println("Introduzca la hora");
			hora = sc.nextInt();
			
			if((hora < 0) || (hora > 24)) {
				
				System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
				
			}else if(hora > 0) {
				
				int min;
				
				System.out.println("Introduzca los minutos");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser menor que 0 ni mayor que 59");
					
				}else if(min == 0) {
					
					int diaMin = (24 - hora) * 60;
					int minTotal = diaMin + 1440 + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else if(min > 0) {
					
					int diaMin = (23 - hora) * 60;
					int minTotal = diaMin + 1440 + 855;
					//1440 = 24h en min, 855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else {
					
					System.out.println("Ha ocurrido un error, inténtelo de nuevo");
					
				}
				
			}else {
				
				System.out.println("Ha ocurrido un error, inténtelo de nuevo");
				
			}
			
			break;
			
		case "jueves":
			
			System.out.println("Introduzca la hora");
			hora = sc.nextInt();
			
			if((hora < 0) || (hora > 24)) {
				
				System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
				
			}else if(hora > 0) {
				
				int min;
				
				System.out.println("Introduzca los minutos");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser menor que 0 ni mayor que 59");
					
				}else if(min == 0) {
					
					int diaMin = (24 - hora) * 60;
					int minTotal = diaMin + 855;
					//855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else if(min > 0) {
					
					int diaMin = (23 - hora) * 60;
					int minTotal = diaMin + 855;
					//855 = 14:15 en min
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else {
					
					System.out.println("Ha ocurrido un error, inténtelo de nuevo");
					
				}
				
			}else {
				
				System.out.println("Ha ocurrido un error, inténtelo de nuevo");
				
			}
			
			break;
			
		case "viernes":
			
			System.out.println("Introzca la hora:");
			hora = sc.nextInt();
			
			if((hora < 0) || (hora > 24)) {
				
				System.out.println("La hora no puede ser mayor que 24 ni menor que 0");
				
			}else if(hora < 14) {
				
				int min;
				
				System.out.println("Introduzca los minutos:");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser mayor que 59 ni menor que 0");
					
				}else if(min >= 0) {
					
					int diaMin = (14 - hora) * 60;
					int minTotal = diaMin + min;
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else {
					
					System.out.println("Ha ocurrido un error, inténtelo de nuevo");
					
				}
				
			}else if (hora >= 14) {
				
				int min;
				
				System.out.println("Introduzca los minutos:");
				min = sc.nextInt();
				
				if((min < 0) || (min > 59)) {
					
					System.out.println("Los minutos no pueden ser mayor que 59 ni menor que 0");
					
				}else if(min < 15) {
					
					int minTotal = 15 - min;
					
					System.out.println("Quedan "+ minTotal +" minutos para el fin de semana");
					
				}else if(min >= 15) {
					
					System.out.println("Ya es fin de semana");
					
				}
				
			}
			
			break;
			
		case "sabado":
			
			System.out.println("Ya es fin de semana");
			
			break;
			
		case "domingo":
			
			System.out.println("Ya es fin de semana");
			
			break;
			
		default:
			
			System.out.println("Los parámetros introducidos no son válidos, inténtdelo de nuevo");
			
		}
		
		sc.close();
	}
	
}