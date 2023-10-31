package funciones;

public class Arrays {

	public static void main(String[] args) {
		/*Crea una biblioteca de funciones para arrays de una dimensión de números enteros
		  que contenga las siguientes funciones: */

		/*1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo
		  se indique como parámetro.
		  2. minimoArrayInt: Devuelve el valor mínimo del array que se pasa como parámetro.
		  3. maximoArrayInt: Devuelve el valor máximo del array que se pasa como párametro.
		  4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
		  5. estaEnArrayInt: Dice si un número está o no dentro de un array.
		  6. posicionEnArray: Busca un número en un array y devuelve la posicion en la que se encuentra.
		  7. volteaArrayInt: Le da la vueta a un array.
		  8. rotaDerechaArrayInt: Rota n posiciones a la derecha los numeros de un array.
		  9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los numeros de un array.*/
	}

	public static int[] generaArrayInt(int num[], int min, int max) {

		max += 1;
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*(max-min)+min);
		}

		return num;

	}

	public static int minimoArrayInt(int num[]) {

		int minimo = 0;	
		for(int i = 0; i < num.length; i++) {
			if (i == 0) {
				minimo = num[0];				
			} else if (num[i] < minimo) {				
				minimo = num[i];
			}
		}

		return minimo;

	}

	public static int maximoArrayInt(int num[]) {

		int maximo = 0;	
		for(int i = 0; i < num.length; i++) {
			if (i == 0) {
				maximo = num[0];				
			} else if (num[i] > maximo) {				
				maximo = num[i];
			}
		}

		return maximo;

	}

	public static int mediaArrayInt(int num[]) {

		int suma = 0;
		int numeros = 0;

		for(int i = 0; i < num.length; i++) {
			suma += num[i];
			numeros++;
		}

		return suma / numeros;

	}

	public static boolean estaEnArrayInt(int num, int array[]) {

		boolean esta = false;

		for(int i = 0; i < array.length; i++) {
			if(num == array[i]) {
				esta = true;
			}
		}

		return esta;

	}

	public static int posicionEnArrayInt(int num, int array[]) {

		int i = -1;
		if(estaEnArrayInt(num, array)) {
			i += 1;
			while((i < array.length) && (num != array[i])) {
				i++;
			}
		}
		return i;

	}

	public static int[] volteaArrayInt(int num[]) {

		int numAux[] = new int[num.length];

		for(int i = 0; i < num.length; i++) {
			numAux[i] = num[i];
		}
		int j = num.length-1;
		for(int i = 0; i < num.length; i++) {
			num[i] = numAux[j];
			j--;
		}

		return num;

	}

	public static int[] rotaDerechaArrayInt(int num[], int posiciones) {

		while(posiciones > 0) {
			int ultimo = num[num.length-1];
			for(int i = num.length-1; i >= 0; i--) {			
				if (i == 0) {			
					num[i] = ultimo;		
				} else {	
					num[i] = num[i-1];		
				}		
			}
			posiciones--;
		}
		
		return num;

	}
	
	public static int[] rotaIzquierdaArrayInt(int num[], int posiciones) {
		
		return volteaArrayInt(rotaDerechaArrayInt(volteaArrayInt(num), posiciones));
		
	}

}
