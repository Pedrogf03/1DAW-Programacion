import java.util.Scanner;
public class Ejercicio13_3 {

	public static void main(String[] args) {
		new Ejercicio13_3().contenido();
		//Programa que cuenta las vocales y las consonantes del texto introducido por teclado.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su mensaje:");
		String mensaje = sc.nextLine().toLowerCase();
		
		sc.close();
		
		String digito = "";
		int vocales = 0;
		int consonantes = 0;
		
		for(int i = 0; i < mensaje.length(); i++) {
			
			digito = mensaje.substring(i,i+1);
			
			switch(digito) {
			case "a":
				vocales++;
				break;
			case "e":
				vocales++;
				break;
			case "i":
				vocales++;
				break;
			case "o":
				vocales++;
				break;
			case "u":
				vocales++;
				break;
			case " ":
				break;
			default:
				consonantes++;
				break;
			}
			
		}
		
		System.out.println("Su mensaje contiene:\n"+ vocales +" vocales.\n"+ consonantes +" consonantes.");
		
	}
	
}
