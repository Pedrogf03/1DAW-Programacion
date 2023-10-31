package funciones;

public class ArraysBi {

	public static void main(String[] args) {
		/*Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de números
		  enteros que contenga las siguientes funciones:
		  
		  1. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo
		  (mínimo y máximo) se indica como parámetro.
		  2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
  		  3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
		  4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la
		  primera ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra
		  en el array, la función devuelve el array {-1, -1}.
		  5. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se
		  pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna
		  determinan el número que marcará las dos posibles diagonales dentro del array. La dirección es
		  un booleano. Si es true indica que se elige la diagonal que va del noroeste hacia el sureste,
		  mientras que si es false indica que se elige la diagonal que va del noreste hacia el suroeste.*/
	}
	
	public static int[][] generaArrayBiInt(int num[][], int min, int max){
		
		max += 1;
		for(int filas = 0; filas < num.length; filas++) {
			for(int columnas = 0; columnas < num[0].length; columnas++) {
				num[filas][columnas] = (int)(Math.random()*(max-min)+min);
			}
		}
		
		return num;
		
	}
	
	public static void filaArrayBiInt(int[][] num, int fila){
		
		fila -= 1;
		
		for(int columnas = 0; columnas < num[0].length; columnas++) {
			System.out.print(num[fila][columnas] +" ");
		}
		
	}
	
	public static void columnaArrayBiInt(int[][] num, int columna){
		
		columna -= 1;
		
		for(int filas = 0; filas < num.length; filas++) {
			System.out.print(num[filas][columna] +" ");
		}
		
	}
	
	public static int[] coordenadasArrayBiInt(int[][] array, int num) {
		
		boolean encontrado = false;
		int coordenadas[] = new int[2];
		
		for(int filas = 0; filas < array.length; filas++) {
			for(int columnas = 0; columnas < array[0].length; columnas++) {
				if((num == array[filas][columnas]) && (!encontrado)) {
					coordenadas[0] = filas+1;
					coordenadas[1] = columnas+1;
					encontrado = true;
				}
			}
		}
		
		if(!encontrado) {
			coordenadas[0] = -1;
			coordenadas[1] = -1;
		}
		
		return coordenadas;
		
	}
	
	public static void diagonalArrayBiInt(int[][] array, boolean direccion) {
		
		int max = 0;
		
		if(array.length < array[0].length) {
			max = array.length;
		} else if (array.length > array[0].length) {
			max = array[0].length;
		} else {
			max = array.length;
		}
		
		if(direccion) {
			for(int i = 0; i < max; i++) {
				System.out.print(array[i][i] +" ");
			}
		} else if (!direccion) {
			int j = array[0].length-1;
			for(int i = 0; i < max; i++) {
				System.out.print(array[i][j] +" ");
				j--;
			}
		}
		
	}

}
