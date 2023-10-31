import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		new Ejercicio3().contenido();
		//Programa que pinte la letra T por pantalla hecha con asteriscos.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int altura;
		System.out.println("Introduzca la altura:");
		altura = sc.nextInt();
		while ((altura < 3) || (altura % 2 == 0)) {
			System.out.println("La altura debe ser mayor que 3 e impar");
			altura = sc.nextInt();
		}
		sc.close();
		int base = altura / 2;
		for(int i = altura; i > 0; i--){
			System.out.print("*");
		}
		System.out.println("");
		altura -= 1;
		for(int i = altura; i > 0; i--) {
			for(int j = base; j > 0; j--) {
				System.out.print(" ");
			}
				System.out.println("*");
		}
	}
}