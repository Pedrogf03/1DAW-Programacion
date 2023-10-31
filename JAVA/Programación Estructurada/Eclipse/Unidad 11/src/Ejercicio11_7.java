
public class Ejercicio11_7 {

	public static void main(String[] args) {
		new Ejercicio11_7().contenido();
		/*Programa que reparta cuatro cartas de la
		baraja francesa a cada uno de los dos jugadores y después un flop.*/
	}

	public void contenido() {

		int[] carta = new int[11];
		int[] palo = new int[11];

		//Bucle para dar valores a los arrays.
		for(int i = 0; i < 11; i++) {

			//Se generan números aleatorios para identificar la carta y el palo.
			carta[i] = (int)(Math.random()*13+1);
			palo[i] = (int)(Math.random()*4+1);

			//If para que esta parte se ejecute a partir de la segunda iteración.
			if(i > 0) {	
				//Bucle para comprobar y evitar que se repitan combinaciones.
				for(int j = 0; j < i; j++) {	
					//Mientras se repita la combinación generada con una anterior, se genera una nueva y se vuelve a comparar desde el inicio.
					while((palo[i] == palo[j]) && (carta[i] == carta[j])) {
						carta[i] = (int)(Math.random()*13+1);
						palo[i] = (int)(Math.random()*4+1);
						j = 0;
					}					
				}				
			}

			if(i == 0) {
				System.out.println("Cartas del jugador 1:");
			} else if (i == 4) {
				System.out.println("Cartas del jugador 2:");
			} else if (i == 8) {
				System.out.println("Flop:");
			}

			//Se elige qué carta representa ese número.
			switch(carta[i]) {
			case 1:
				System.out.print("AS");
				break;
			case 11:
				System.out.print("J");
				break;
			case 12:
				System.out.print("Q");
				break;
			case 13:
				System.out.print("K");
				break;
			default:
				System.out.print(carta[i]);
				break;			
			}

			//Se elige qué palo representa ese número.
			switch(palo[i]) {	
			case 1:
				System.out.println("\u2665");				
				break;			
			case 2:				
				System.out.println("\u2660 ");				
				break;			
			case 3:				
				System.out.println("\u2666 ");				
				break;			
			case 4:				
				System.out.println("\u2618");			
				break;
			}	

		}

	}

}
