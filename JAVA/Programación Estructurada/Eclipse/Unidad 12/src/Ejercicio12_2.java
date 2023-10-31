
public class Ejercicio12_2 {

	public static void main(String[] args) {
		new Ejercicio12_2().contenido();
		//Modifica el programa anterior de tal forma que los números que se introducen en el array se generen
		//de forma aleatoria (valores entre 1 y 99).

	}

	public void contenido() {
		
		//Se crea el array.
		int[][] num = new int[4][5];
		//Se crean las variables de las diferentes sumas.
		int sumaFila = 0;
		int sumaColumna = 0;
		int sumaTotal = 0;
		
		//Se le dan valores aleatorios al array.
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				num[i][j] = (int)(Math.random()*99+1);
			}
		}
		
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
