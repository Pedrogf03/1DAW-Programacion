
public class Ejercicio10_3 {

	public static void main(String[] args) {
		new Ejercicio10_3().contenido();
		//Programa que muestra 20 números enteros aleatorios entre 0 y 30 (ambos incluidos) separados por espacios.

	}
	
	public void contenido() {
		
		for(int i = 1; i <= 20; i++ ) {
			
			int num = (int)(Math.random()*31);
			System.out.print(num + " ");
			
		}
		
	}

}
