import java.util.Scanner;
public class Ejercicio10_9 {

	public static void main(String[] args) {
		new Ejercicio10_9().contenido();
		//Programa que, dado un número introducido por teclado, elige al azar uno de sus dígitos.

	}
	
	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int volteado = 0;
		int digitos = 0;
		int posicion = 1;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		sc.close();
		
		while(num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
			digitos++;
		}
		
		int numero = (int)(Math.random()*digitos+1);
		
	    while (volteado > 0) {
	        if ((volteado % 10) == numero) {
	          System.out.println("El número "+ numero +" aparece en la posición "+ posicion +".");
	        }
	        volteado /= 10;
	        posicion++;
	    }
	}

}
