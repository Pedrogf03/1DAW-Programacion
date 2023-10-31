
public class Ejercicio7_4 {

	public static void main(String[] args) {
		//Programa que genera 20 números aleatorios entre 0 y 100 y calcula el cuadrado y el cubo de cada uno.
		new Ejercicio7_4().contenido();

	}

	public void contenido() {
		
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random()*101);
			cuadrado[i] = (int)Math.pow(numero[i], 2);
			cubo[i] = (int)Math.pow(numero[i], 3);
			System.out.printf("Número = %3d, Cuadrado = %5d, Cubo = %7d \n", numero[i], cuadrado[i], cubo[i]);
		}
		
	}
	
}
