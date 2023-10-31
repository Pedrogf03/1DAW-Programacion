import java.util.Scanner;
public class Ejercicio10_10 {

	public static void main(String[] args) {
		new Ejercicio10_10().contenido();
		//Juego de piedra, papel, tijeras.

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		String eleccionPrograma = "a";
		String eleccion;
		
		System.out.println("Elige:");
		eleccion = sc.next().toLowerCase();
		sc.close();
		
		if ((eleccion.equals("piedra")) || (eleccion.equals("tijeras")) || (eleccion.equals("papel"))) {
			int num = (int)(Math.random()*3+1);
			switch(num){
			
			case 1:
				eleccionPrograma = "piedra";
			break;
			
			case 2:
				eleccionPrograma = "papel";
			break;
			
			case 3:
				eleccionPrograma = "tijeras";
			break;
			
			}
			
			System.out.println("Piedra, papel, tijeras. 1, 2 y 3...");
			if((eleccion.equals("piedra") && eleccionPrograma.equals("tijeras")) || (eleccion.equals("papel") && eleccionPrograma.equals("piedra")) || (eleccion.equals("tijeras") && eleccionPrograma.equals("papel"))) {
				System.out.println("¡Has ganado!");
			} else if((eleccion.equals("piedra") && eleccionPrograma.equals("piedra")) || eleccion.equals("papel") && eleccionPrograma.equals("papel") || (eleccion.equals("tijeras") && eleccionPrograma.equals("tijeras"))) {
				System.out.println("¡Empate!");
			} else if((eleccion.equals("piedra") && eleccionPrograma.equals("papel")) || eleccion.equals("papel") && eleccionPrograma.equals("tijeras") || (eleccion.equals("tijeras") && eleccionPrograma.equals("piedra"))) {
				System.out.println("Has perdido.");
			}
			
		} else {
			System.out.println("Ha introducido parámetros inválidos.");
		}
		
	}
	
}
