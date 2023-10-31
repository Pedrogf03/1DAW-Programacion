import java.util.Scanner;
public class Ejercicio9_21 {
	public static void main(String[] args) {
		new Ejercicio9_21().contenido();
		//Programa que sea capaz de insertar un dígito dentro de un número indicando la posición.
	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		long num;
		long digito;
		long posicionUser;
		long posicion = 1;
		long volteado = 0;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		System.out.println("Introduzca un dígito:");
		digito = sc.nextInt();
		System.out.println("Introduzca la posición en la que quiere insertar el dígito anterior:");
		posicionUser = sc.nextInt();
		sc.close();
		while(num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
		}
		while(volteado > 0) {
			if(posicion == posicionUser) {
				num = (num * 10) + digito;
			}
			num = (num * 10) + (volteado % 10);
			volteado /= 10;
			posicion++;
		}
		System.out.println(num);
	}
}
