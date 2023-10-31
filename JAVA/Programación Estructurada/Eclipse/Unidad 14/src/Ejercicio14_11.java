import funciones.Arrays;
public class Ejercicio14_11 {

	public static void main(String[] args) {
		new Ejercicio14_11().contenido();
		/*Crea una biblioteca de funciones para arrays de una dimensión de números enteros
		  que contenga las siguientes funciones: */
	}

	public void contenido() {

		int num[] = new int[10];
		Arrays.generaArrayInt(num, 5, 15);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		System.out.println("Min: "+ Arrays.minimoArrayInt(num));
		System.out.println("Max: "+ Arrays.maximoArrayInt(num));
		System.out.println("Media: "+ Arrays.mediaArrayInt(num));
		System.out.println("Posición: "+ Arrays.posicionEnArrayInt(7, num));
		System.out.println(Arrays.estaEnArrayInt(6, num));
		System.out.println();
		Arrays.volteaArrayInt(num);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		Arrays.rotaDerechaArrayInt(num, 2);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		Arrays.rotaIzquierdaArrayInt(num, 2);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		
	}	
}
