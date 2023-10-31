import java.util.Scanner;
public class Ejercicio11_4 {

	public static void main(String[] args) {
		new Ejercicio11_4().contenido();
		/*Programa que genera 100 números aleatorios del 0 al 20 y los muestra por pantalla
		separados por espacios. El programa pide entonces por teclado dos valores y a continuación
		cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
		Los números que se han cambiado deben aparecer entrecomillados.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		
		for(int i = 0; i < 100; i++) {
			
			num[i] = (int)(Math.random()*21);
			
		}
		
		System.out.println("Se han generado 100 números aleatorios entre 0 y 20\n"
				+ "A continuación, introduzca el número que desea cambiar:");
		int ocurrencia = sc.nextInt();
		System.out.println("¿Por qué número quiere cambiar todos los "+ ocurrencia +"?");
		int cambio = sc.nextInt();
		sc.close();
		
		System.out.println("Se mostrarán todos los números generados, cambiando los "+ ocurrencia +" por "+ cambio +".");
		
		for(int i = 0; i < 100; i++) {
			
			if (num[i] == ocurrencia) {
				
				System.out.println("\""+ cambio +"\"");
				
			} else {
				
				System.out.println(num[i]);
				
			}
			
		}
		
	}
	
}
