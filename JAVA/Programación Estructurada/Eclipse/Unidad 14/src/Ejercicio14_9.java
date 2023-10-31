import funciones.Mates;
public class Ejercicio14_9 {

	public static void main(String[] args) {
		new Ejercicio14_9().contenido();
		//Muestra los números primos entre 1 y 1000

	}
	
	public void contenido() {
		
		int contador = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(Mates.esPrimo(i)) {
				contador++;
			}			
		}
		
		System.out.println("Entre 1 y 1000 hay "+ contador +" números primos.");
		
	}
}
