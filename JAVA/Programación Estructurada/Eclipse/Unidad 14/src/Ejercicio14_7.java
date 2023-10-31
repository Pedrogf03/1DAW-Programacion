import java.util.Scanner;
public class Ejercicio14_7 {

	public static void main(String[] args) {
		new Ejercicio14_7().contenido();
		/*Realiza una función que pinte la letra L por pantalla hecha con asteriscos.
		  A la función se le pasará la altura como parámetro. El palo horizontal de la L
		  tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la altura de la L:");
		int altura = sc.nextInt();
		
		sc.close();
		
		pintarL(altura);
		
	}
	
	
	static public void pintarL(int altura) {
		
		for (int i = 1; i < altura; i++) {
			System.out.println("*");
		}
		for (int i = 0; i < (altura/2)+1; i++) {
			System.out.print("*");
		}
		
	}
}
