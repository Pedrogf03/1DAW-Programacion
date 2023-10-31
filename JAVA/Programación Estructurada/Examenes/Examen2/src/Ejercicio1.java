
public class Ejercicio1 {

	public static void main(String[] args) {
		new Ejercicio1().contenido();
		/*Crea dos funciones, una llamada espejoHorizontal y otro llamada espejoVertical,
		que reciba un array doble y devuelva el array doble con los elementos vistos como en
		un espejo, en vertical u horizontal según corresponda. No se modificará el array
		original.*/

	}

	public void contenido() {

		int longitud = 4;

		int array[][] = new int[longitud][longitud];

		int i = 1;
		for(int filas = 0; filas < array.length; filas++) {
			System.out.println();
			for(int columnas = 0; columnas < array[0].length; columnas++) {
				if(i == 10) {
					i = 1;
				}
				array[filas][columnas] = i;
				i++;
				System.out.print(array[filas][columnas]);
			}
		}

		System.out.println();
		for(int espejoHorizontal[]: espejoHorizontal(array)) {
			System.out.println();
			for(int espejo: espejoHorizontal) {
				System.out.print(espejo);
			}
			
		}
		System.out.println();
		for(int espejoVertical[]: espejoVertical(array)) {
			System.out.println();
			for(int espejo: espejoVertical) {
				System.out.print(espejo);
			}
			
		}

	}

	public static int[][] espejoHorizontal(int[][] array) {

		int espejoHorizontal[][] = new int[array.length][array[0].length];
		
		int i = 0;
		int j = 0;
		for(int filas = 0; filas < array.length; filas++) {
			j = 0;
			for(int columnas = array[0].length-1; columnas >= 0 ; columnas--) {
				espejoHorizontal[i][j] = array[filas][columnas];
				j++;
			}
			i++;
		}
		
		return espejoHorizontal;
		
	}
	
	public static int[][] espejoVertical(int[][] array) {

		int espejoVertical[][] = new int[array.length][array[0].length];
		
		int i = 0;
		int j = 0;
		for(int filas = array.length-1; filas >= 0; filas--) {
			j = 0;
			for(int columnas = 0; columnas < array[0].length; columnas++) {
				espejoVertical[i][j] = array[filas][columnas];
				j++;
			}
			i++;
		}
		
		return espejoVertical;
		
	}

}

