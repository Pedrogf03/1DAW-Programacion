import java.util.Scanner;
public class Ejercicio11_11 {

	public static void main(String[] args) {
		new Ejercicio11_11().contenido();
		/*Juego de la ruleta europea.
		  El jugador indica cuánto saldo tiene. A continuación cuánto quiere apostar y a qué (color o número).
		  Se gira una ruleta con 36 números, la mitad rojos y la mitad negros.
		  La bola cae en un hueco de dicha ruleta.
		  Si cae en el color al que ha apostado el jugador, se lleva el doble de lo apostado.
		  Si cae en el número al que ha apostado el jugador, se lleva lo apostado x 36.
		  Mientras tenga saldo, puede seguir jugando*/

	}

	public void contenido() {

		Scanner sc = new Scanner(System.in);

		//Se declaran los arrays y variables.
		
		//Arrays que representan los colores y los números contenidos en cada color.
		int[] rojos = {32, 19, 21, 25, 34, 27, 36, 30, 23, 5, 16, 1, 14, 9, 18, 7, 12, 3};
		int[] negros = {15, 4, 2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26};
		//Array que contiene los 10 últimos resultados.
		int[] anteriores = new int[10];
		//Número en que la bola cae (generado aleatoriamente).
		int bola;
		//Saldo total del jugador.
		int saldo;
		//Cantidad que el jugador apuesta.
		int apuesta;
		//Variable que contiene la respuesta de la apuesta (color o numero).
		String respuesta;
		//En caso de elegir color, contiene el color elegido.
		String color = "a";
		//En caso de elegir número, contiene dicho número.
		int num = -1;
		//Cuenta las veces que se ha tirado de la ruleta.
		int tiradas = -1;
		//Indica si el jugador quiere seguir jugando.
		boolean seguir;
		
		//Se pide al jugador que introduzca el saldo total.
		System.out.println("Introduzca su saldo:");
		saldo = sc.nextInt();

		do {
			
			//Se pide al jugador que indique la cantidad a apostar.
			System.out.println("¿Cuánto quiere apostar?");
			apuesta = sc.nextInt();
			
			//Mientras que la cantidad a apostar supere al saldo total, preguntará de nuevo.
			while(apuesta > saldo) {
				System.out.println("No puede apostar más dinero del que tiene.");
				apuesta = sc.nextInt();
			}
			
			//Se le resta la cantidad apostada al saldo total.
			saldo -= apuesta; 
			
			//Se muestra el saldo actualizado.
			System.out.println("Le quedan "+ saldo +"€.");
			
			//Se pregunta si el jugador desea apostar a color o a número.
			System.out.println("¿A qué quiere apostar? \n Color. \n Número.");
			respuesta = sc.next().toLowerCase();
			
			switch(respuesta) {
			
			//Si elige color, se le pregunta a cual y se almacena la respuesta.
			case "color":
				System.out.println("¿A qué color quiere apostar? \n Rojo \n Negro");
				color = sc.next().toLowerCase();
				break;	
			//Si elige número, se le pregunta a cual y se almacena la respuesta.
			case "numero":
				System.out.println("¿A qué número quiere apostar? \n Elija un número entre 0 y 36.");
				num = sc.nextInt();
				//Mientras que el número que ha elegido salga del rango, pregunta de nuevo.
				while ((num < 1) || (num > 36)) {
					System.out.println("Tiene que estar entre 0 y 36.");
					num = sc.nextInt();
				}
				break;
			}

			//Se genera el número en que cae la bola.
			bola = (int)(Math.random()*36+1);
			
			//Bucle for que recorre los 18 valores de cada array.
			for(int i = 0; i < 18; i++) {	
				//Si la bola cae en un número rojo.
				if(bola == rojos[i]) {		
					//Se indica el número y el color.
					System.out.println("La bola ha caído en el "+ bola +", es rojo.");	
					//Si hay menos de 9 tiradas, estas aumentan.
					//(Usado para indicar el final del bucle que muestra los 10 últimos en caso de que aún no se haya tirado 10 veces.)
					if(tiradas < 9) {
						tiradas++;
					}
					//Si el color elegido previamente fue rojo, se duplica su apuesta y se suma al saldo.
					if(color.equals("rojo")) {
						apuesta *= 2;
						saldo += apuesta;
						System.out.println("¡Ha acertado! Ahora su saldo es de "+ saldo +"€.");
					//Si el número elegido previamente coincide con el generado, su apuesta se multiplica por 36 y se suma al saldo.
					} else if (num == bola) {
						apuesta *= 36;
						saldo += apuesta;
						System.out.println("¡Ha acertado! Ahora su saldo es de "+ saldo +"€.");
					} else {
						System.out.println("Lo siento, ha perdido.");
					}
				//Si la bola cae en un número negro.
				} else if (bola == negros[i]) {	
					//Se indica el número y el color.
					System.out.println("La bola ha caído en el "+ bola +", es negro.");	
					//Si hay menos de 9 tiradas, estas aumentan.
					//(Usado para indicar el final del bucle que muestra los 10 últimos en caso de que aún no se haya tirado 10 veces.)
					if(tiradas < 9) {
						tiradas++;
					}
					//Si el color elegido previamente fue negro, se duplica su apuesta y se suma al saldo.
					if(color.equals("negro")) {
						apuesta *= 2;
						saldo += apuesta;
						System.out.println("¡Ha acertado! Ahora su saldo es de "+ saldo +"€.");
					//Si el número elegido previamente coincide con el generado, su apuesta se multiplica por 36 y se suma al saldo.
					} else if (num == bola) {
						apuesta *= 36;
						saldo += apuesta;
						System.out.println("¡Ha acertado! Ahora su saldo es de "+ saldo +"€.");
					} else {
						System.out.println("Lo siento, ha perdido.");
					}
				}
			}

			//Muestra de los 10 últimos resultados.
			System.out.println("Resultados anteriores:");		
			//Bucle que recorre el array que contiene los números anteriores, desde 0 hasta el número de tiradas hasta el momento.
			for(int i = 0; i <= tiradas; i++) {
				//Si hay menos de 9 tiradas, el número generado se guarda en un valor nuevo del array y se muestra.
				if(tiradas < 9) {
					anteriores[tiradas] = bola;
					System.out.print(anteriores[i] +" ");
				} else {
					//Si hay más de 9 tiradas, entonces se van moviendo los valores una ocurrencia del array hacia atrás y los muestra.
					if (i < 9) {
						anteriores[i] = anteriores[i+1];
						System.out.print(anteriores[i] +" ");
					//Hasta que llega a la última, que debe guardar el nuevo valor generado y mostrarlo.
					} else {
						anteriores[tiradas] = bola;
						System.out.print(anteriores[i] +" ");
					}
				}
			}
			System.out.println();

			//Si aún tiene saldo, pregunta si desea jugar de nuevo.
			if(saldo > 0) {
				System.out.println("Aún le quedan "+ saldo +"€. ¿Desea seguir jugando?");			
				if(sc.next().toLowerCase().equals("si")) {
					seguir = true;
				} else {
					seguir = false;
				}
			//Si se ha quedado sin saldo, acaba la partida.
			} else {
				System.out.println("Lo siento, se ha quedado sin saldo.");
				seguir = false;
			}
			
			//Se reinician algunas variables.
			color = "a";
			num = -1;

		//Si seguir es cierto, es decir, tiene saldo y ha respondido "si"; vuelve a girar la ruleta.
		} while (seguir == true);

		sc.close();

	}

}