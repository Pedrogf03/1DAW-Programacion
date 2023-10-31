import java.util.Scanner;
public class Ejercicio9_18 {

	public static void main(String[] args) {
		new Ejercicio9_18().contenido();
		//Programa que pinte la letra U por pantalla hecha con asteriscos.
	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int altura;
		System.out.println("Introduzca la altura:");
		altura = sc.nextInt();
		sc.close();
		int base = altura - 2;
		altura -= 1;
		for(int i = altura; i > 0; i--) {
			System.out.print("*");
			for(int j = base; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		for(int i = base; i > 0; i--) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
