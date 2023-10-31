import java.util.Scanner;
public class Ejercicio10_11 {

	public static void main(String[] args) {
		new Ejercicio10_11().contenido();
		//Juego del Craps.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int apuesta;
		int segundaTirada = 0;
		int dineroTotal;
		String volverJugar = "no";
		
		System.out.println("Al comenzar la partida, el jugador deberá introducir la cantidad a apostar.\n"
				+ "A continuación, se tirarán dos dados. Si la suma es 7 u 11, ha ganado y se\n"
				+ "lleva el doble de lo apostado. Sin embargo, si los dados suman 2, 3 o 12 pierde todo lo apostado.\n"
				+ "Si no se da ninguno de los casos anteriores, se volverán a tirar los dados\n"
				+ "hasta que salga lo mismo que en la primera tirada. A no ser que salga 7, \n"
				+ "en cuyo caso perderá la partida y con ello su apuesta.");
		sc.nextLine();
		
		System.out.println("¿Cuánto dinero tiene?");
		dineroTotal = sc.nextInt();
		
		do {
			
			System.out.println("¿Cuanto dinero quiere apostar?");
			apuesta = sc.nextInt();
			
			while (apuesta > dineroTotal){
				System.out.println("No puede apostar más de lo que tiene.");
				apuesta = sc.nextInt();
			}
			
			dineroTotal -= apuesta;
			System.out.println("Le quedan "+ dineroTotal +"€.");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("Se van a tirar dos dados.");
			sc.nextLine();
			int dado1 = (int)(Math.random()*6+1);
			System.out.println("En el primer dado ha salido "+ dado1 +".");
			sc.nextLine();
			int dado2 = (int)(Math.random()*6+1);
			System.out.println("En el segundo dado ha salido "+ dado2 +".");
			sc.nextLine();
			int primeraTirada = dado1 + dado2;
			System.out.println("Los dados suman "+ primeraTirada +" en total.");
			sc.nextLine();
			
			if ((primeraTirada == 7) || (primeraTirada == 11)) {
				System.out.println("¡Enhorabuena, ha ganado!");
				System.out.println("Su premio son "+ apuesta * 2 +"€.\n");
				dineroTotal += (apuesta * 2);
			} else if ((primeraTirada == 2) || (primeraTirada == 3) || (primeraTirada == 12)) {
				System.out.println("Lo siento, ha perdido.\n");
			} else {
				
				while ((segundaTirada != 7) && (segundaTirada != primeraTirada)) {
					
					System.out.println("Se van a volver a tirar los dados. Debe sacar un "+ primeraTirada +" para ganar.");
					sc.nextLine();
					dado1 = (int)(Math.random()*6+1);
					System.out.println("En el primer dado ha salido "+ dado1 +".");
					sc.nextLine();
					dado2 = (int)(Math.random()*6+1);
					System.out.println("En el segundo dado ha salido "+ dado2 +".");
					sc.nextLine();
					segundaTirada = dado1 + dado2;
					System.out.println("Los dados suman "+ segundaTirada +" en total.");
					sc.nextLine();
					
				}
				
				if (segundaTirada == 7) {
					System.out.println("Lo siento, ha perdido.\n");
				} else if (segundaTirada == primeraTirada) {
					System.out.println("¡Enhorabuena, ha ganado!");
					System.out.println("Su premio son "+ apuesta * 2 +"€.\n");
					dineroTotal += (apuesta * 2);
				}
			}
			
			if (dineroTotal == 0) {
				System.out.println("Se ha quedado sin dinero.");
			} else {
				System.out.println("Aún le quedan "+ dineroTotal +"€. ¿Quiere jugar de nuevo?\n Si \n No");
				volverJugar = sc.next().toLowerCase();
			}
			
			primeraTirada = 0;
			segundaTirada = 0;
			
		} while ((dineroTotal > 0) && ((volverJugar.equals("si")) || volverJugar.equals("s")));
		
		sc.close();
		
	}
	
}
