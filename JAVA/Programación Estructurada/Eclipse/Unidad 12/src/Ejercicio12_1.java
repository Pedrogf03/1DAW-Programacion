import java.util.Scanner;
public class Ejercicio12_1 {

	public static void main(String[] args) {
		new Ejercicio12_1().contenido();
		/*Programa que pide 20 números enteros. Estos números se introducen en un array de
		4 filas por 5 columnas. Muestra las sumas parciales de filas y columnas igual que si de
		una hoja de cálculo se tratara. La suma total aparece en la esquina inferior derecha.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		//Se crea el array.
		int[][] num = new int[4][5];
		//Se crean las variables de las diferentes sumas.
		int sumaFila = 0;
		int sumaColumna = 0;
		int sumaTotal = 0;
		
		//Se pide al usuario que introduzca números hasta que acabe el bucle.
		System.out.println("Vaya introduciendo números hasta acabar:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		//Se imprime por pantalla la tabla con los valores introducidos y la suma de cada fila.
		System.out.println("|------------------------------------------------|");
		System.out.printf("| %-4s | \033[94m%-4s\033[37m | \033[94m%-4s\033[37m | \033[94m%-4s\033[37m | \033[94m%-4s\033[37m | \033[94m%-4s\033[37m | \033[92m%-4s\033[37m |\n", " ", "A", "B", "C", "D", "E", "SUMA");
		System.out.println("|------|------|------|------|------|------|------|");
		for(int fila = 0; fila < 4; fila++) {
			System.out.printf("| \033[94m%-4s\033[37m |", (fila + 1));
			for(int columna = 0; columna < 5; columna++) {
				System.out.printf(" %4d |", num[fila][columna]);
				sumaFila += num[fila][columna];
			}
			
			System.out.printf(" \033[92m%4s\033[37m |", sumaFila);
			sumaFila = 0;
			System.out.println();
			System.out.println("|------|------|------|------|------|------|------|");
		}
		
		//Se imprime por pantalla la suma de cada columna.
		System.out.printf("| \033[92m%-4s\033[37m |", "SUMA");
		for(int columna = 0; columna < 5; columna++) {
			for(int fila = 0; fila < 4; fila++) {
				sumaColumna += num[fila][columna];
			}
			System.out.printf(" \033[92m%-4s\033[37m |", sumaColumna);
			sumaColumna = 0;
		}
		
		//Se suman todos los valores y se imprimen por pantalla.
		for(int columna = 0; columna < 5; columna++) {
			for(int fila = 0; fila < 4; fila++) {
				sumaTotal += num[fila][columna];
			}
			
		}
		System.out.printf(" \033[92m%4s\033[37m |\n", sumaTotal);
		System.out.println("|------------------------------------------------|");
		
	}
	
}
