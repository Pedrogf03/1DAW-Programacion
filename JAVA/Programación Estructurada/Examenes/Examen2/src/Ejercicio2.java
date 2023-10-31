import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		new Ejercicio2().contenido();
		/*Crea una función que dado un String devuelva un array de Strings con las palabras
		en minúsculas salvo la primera y la última en Mayúsculas:*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase:");
		String frase = sc.nextLine();	
		sc.close();
		
		for(String palabra: mayus(frase)) {
			System.out.println(palabra);
		}
		
	}
	
	public static String[] mayus(String frase) {
		
		frase = frase.toLowerCase().trim();
		String palabras[] = frase.split(" ");
		String palabra = "";
		int longitud;
		for(int i = 0; i < palabras.length; i++) {
			longitud = palabras[i].length()-1;
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					palabra += palabras[i].substring(0, 1).toUpperCase();
				} else if (j == 1){
					palabra += palabras[i].substring(1, longitud);
				} else if (j == 2) {
					palabra += palabras[i].substring(longitud).toUpperCase();
				}
			}
			palabras[i] = palabra;
			palabra = "";
		}
		
		return palabras;
		
	}
	
}
