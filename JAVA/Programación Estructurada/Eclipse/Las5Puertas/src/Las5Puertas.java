
public class Las5Puertas {

	// Número de filas y columnas
	public static final int N = 10;
	/*
	 * Las celdas tendrán "X" para jugador 1, "O" para jugador 2
	 * y comenzarán con un valor de "".
	 */
	
	public static String[][] tablero = new String[N][N];
	//Si está a false juega el jugador2, a true es el turno del jugador1
	public static boolean jugador1 = true; 

	
	
	/**
	 * Crea un nuevo tablero.
	 * 
	 */
	
	static public void nuevoTablero() {

		for(int fila = 0; fila < N; fila++) {
			for(int columna = 0; columna < N; columna++) {
				tablero[fila][columna] = "";
			}
		}
		
	}

	/**
	 * 
	 * El jugador actual juega. Si elige una casilla ya utilizada no se produce ninguna acción 
	 * 
	 * @param fila
	 * @param columna
	 */
	
	static public void juega(int fila, int columna) {
		
		if(tablero[fila][columna] == "") {
			if(jugador1) {
				tablero[fila][columna] = "X";
				jugador1 = false;
			} else if (!jugador1) {
				tablero[fila][columna] = "O";
				jugador1 = true;
			}
		}	
		
	}
	
	/** 
	 * Comprueba si hay 5 X en línea
	 * 
	 * @param tablero
	 * @return
	 */
	static boolean haGanadoJugador1() {
		
		boolean victoria = false;

		for(int filas = 0; filas < N-5; filas++) {
			for(int columnas = 0; columnas < N; columnas++) {
				if(tablero[filas][columnas].equals("X") && tablero[filas+1][columnas].equals("X") && tablero[filas+2][columnas].equals("X") && tablero[filas+3][columnas].equals("X") && tablero[filas+4][columnas].equals("X")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N; filas++) {
			for(int columnas = 0; columnas < N-5; columnas++) {
				if(tablero[filas][columnas].equals("X") && tablero[filas][columnas+1].equals("X") && tablero[filas][columnas+2].equals("X") && tablero[filas][columnas+3].equals("X") && tablero[filas][columnas+4].equals("X")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N-4; filas++) {
			for(int columnas = 0; columnas < N-4; columnas++) {
				if(tablero[filas][columnas].equals("X") && tablero[filas+1][columnas+1].equals("X") && tablero[filas+2][columnas+2].equals("X") && tablero[filas+3][columnas+3].equals("X") && tablero[filas+4][columnas+4].equals("X")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N-4; filas++) {
			for(int columnas = 4; columnas < N; columnas++) {
				if(tablero[filas][columnas].equals("X") && tablero[filas+1][columnas-1].equals("X") && tablero[filas+2][columnas-2].equals("X") && tablero[filas+3][columnas-3].equals("X") && tablero[filas+4][columnas-4].equals("X")) {
					victoria = true;
				}
			}
		}
		
		return victoria;
	
	}
	/** 
	 * Comprueba si hay 5 O en línea
	 * 
	 * @param tablero
	 * @return
	 */
	static boolean haGanadoJugador2() {
		
		boolean victoria = false;
		
		for(int filas = 0; filas < N-5; filas++) {
			for(int columnas = 0; columnas < N; columnas++) {
				if(tablero[filas][columnas].equals("O") && tablero[filas+1][columnas].equals("O") && tablero[filas+2][columnas].equals("O") && tablero[filas+3][columnas].equals("O") && tablero[filas+4][columnas].equals("O")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N; filas++) {
			for(int columnas = 0; columnas < N-5; columnas++) {
				if(tablero[filas][columnas].equals("O") && tablero[filas][columnas+1].equals("O") && tablero[filas][columnas+2].equals("O") && tablero[filas][columnas+3].equals("O") && tablero[filas][columnas+4].equals("O")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N-4; filas++) {
			for(int columnas = 0; columnas < N-4; columnas++) {
				if(tablero[filas][columnas].equals("O") && tablero[filas+1][columnas+1].equals("O") && tablero[filas+2][columnas+2].equals("O") && tablero[filas+3][columnas+3].equals("O") && tablero[filas+4][columnas+4].equals("O")) {
					victoria = true;
				}
			}
		}
		
		for(int filas = 0; filas < N-4; filas++) {
			for(int columnas = 4; columnas < N; columnas++) {
				if(tablero[filas][columnas].equals("O") && tablero[filas+1][columnas-1].equals("O") && tablero[filas+2][columnas-2].equals("O") && tablero[filas+3][columnas-3].equals("O") && tablero[filas+4][columnas-4].equals("O")) {
					victoria = true;
				}
			}
		}
		
		return victoria;
		
	}
	/** 
	 * Si todas las celdas tienen un valor y nadie ha hecho
	 *  5 en raya entonces se establece el empate
	 * @param tablero
	 * @return
	 */
	static public boolean hanEmpatado() {
		
		boolean empate = false;
		
		if(!haGanadoJugador1() && !haGanadoJugador2()) {
			empate = true;
		}
		
		for(int filas = 0; filas < N; filas++) {
			for(int columnas = 0; columnas < N; columnas++ ) {
				if(tablero[filas][columnas].equals("")) {
					empate = false;
				}
			}
		}
		
		return empate;
		
	}
}
