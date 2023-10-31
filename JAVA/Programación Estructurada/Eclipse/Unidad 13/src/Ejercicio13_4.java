import java.util.Scanner;
public class Ejercicio13_4 {

	public static void main(String[] args) {
		new Ejercicio13_4().contenido();
		//Programa que convierta a mayúsculas la primera palabra del texto introducido
		//el resto estará en minúsculas.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su mensaje:");
		String mensaje = sc.nextLine().toLowerCase();
		
		sc.close();
		
		String[] palabras = mensaje.split(" ");
		mensaje = "";
		
		for(int i = 0; i < palabras.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					mensaje += palabras[i].substring(0, 1).toUpperCase();
				} else {
					mensaje += palabras[i].substring(1);
					mensaje += " ";
				}
			}
		}
		
		System.out.println(mensaje);
		
	}
	
}
