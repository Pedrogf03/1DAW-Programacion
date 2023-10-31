
public class Ejercicio12_6 {

	public static void main(String[] args) {
		new Ejercicio12_6().contenido();
		/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
		posición en el sentido contrario al de las agujas del reloj. La matriz debe tener 6 filas por 6 columnas y
		debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original
		como la matriz resultado, ambas con los números convenientemente alineados.*/
		
		//https://lineadecodigo.com/java/rotar-matriz-a-la-izquierda/

	}

	public void contenido() {

		//Se crea el array de la matriz original
		int[][] matriz = new int[6][6];

		//Muestra la matriz original en una tabla de 6 filas por 6 columnas.
		System.out.println("Matriz original:");

		System.out.println("--------------------------------");
		for(int filas = 0; filas < 6; filas++) {
			System.out.print("| ");
			for(int columnas = 0; columnas < 6; columnas++) {

				matriz[filas][columnas] = (int)(Math.random()*101);
				System.out.printf("%3d |", matriz[filas][columnas]);
			}
			System.out.println();
			System.out.println("--------------------------------");
		}

		//Se crea una variable con el valor del tamaño del array.
		int size = matriz.length;
		//Se crea una nueva matriz con el mismo tamaño que la original.
		int[][] nuevaMatriz = new int[size][size];
		
		//Se rota la matriz 90º grados a la izquierda.
		for(int filas = 0; filas < size; filas++) {
			for(int columnas = 0; columnas < size; columnas++) {
				nuevaMatriz[size-1-columnas][filas] = matriz[filas][columnas];
			}
		}
		
		//Muestra la nueva matriz en una tabla de 6 filas por 6 filas.
		System.out.println("\nMatriz rotada:");
		
		System.out.println("--------------------------------");
		for(int filas = 0; filas < 6; filas++) {
			System.out.print("| ");
			for(int columnas = 0; columnas < 6; columnas++) {

				System.out.printf("%3d |", nuevaMatriz[filas][columnas]);
			}
			System.out.println();
			System.out.println("--------------------------------");
		}

	}
}
