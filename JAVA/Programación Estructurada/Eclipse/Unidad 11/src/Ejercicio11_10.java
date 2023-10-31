import java.util.Scanner;
public class Ejercicio11_10 {

	public static void main(String[] args) {
		new Ejercicio11_10().contenido();
		/*La pantalla de una ruleta muestra los últimos números que han salido. Mejora el programa anterior
		para que al pulsar enter genere un número de ruleta y lo añada a la pantalla de las diez últimas
		tiradas. Si no hay más diez tiras se mostrarán los números que han salido hasta entonces.*/

	}

	public void contenido() {

		Scanner sc = new Scanner(System.in);

		int[] rojos = {32, 19, 21, 25, 34, 27, 36, 30, 23, 5, 16, 1, 14, 9, 18, 7, 12, 3};
		int[] negros = {15, 4, 2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26};
		int[] anteriores = new int[10];
		int bola;
		int tiradas = -1;
		boolean continuar = true;

		do {

			bola = (int)(Math.random()*37);

			for(int i = 0; i < 18; i++) {		
				if(bola == rojos[i]) {				
					System.out.println("La bola ha caído en el "+ bola +", es rojo.");	
					if(tiradas < 9) {
						tiradas++;
					}
				} else if (bola == negros[i]) {				
					System.out.println("La bola ha caído en el "+ bola +", es negro.");
					if(tiradas < 9) {
						tiradas++;
					}
				}
			}
			if (bola == 0) {			
				System.out.println("La bola ha caído en el "+ bola +", es verde.");
				if(tiradas < 9) {
					tiradas++;
				}
			}

			System.out.println("Resultados anteriores:");
			
			for(int i = 0; i <= tiradas; i++) {
				if(tiradas < 9) {
					anteriores[tiradas] = bola;
					System.out.print(anteriores[i] +" ");
				} else {
					if (i < 9) {
						anteriores[i] = anteriores[i+1];
						System.out.print(anteriores[i] +" ");
					} else {
						anteriores[tiradas] = bola;
						System.out.print(anteriores[i] +" ");
					}
				}
			}

			sc.nextLine();

		} while (continuar == true);

		sc.close();

	}

}