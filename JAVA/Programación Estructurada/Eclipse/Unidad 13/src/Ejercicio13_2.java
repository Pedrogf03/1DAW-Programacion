import java.util.Scanner;
public class Ejercicio13_2 {

	public static void main(String[] args) {
		new Ejercicio13_2().contenido();
		//Programa que elimina los espacios del texto que introduce el usuario.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduca un mensaje:");
		String mensaje = sc .nextLine();
		
		sc.close();
		
		String[] palabras = mensaje.split(" ");
		
		mensaje = "";
		
		for(int i = 0; i < palabras.length; i++) {
			mensaje += palabras[i];
		}
		
		System.out.println(mensaje);
		
	}
	
}
