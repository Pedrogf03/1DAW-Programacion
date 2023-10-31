import java.util.Scanner;
public class ComparaArraysBi {

	public static void main(String[] args) {
		//Programa de prueba para evitar repeticiones en un array bidimensional.
		Scanner sc = new Scanner (System.in);
		
		//Se piden las filas y las columnas al usuario.
		System.out.println("Introduzca las filas:");
		int filasTotal = sc.nextInt();
		System.out.println("Introduzca las columnas:");
		int columnasTotal = sc.nextInt();
		sc.close();
			
		//Se crea un array de una dimension que almacene los valores.
		int[] num = new int[filasTotal*columnasTotal];
		
		//Se recorre el array generando los valores y evitando los repetidos.
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*6+1);
			for(int j = 0; j < i; j++) {
				while(num[i] == num[j]) {
					num[i] = (int)(Math.random()*num.length+1);
					j = 0;
				}
			}
		}

		//Se crea el array bidimensional que va a contener los valores finalmente.
		int[][] numBi = new int [filasTotal][columnasTotal];
		//Variable para recorrer el array de una dimensión dentro del array bidimensional.
		int i = 0;
		//Se recorre el array bidimensional y se le asignan los valores del array de una dimensión
		//y se muestra por pantalla.
		for(int fila = 0; fila < filasTotal; fila++) {
			System.out.print("|");
			for(int columna = 0; columna < columnasTotal; columna++) {
				numBi[fila][columna] = num[i];
				System.out.printf(" %2d |", numBi[fila][columna]);
				i++;
			}
			System.out.println();
		}
		
	}
}