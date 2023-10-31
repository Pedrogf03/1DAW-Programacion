import java.util.Scanner;
public class Ejercicio12_9 {

	public static void main(String[] args) {
		new Ejercicio12_9().contenido();
		/*Se cargan datos a una matriz de enteros de MxN con número aleatorios entre -99 y 99, siendo M y N
		introducidos por el usuario, se pide mostrar:
		a. Los datos cargados en la matriz.
		b. Promedio general.
		c. Porcentaje de positivos.
		d. Suma de los números pares ingresados en la matriz.
		*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner (System.in);
			
		int filasTotal = 0;
		int columnasTotal = 0;
		
		do {
			
			System.out.println("Introduzca las filas de la matriz:");
			filasTotal = sc.nextInt();
			System.out.println("Introduzca las columnas de la matriz:");
			columnasTotal = sc.nextInt();
			
			if(filasTotal < 1 && columnasTotal < 1) {
				System.out.println("Los valores deben ser mayores que 0.");
			}
			
		} while (filasTotal < 1 && columnasTotal < 1);
		
		sc.close();
		
		int[][] matriz = new int[filasTotal][columnasTotal];
		int media = 0;
		int positivos = 0;
		int sumaPares = 0;
		
		for(int fila = 0; fila < filasTotal; fila++) {
			
			if (fila == 0) {
				System.out.print("|");
				for(int columna = 0; columna < columnasTotal; columna++) {
					System.out.print("-----|");
				}
				System.out.println();
			}
			System.out.print("|");
			for(int columna = 0; columna < columnasTotal; columna++) {
				matriz[fila][columna] = (int)(Math.random()*198-99);
				media += matriz[fila][columna];
				if(matriz[fila][columna] > 0) {
					positivos++;
				}
				if(matriz[fila][columna] % 2 == 0) {
					sumaPares += matriz[fila][columna];
				}
				System.out.printf(" %3d |", matriz[fila][columna]);
			}
			System.out.println();
			System.out.print("|");
			for(int columna = 0; columna < columnasTotal; columna++) {
				System.out.print("-----|");
			}
			System.out.println();
		}
		
		System.out.println();
		
		media = media / (filasTotal * columnasTotal);
		System.out.println("El promedio de los valores de la matriz es "+ media +".");
		
		positivos = (positivos * 100) / (filasTotal * columnasTotal);
		System.out.println("El "+ positivos +"% son positivos.");
		
		System.out.println("Los pares suman "+ sumaPares +".");
	}	
}
