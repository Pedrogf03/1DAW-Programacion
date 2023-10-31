import java.util.Scanner;
public class Ejercicio9_15 {

	public static void main(String[] args) {
		new Ejercicio9_15().contenido();
		//Programa que pide primero un número y a continuación un dígito. El programa da la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int num;
		int digito;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		System.out.println("Introduzca un dígito del número anterior:");
		digito = sc.nextInt();
		sc.close();
		int volteado = 0;
	    int posicion = 1;
	    while (num > 0) {
	        volteado = (volteado * 10) + (num % 10);
	        num /= 10;
	    }
	    while (volteado > 0) {
	        if ((volteado % 10) == digito) {
	          System.out.println("El número "+ digito +" aparece en la "+ posicion +" posición");
	        }
	        volteado /= 10;
	        posicion++;
	    }
        System.out.println("El número tiene "+ (posicion - 1) +" dígitos");
	}
}
