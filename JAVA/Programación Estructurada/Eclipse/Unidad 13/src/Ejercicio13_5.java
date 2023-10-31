import java.util.Scanner;
public class Ejercicio13_5 {

	public static void main(String[] args) {
		new Ejercicio13_5().contenido();
		//Programa que elimina las tildes de un mensaje introducido por teclado.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su mensaje:");
		String mensaje = sc.nextLine();
		String mensajeFinal = "";
		
		sc.close();
		
		String digito;
		
		for(int i = 0; i < mensaje.length(); i++) {
			digito = mensaje.substring(i, i+1);
			switch(digito) {
			case "á":
				digito = "a";
				break;
			case "é":
				digito = "e";
				break;
			case "í":
				digito = "i";
				break;
			case "ó":
				digito = "o";
				break;
			case "ú":
				digito = "u";
				break;
			default:
				break;
			}
			
			mensajeFinal += digito;
			
		}
		
		System.out.println(mensajeFinal);
		
	}
	
}
