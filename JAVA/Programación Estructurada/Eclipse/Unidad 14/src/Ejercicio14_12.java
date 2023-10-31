import funciones.ArraysBi;
public class Ejercicio14_12 {

	public static void main(String[] args) {
		new Ejercicio14_12().contenido();
		/*Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de números
		  enteros que contenga las siguientes funciones:*/
	}

	public void contenido() {
		
		int num[][] = new int[6][7];
		
		ArraysBi.generaArrayBiInt(num, 5, 15);
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[0].length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}	
			System.out.println();
		}
		System.out.println();
		ArraysBi.filaArrayBiInt(num, 2);
		System.out.println();
		ArraysBi.columnaArrayBiInt(num, 2);
		System.out.println();
		for(int i = 0; i < ArraysBi.coordenadasArrayBiInt(num, 7).length; i++) {
			System.out.print(ArraysBi.coordenadasArrayBiInt(num, 7)[i] +" ");
		}
		System.out.println();
		ArraysBi.diagonalArrayBiInt(num, true);
		System.out.println();
		ArraysBi.diagonalArrayBiInt(num, false);
		
	}	
}
