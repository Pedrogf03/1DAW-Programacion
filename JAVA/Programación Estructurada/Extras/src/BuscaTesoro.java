import java.util.Scanner;

public class BuscaTesoro {
	
	//Se definen constantes para representar el contenido de las celdas.
	static final int VACIO = 0;
	static final int MINA = 1;
	static final int TESORO = 2;
	static final int INTENTO = 3;
	
	public static void main(String[] args) {
		new BuscaTesoro().contenido();
		//Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
		//cuatro filas por cinco columnas. El usuario intentará averiguar dónde
		//está el tesoro.
		
	}
	
	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		//Se define el array de 5 filas y 4 columnas.
		int x;
		int y;
		int[][] cuadrante = new int [5][4];
		
		//Se inicializa el array.
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 3; y++) {
			cuadrante[x][y] = VACIO;
			}
		}
		
		//Se coloca la mina.
		int minaX = (int)(Math.random()*4);
		int minaY = (int)(Math.random()*3);
		cuadrante[minaX][minaY] = MINA;
		
		//Se coloca el tesoro.
		int tesoroX;
		int tesoroY;
		
		do {
			
			tesoroX = (int)(Math.random()*4);
			tesoroY = (int)(Math.random()*3);
			
		} while ((minaX == tesoroX) && (minaY == tesoroY));
		cuadrante[tesoroX][tesoroY] = TESORO;
		
		//Empieza el juego.
		System.out.println("¡BUSCA EL TESORO!");
		boolean salir = false;
		String c = "";
		do {
			//Pinta el cuadrante.
			for (y = 3; y >= 0; y--) {
				System.out.print(y + "|");
				for (x = 0; x < 5; x++) {
					if (cuadrante [x][y] == INTENTO) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
				System.out.println("  -----\n  01234\n");
				
				//Se piden las coordenadas.
				System.out.print("Coordenada x: ");
				x = sc.nextInt();
				System.out.print("Coordenada y: ");
				y = sc.nextInt();
				
				//Se mira lo que hay en las coordenadas indicadas por el usuario.
				switch(cuadrante[x][y]) {
				case VACIO:
					cuadrante[x][y] = INTENTO;
					break;
				case MINA:
					System.out.println("Lo siento, has perdido.");
					salir = true;
					break;
				case TESORO:
					System.out.println("Enhorabuena, has encontrado el tesoro.");
					salir = true;
					break;
				default:
				}
				
		} while (!salir);
		
		//Pinta el cuadrante.
		for(y = 3; y >= 0; y--) {
			System.out.print(y + "|");
			for(x = 0; x < 5; x++) {
				switch(cuadrante[x][y]) {
				case VACIO:
					c = " ";
					break;
				case MINA:
					c = "*";
					break;
				case TESORO:
					c = "€";
					break;
				case INTENTO:
					c = "x";
					break;
				default:
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("  -----\n  01234\n");
	}
}