import java.util.Scanner;
public class Ejercicio9_13 {

	public static void main(String[] args) {
		new Ejercicio9_13().contenido();
		//Programa que pinta una pirámide por pantalla.

	}

	public void contenido() {	
		Scanner sc = new Scanner(System.in);
		int altura;
		//Altura de la pirámide.
		String caracter;
		//Caracter con el cual se hace la pirámide.
		int base = 1;
		//Valor de la base de la pirámide. Esta variable se usa para indicar el fin de la pirámide en bucle while, aumentandose en 1 hasta llegar a superar a la altura y parar el bucle.
		int linea = 1;
		//La linea es el número de caracteres que se imprimen en cada linea de la pirámide. ES igual a uno porque la punta de la pirámide es de un solo caracter, y va aumentando en dos cada vez que se ejecuta el while.
		System.out.println("Introduzca la altura de la pirámide:");
		altura = sc.nextInt();
		int espacio = altura - 1;
		//El espacio son los huecos en blanco a la izquierda de la pirámide, siempre es uno menos a la altura.
		System.out.println("Introduzca el caracter con el que quiere hacer la pirámide:");
		caracter = sc.next();
		sc.close();
		while (base <= altura) {
			//Mientras que la base sea menor o igual a la altura, que siga haciendo la pirámide.
			for(int i = 1; i <= espacio; i++) {
				System.out.print(" ");
				//Para i igual a 1, siempre que i sea menor o igual que el espacio, que i aumente en 1 e imprima por pantalla espacios.
			}
			for(int i = 1; i <= linea; i++) {
				System.out.print(caracter);
				//Para i igual a 1, siempre que i sea menor o igual que la linea, que i aumente en 1 e imprima por pantalla el caracter.
			}
		System.out.println();
		base++;
		espacio--;
		linea += 2;
		//Al acabar los bucles for, que aumente la base en 1, la linea en 2, y el espacio se reduzca en 1.
		}
	}
}