import java.util.Scanner;
public class Ejercicio12_3 {

	public static void main(String[] args) {
		new Ejercicio12_3().contenido();
		//Modifica el programa anterior para que se realice sobree una tabla de M x N, siendo el usuario el que
		//introduzca los valores de M y N.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		//Se crean las variables de las diferentes sumas.
		int sumaFila = 0;
		int sumaColumna = 0;
		int sumaTotal = 0;
		//Se crean las variables que representas las filas y las columnas.
		int f;
		int c;
		
		System.out.println("Introduzca las filas:");
		f = sc.nextInt();
		
		System.out.println("Introduzca las columnas:");
		c = sc.nextInt();
		
		sc.close();
		
		//Se crea el array.
		int[][] num = new int[f][c];
		
		//Se le dan valores aleatorios al array.
		for(int i = 0; i < f; i++) {
			for(int j = 0; j < c; j++) {
				num[i][j] = (int)(Math.random()*99+1);
			}
		}
		
		//Se imprime por pantalla la tabla con los valores introducidos y la suma de cada fila.
		for(int fila = 0; fila < f; fila++) {
			System.out.print("|");
			for(int columna = 0; columna < c; columna++) {
				System.out.printf(" %4d |", num[fila][columna]);
				sumaFila += num[fila][columna];
			}
			
			System.out.printf(" \033[92m%4s\033[37m |", sumaFila);
			sumaFila = 0;
			System.out.println();
			System.out.print("|");
			for(int columna = 0; columna < c+1; columna++) {
				System.out.print("------|");
			}
			System.out.println();
		}
		
		//Se imprime por pantalla la suma de cada columna.
		System.out.print("|");
		for(int columna = 0; columna < c; columna++) {
			for(int fila = 0; fila < f; fila++) {
				sumaColumna += num[fila][columna];
			}
			System.out.printf(" \033[92m%-4s\033[37m |", sumaColumna);
			sumaColumna = 0;
		}
		
		//Se suman todos los valores y se imprimen por pantalla.
		for(int columna = 0; columna < c; columna++) {
			for(int fila = 0; fila < f; fila++) {
				sumaTotal += num[fila][columna];
			}
			
		}
		System.out.printf(" \033[92m%4s\033[37m |\n", sumaTotal);
		
	
		
	}
	
}
