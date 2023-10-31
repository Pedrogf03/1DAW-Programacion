import java.util.Scanner;
public class Ejercicio14_5 {

	public static void main(String[] args) {
		new Ejercicio14_5().contenido();
		//Convierte en función el ejercicio 9.21

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int num = sc.nextInt();
		System.out.println("Introduzca un dígito:");
		int digito = sc.nextInt();
		System.out.println("Introduzca la posición en la que quiere insertar el dígito anterior:");
		int posicionUser = sc.nextInt();
		sc.close();
		
		System.out.println(insertarDigito(num, digito, posicionUser));
		
	}
	
	static public int insertarDigito(int num, int digito, int posicionUser) {
		
		int posicion = 1;
		int volteado = 0;
		
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
		
		return num;
		
	}
	
}
