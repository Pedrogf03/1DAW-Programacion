import java.util.Scanner;
public class Ejercicio13_6 {

	public static void main(String[] args) {
		new Ejercicio13_6().contenido();
		//Programa que identifique si una cadena es un DNI, un NIE o ninguno de los anteriores. 

	}

	public void contenido() {

		Scanner sc = new Scanner (System.in);

		System.out.println("Introduzca su código de identificación:");
		String id = sc.nextLine();
		
		sc.close();

		boolean NIE = true;
		boolean DNI = true;
		
		for(int i = 0; i < 9; i++) {
			
			if((id.substring(0,1).toUpperCase().equals("X")) || (id.substring(0,1).toUpperCase().equals("Y")) || (id.substring(0,1).toUpperCase().equals("Z"))){
				DNI = false;
				if (i > 0 && i < 8) {
					if(!Character.isDigit(id.charAt(i))) {
						NIE = false;
					}
				} else if (i == 8) {
					if(Character.isDigit(id.charAt(8))) {
						NIE = false;
					}
				}
			} else if (Character.isDigit(id.charAt(0))) {
				NIE = false;
				if (i > 0 && i < 8) {
					if(!Character.isDigit(id.charAt(i))) {
						DNI = false;
					}
				} else if (i == 8) {
					if(Character.isDigit(id.charAt(8))) {
						DNI = false;
					}
				}
			} else {
				NIE = false;
				DNI = false;
			}
			
		}
		
		if(NIE && !DNI) {
			System.out.println("Su identificación es un NIE.");
		} else if (DNI && !NIE) {
			System.out.println("Su identificación es un DNI.");
		} else if (!DNI && !NIE) {
			System.out.println("Su identificación no es DNI ni NIE.");
		}

	}

}
