import java.util.Scanner;
public class Ejercicio14_6 {

	public static void main(String[] args) {
		new Ejercicio14_6().contenido();
		//Crea una función que genere un número entero aleatorio entre un mínimo y máximo

	}

	public void contenido() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el máximo:");
		int max = sc.nextInt();
		System.out.println("Introduzca el mínimo:");
		int min = sc.nextInt();

		sc.close();


		System.out.println(aleatorio(max, min));

	}

	static public int aleatorio(int max, int min) {

		int aleatorio = (int)(Math.random()*(max-min)+min);
		return aleatorio;

	}

}
