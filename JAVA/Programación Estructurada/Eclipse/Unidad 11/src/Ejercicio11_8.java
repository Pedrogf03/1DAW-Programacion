
public class Ejercicio11_8 {

	public static void main(String[] args) {
		new Ejercicio11_8().contenido();
		//Programa que baraja la baraja francesa.

	}

	public void contenido() {

		int[] cartas = new int[13];
		int[] palos = new int[4];

		for(int i = 0; i < 4; i++) {
			palos[i] = (i+1);
			for(int j = 0; j < 13; j++) {
				cartas[j] = (j+1);

				switch(cartas[j]) {
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
					System.out.print(cartas[j]);
					break;			
				}

				switch(palos[i]) {	
				case 1:
					System.out.print("\u2665 ");				
					break;			
				case 2:				
					System.out.print("\u2660 ");				
					break;			
				case 3:				
					System.out.print("\u2666 ");				
					break;			
				case 4:				
					System.out.print("\u2618 ");			
					break;
				}

			}
		}

		System.out.println("\nA continuación, se va a barajar el mazo.");

		int[] carta = new int[52];
		int[] palo = new int[52];
		
		for(int i = 0; i < 52; i++) {
			
			carta[i] = (int)(Math.random()*13+1);
			palo[i] = (int)(Math.random()*4+1);
			
			if(i > 0) {
				
				for(int j = 0; j < i; j++) {
					
					while((palo[i] == palo[j]) && (carta[i] == carta[j])) {
						carta[i] = (int)(Math.random()*13+1);
						palo[i] = (int)(Math.random()*4+1);
						j = 0;
					}
					
				}
				
			}
			
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

			switch(palo[i]) {	
			case 1:
				System.out.print("\u2665 ");				
				break;			
			case 2:				
				System.out.print("\u2660 ");				
				break;			
			case 3:				
				System.out.print("\u2666 ");				
				break;			
			case 4:				
				System.out.print("\u2618 ");			
				break;
			}
		
		}

	}

}
