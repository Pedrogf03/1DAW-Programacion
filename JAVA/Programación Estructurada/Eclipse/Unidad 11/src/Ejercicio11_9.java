
public class Ejercicio11_9 {

	public static void main(String[] args) {
		new Ejercicio11_9().contenido();
		/*Programa que genera un número de la
		ruleta europea y dice si es rojo o negro.*/

	}

	public void contenido() {
		
		int[] rojos = {32, 19, 21, 25, 34, 27, 36, 30, 23, 5, 16, 1, 14, 9, 18, 7, 12, 3};
		int[] negros = {15, 4, 2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26};
		int bola = (int)(Math.random()*37);	
					
		for(int i = 0; i < 18; i++) {		
			if(bola == rojos[i]) {				
				System.out.println("La bola ha caído en el "+ bola +", es rojo.");
				System.exit(0);			
			} else if (bola == negros[i]) {				
				System.out.println("La bola ha caído en el "+ bola +", es negro.");
				System.exit(0);
			} 			
		}
		
		if (bola == 0) {			
			System.out.println("La bola ha caído en el "+ bola +", es verde.");			
		}
		
	}
	
}
