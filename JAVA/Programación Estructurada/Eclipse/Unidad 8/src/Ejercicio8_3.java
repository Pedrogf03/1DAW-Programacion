import java.util.Scanner;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		new Ejercicio8_3().contenido();
		//Programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Horas trabajadas:");
		horas = sc.nextInt();
		
		sc.close();
		
		if((horas < 41) && (horas >= 0)){
			
			int salario = horas * 12;
			
			System.out.println("Su salario semanal es de "+ salario +"€");
			
		}else if(horas >= 41) {
			
			int horasExtra = horas - 40;
			int horasOrdinarias = horas - horasExtra;
			int salario = (horasOrdinarias * 12) + (horasExtra * 16);
			
			System.out.println("Su salario semanal es de "+ salario +"€");
			
		}else {
			
			System.out.println("Error, inténtelo de nuevo");
			
		}
		
	}
	
}