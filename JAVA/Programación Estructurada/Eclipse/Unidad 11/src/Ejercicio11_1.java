
public class Ejercicio11_1 {

	public static void main(String[] args) {
		new Ejercicio11_1().contenido();
		//Tres arrays de 20 números enteros, con el número, su cuadrado y su cubo.

	}

	public void contenido() {
		
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i = 0; i < 20; i++) {
			
			numero[i] = (int)(Math.random()*101);
			cuadrado[i] = (int)Math.pow(numero[i], 2);
			cubo[i] = (int)Math.pow(numero[i], 3);
		
			System.out.printf("%3d %5d %7d\n", numero[i], cuadrado[i], cubo[i]);
			
		}
		
	}
	
}
