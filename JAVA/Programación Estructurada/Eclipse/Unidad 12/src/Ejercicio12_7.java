import java.util.Scanner;
public class Ejercicio12_7 {

	public static void main(String[] args) {
		new Ejercicio12_7().contenido();
		//Programa que calcula la letra del DNI.

	}

	public void contenido() {
		
		String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca los números de su DNI:");
		int digitos = sc.nextInt();
		sc.close();
		
		System.out.println("La letra de su DNI es: "+ letra[digitos % 23]);
		
	}
	
}
