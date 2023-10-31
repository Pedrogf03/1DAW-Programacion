import java.util.Scanner;
public class Ejercicio14_4 {

	public static void main(String[] args) {
		new Ejercicio14_4().contenido();
		//Convierte en función el ejercicio 9.20

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un número:");
			int numUser = sc.nextInt();

			System.out.print(numUser);
			if (!capicua(numUser)) {
				System.out.print(" no");
			}
			System.out.println(" es capicúa.");
			
			System.out.println("¿Quiere comprobar otro número?");
		}while(sc.next().toLowerCase().equals("si"));
		sc.close();
		
	}
	
	public static boolean capicua(int numUser) {
		
		boolean capicua = false;
		int num = numUser;
		int volteado = 0;
		while (num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
		}
		
		if(volteado == numUser) {
			capicua = true;
		}
		
		return capicua;
		
	}
	
}
