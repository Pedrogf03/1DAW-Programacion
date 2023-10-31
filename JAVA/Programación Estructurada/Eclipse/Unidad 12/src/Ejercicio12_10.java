
public class Ejercicio12_10 {

	public static void main(String[] args) {
		new Ejercicio12_10().contenido();
		//Array bidimensional que contiene la tabla de multiplicar del 1 al 9 (10 filas y 10 columnas),
		//donde la fila y columna 0 contienen los números a multiplicar.

	}

	public void contenido() {
		
		int[][] tabla = new int[10][10];
		
		System.out.println("|----|----|----|----|----|----|----|----|----|----|");
		for(int fila = 0; fila < 10; fila++) {
			System.out.print("|");
			for(int columna = 0; columna < 10; columna++) {
				if(fila == 0 && columna == 0) {
					System.out.printf(" %2s |", " ");
				}else if(fila == 0) {
					tabla[fila][columna] = columna;
					System.out.printf(" \033[92m%2d\033[37m |", tabla[fila][columna]);
				} else if (columna == 0) {
					tabla[fila][columna] = fila;
					System.out.printf(" \033[92m%2d\033[37m |", tabla[fila][columna]);
				} else {
					tabla[fila][columna] = (tabla[fila][0] * tabla[0][columna]);
					System.out.printf(" %2d |", tabla[fila][columna]);
				}
			}
			System.out.println();
			System.out.println("|----|----|----|----|----|----|----|----|----|----|");
		}
		
	}
}
