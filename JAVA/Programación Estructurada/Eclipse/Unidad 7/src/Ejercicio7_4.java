import java.util.Scanner;

public class Ejercicio7_4 {

	public static void main(String[] args) {
		new Ejercicio7_4().contenido();
		//Programa que dada una hora (horas y minutos) calcule los segundos que quedan para media noche

	}
	
	public void contenido() {
	
	Scanner sc = new Scanner(System.in);
	
	int hora;
	
	System.out.println("Introduzca la hora:");
	hora = sc.nextInt();
	
	if((hora <= 24) && (hora >= 0)) {
		
		if((hora == 24) || (hora == 0)) {
			
			System.out.println("Ya es media noche");
			
			}else if(hora < 24) {
			
				int min;
			
				System.out.println("Introduzca los minutos:");
				min = sc.nextInt();
			
				sc.close();
			
				if((min < 60) && (min >= 0)) {
				
					if(min == 0) {
					
						int restaHora = 24 - hora;
						
						int segsHora = restaHora * 3600;
					
						System.out.println("Quedan "+ segsHora +" segundos para media noche");
					
					}else if(min > 0) {
					
						int restaHora = 23 - hora;
						int restaMin = 60 - min;
						
						int segsHora = restaHora * 3600;
						int segsMin = restaMin * 60;
						int resultSegs = segsHora + segsMin;
					
						System.out.println("Quedan "+ resultSegs +" segundos para media noche");
					
					}
				
				}else {
				
					System.out.println("Los minutos no pueden ser superiores a 59 ni inferiores a 0");
				
				}
			
			}
		
		}else {
		
		System.out.println("La hora no puede ser superior a 24 ni inferior a 0");
		
		}
	
	}
	
}