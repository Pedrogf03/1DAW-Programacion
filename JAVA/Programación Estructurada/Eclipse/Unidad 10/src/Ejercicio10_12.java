
public class Ejercicio10_12 {

	public static void main(String[] args) {
		new Ejercicio10_12().contenido();
		//Programa que muestra tres cartas de la baraja francesa sin que se repitan.

	}

	public void contenido() {
		
		int carta = 0;
		int palo = 0;
		int carta1 = 0;
		int palo1 = 0;
		int carta2 = 0;
		int palo2 = 0;
		
		System.out.println("Se van a mostrar tres cartas distintas de la baraja francesa.");
		
		for(int i = 1; i <= 3; i++) {
			
			if (i == 1) {
				
				carta = (int)(Math.random()*12+1);
				palo = (int)(Math.random()*4+1);
				
				carta1 = carta;
				palo1 = palo;
				
			} else if (i == 2) {
				
				carta = (int)(Math.random()*12+1);
				palo = (int)(Math.random()*4+1);
				
				while ((carta == carta1) && (palo == palo1)) {
					
					carta = (int)(Math.random()*12+1);
					palo = (int)(Math.random()*4+1);
					
				}
				
				carta2 = carta;
				palo2 = palo;
				
			} else if (i == 3) {
				
				carta = (int)(Math.random()*12+1);
				palo = (int)(Math.random()*4+1);
				
				while (((carta == carta1) || (carta == carta2)) && ((palo == palo1) || (palo == palo2))) {
					
					carta = (int)(Math.random()*12+1);
					palo = (int)(Math.random()*4+1);
					
				}
				
			}
			
			switch(carta) {
			
				case 1:
				
					System.out.print("AS");
				
					break;
			
				case 10:
				
					System.out.print("J");
				
					break;
			
				case 11:
			
					System.out.print("Q");
				
					break;
			
				case 12:
				
					System.out.print("K");
				
					break;
			
				default:
				
					System.out.print(carta);
				
					break;
			
			}
			
			switch(palo) {
			
				case 1:
				
					System.out.println("\u2665");
				
					break;
					
				case 2:
				
					System.out.println("\u2660 ");
				
					break;
			
				case 3:
				
					System.out.println("\u2666");
				
					break;
			
				case 4:
				
					System.out.println("\u2618");
				
					break;
			
			}
			
		}
		
	}
	
}
