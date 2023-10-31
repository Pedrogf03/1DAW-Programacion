
public class Ejercicio11_5 {

	public static void main(String[] args) {
		new Ejercicio11_5().contenido();
		/*Programa que genera 20 números enteros aleatorios entre 0 y 100 y los almacena en
		un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
		array (del 0 en adelante) y todos los números impares a las celdas restantes.*/

	}

	public void contenido() {
	
		int[] num = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i < 20; i++) {
			num[i] = (int)(Math.random()*101);
			//Separa los números metiendo los pares en un array y los impares en otro.
			if(num[i] % 2 == 0) {
				par[pares] = num[i];
				pares++;
			} else {
				impar[impares] = num[i];
				impares++;
			}
		}
		
		//Muestra el array original.
		System.out.println("Desordenados:");
		for(int i = 0; i < 20; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		
		//Mete los pares en las primeras posiciones del array original.
		for(int i = 0; i < pares; i++) {
			num[i] = par[i];
		}
		
		//Mete los impares en los huecos libres.
		for(int i = pares; i < 20; i++) {
			num[i] = impar[i - pares];
		}
		
		//Muestra el resultado.
		System.out.println("Ordenados");
		for(int i = 0; i < 20; i++) {
			System.out.print(num[i] +" ");
		}
	}
}
