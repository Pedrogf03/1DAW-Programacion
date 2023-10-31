import java.util.Scanner;
public class Ejercicio11_6 {

	public static void main(String[] args) {
		new Ejercicio11_6().contenido();
		/*Programa que rellena un array de 100 elementos con números enteros aleatorios
		comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa muestra el array y
		pregunta si el usuario quiere destacar el máximo o el mínimo. Seguidamente se vuelve a mostrar el
		array escribiendo el número destacado entre dobles asteriscos.*/

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		
		for(int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random()*501);
			System.out.println(num[i]);
			
		}
		
		System.out.println("¿Quiere destacar el máximo o el mínimo?");
		String respuesta = sc.next().toLowerCase();
		
		while ((!respuesta.equals("maximo")) && (!respuesta.equals("minimo"))) {	
			System.out.println("Elige máximo o mínimo:");
			respuesta = sc.next().toLowerCase();		
		}
		sc.close();
		
		int maximo = 0;
		int minimo = 0;
		
		for (int i = 0; i < 100; i++) {		
			if (i == 0) {					
				maximo = num[0];
				minimo = num[0];					
			} else if (num[i] < minimo) {					
				minimo = num[i];					
			} else if (num[i] > maximo) {					
				maximo = num[i];		
			}		
		}
			
		for(int i = 0; i < 100; i++) {	
			if (respuesta.equals("maximo")) {	
				if (num[i] == maximo) {	
					System.out.println("*"+ num[i] +"*");	
				} else {
					System.out.println(num[i]);
				}
			} else if (respuesta.equals("minimo")) {
				if (num[i] == minimo) {
					System.out.println("*"+ minimo +"*");
				} else {
					System.out.println(num[i]);
				}
			}	
		}
		
	}
	
}
