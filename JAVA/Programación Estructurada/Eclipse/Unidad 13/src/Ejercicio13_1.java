import java.util.Scanner;
public class Ejercicio13_1 {

	public static void main(String[] args) {
		new Ejercicio13_1().contenido();
		//Programa que invierte el texto que se le introduce por teclado.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un mensaje:");
		String mensaje = sc.nextLine();
		
		sc.close();
		
		String invertido = "";
		for(int i = mensaje.length()-1; i >= 0; i--) {			
			invertido += mensaje.charAt(i);			
		}
		
		System.out.println(invertido);
		
	}
	
}
