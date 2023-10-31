
public class Ejercicio10_1 {

	public static void main(String[] args) {
		new Ejercicio10_1().contenido();
		//Programa que muestra la tirada de dos dados.

	}

	public void contenido() {
		
		int dado1;
		int dado2;
		int suma;
		
		dado1 = (int)(Math.random()*6+1);
		dado2 = (int)(Math.random()*6+1);
		suma = dado1 + dado2;
		
		System.out.println("Dado 1: "+ dado1);
		System.out.println("Dado 2: "+ dado2);
		System.out.println("Resultado: "+ suma);
		
	}
	
}
