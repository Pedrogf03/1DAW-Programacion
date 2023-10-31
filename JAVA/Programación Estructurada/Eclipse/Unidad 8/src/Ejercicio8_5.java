import java.util.Scanner;

public class Ejercicio8_5 {

	public static void main(String[] args) {
		new Ejercicio8_5().contenido();
		//Programa que dice el horóscopo a partir del día y mes de nacimiento

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int mes;
		
		System.out.println("Introduza su día y mes de nacimiento (número)");
		dia = sc.nextInt();
		mes = sc.nextInt();
		
		sc.close();
		
		if(((dia > 31) || (dia < 1)) || ((mes < 1) || (mes > 12))) {		
			System.out.println("Ha introducido parámetros inválidos");			
		}else if ((mes == 2) && (dia > 29)) {		
			System.out.println("Febrero solo puede tener 29 días como máximo");			
		}else if(((dia <= 31) || (dia >= 1)) || ((mes >= 1) || (mes <= 12))) {			
			if(((dia >= 21) && (mes == 1)) || ((dia <= 18) && (mes == 2))){				
				System.out.println("Su signo es Aquarius");				
			}else if(((dia >= 19) && (mes == 2)) || ((dia <= 20) && (mes == 3))) {				
				System.out.println("Su signo es Piscis");				
			}else if(((dia >= 21) && (mes == 3)) || ((dia <= 20) && (mes == 4))) {				
				System.out.println("Su signo es Aries");				
			}else if(((dia >= 21) && (mes == 4)) || ((dia <= 20) && (mes == 5))) {				
				System.out.println("Su signo es Tauro");				
			}else if(((dia >= 21) && (mes == 5)) || ((dia <= 21) && (mes == 6))) {				
				System.out.println("Su signo es Géminis");				
			}else if(((dia >= 22) && (mes == 6)) || ((dia <= 22) && (mes == 7))) {				
				System.out.println("Su signo es Cáncer");				
			}else if(((dia >= 23) && (mes == 7)) || ((dia <= 22) && (mes == 8))) {				
				System.out.println("Su signo es Leo");				
			}else if(((dia >= 23) && (mes == 8)) || ((dia <= 22) && (mes == 9))) {				
				System.out.println("Su signo es Virgo");				
			}else if(((dia >= 23) && (mes == 9)) || ((dia <= 22) && (mes == 10))) {				
				System.out.println("Su signo es Libra");				
			}else if(((dia >= 23) && (mes == 10)) || ((dia <= 22) && (mes == 11))) {				
				System.out.println("Su signo es Escorpio");				
			}else if(((dia >= 23) && (mes == 11)) || ((dia <= 21) && (mes == 12))) {				
				System.out.println("Su signo es Sagitario");				
			}else if(((dia >= 22) && (mes == 12)) || ((dia <= 20) && (mes == 1))) {				
				System.out.println("Su signo es Capricornio");				
			}		
		}

	}
}