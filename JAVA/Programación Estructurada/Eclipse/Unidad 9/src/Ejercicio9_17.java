import java.util.Scanner;
public class Ejercicio9_17 {

	public static void main(String[] args) {
		new Ejercicio9_17().contenido();
		//Programa que pinte la letra L por pantalla hecha con asteriscos.

	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int altura;
		System.out.println("Introduzca la altura:");
		altura = sc.nextInt();
		sc.close();
		int base = altura / 2;
		altura -= 1;
		for(int i = altura; i > 0; i--){
			System.out.println("*");
		}
		for(int i = base; i > 0; i--) {
			System.out.print("* ");
		}
	}
}
