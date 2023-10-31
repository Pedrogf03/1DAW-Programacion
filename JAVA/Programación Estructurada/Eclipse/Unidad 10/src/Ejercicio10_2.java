
public class Ejercicio10_2 {

	public static void main(String[] args) {
		new Ejercicio10_2().contenido();
		//Programa que muestre al azar el nombre de una carta de la baraja francesa.

	}
	
	public void contenido() {
		
		int palo = (int)(Math.random()*4);
		int num = (int)(Math.random()*13+1);
		
		switch(num) {
		
		case 1:
			
			System.out.print("Ha escogido el AS");
			
		break;
		
		case 11:
			
			System.out.print("Ha escogido la J");
			
		break;
		
		case 12:
			
			System.out.print("Ha escogido la Q");
			
		break;
		
		case 13:
			
			System.out.print("Ha escogido la K");
			
		break;
		
		default:
			
			System.out.print("Ha escogido el "+ num);
			
		break;

		}
		
		switch(palo) {
		
		case 0:
			
			System.out.println("\u2665");
			
		break;
		
		case 1:
			
			System.out.println("\u2660 ");
			
		break;
		
		case 2:
			
			System.out.println("\u2666 ");
			
		break;
		
		case 3:
			
			System.out.println("\u2618");
			
		break;
		
		}
		
	}

}
