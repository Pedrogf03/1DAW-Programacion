import java.util.Scanner;
public class Ejercicio10_8 {

	public static void main(String[] args) {
		new Ejercicio10_8().contenido();
		//Programa que pinta por pantalla una pecera con un pececito dentro.

	}
	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int ancho;
		int alto;
		System.out.println("Introduzca la altura de la pecera:");
		alto = sc.nextInt();
		while (alto < 4) {
			System.out.println("La altura debe ser como mínimo de 4.");
			alto = sc.nextInt();
		}
		System.out.println("Introduzca el ancho de la percera:");
		ancho = sc.nextInt();
		while (ancho < 4) {
			System.out.println("El ancho debe ser como mínimo de 4.");
			ancho = sc.nextInt();
		}
		sc.close();

		int vertical = (int)(Math.random()*(alto - 2)+1);
		int horizontal = (int)(Math.random()*(ancho - 2)+1);
		
		for(int i = 1; i <= ancho; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for(int i = 1; i <= alto - 2; i++) {
			System.out.print("*");
			for(int j = 1; j <= ancho - 2; j++) {
				if ((i == vertical) && (j == horizontal)) {
					System.out.print("&");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		for(int i = 1; i <= ancho; i++) {
			System.out.print("*");
		}

	}
}
