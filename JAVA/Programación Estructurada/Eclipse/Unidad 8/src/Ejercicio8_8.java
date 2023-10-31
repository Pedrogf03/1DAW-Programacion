import java.util.Scanner;

public class Ejercicio8_8 {

	public static void main(String[] args) {
		new Ejercicio8_8().contenido();
		//Programa que hace presupuestos de tartas

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		String respuesta1;
		String respuesta2;
		String respuesta3;
		float sabor = 0f;
		float nata = 0f;
		float nombre = 0f;
		
		System.out.println("¿De qué sabor quiere la tarta? \n Sabores disponibles: \n Manzana \n Fresa \n Chocolate");
		respuesta1 = sc.next().toLowerCase();
		
		switch (respuesta1) {
		
		case "manzana":
			
			sabor = 18f;
			
		break;
			
		case "fresa":
			
			sabor = 16f;
			
		break;
		
		case "chocolate":
			
			String chocolate;
			
			System.out.println("¿Quiere chocolate negro o blanco?");
			chocolate = sc.next().toLowerCase();
			
			switch (chocolate) {
			
			case "negro":
				
				sabor = 14f;
				
			break;
			
			case "blanco":
				
				sabor = 15f;
				
			break;
			
			default:
				
				System.out.println("Error, inténtelo de nuevo");
				
				System.exit(0);
				
			break;
			
			}
		
		default: 
			
			System.out.println("Error, inténtelo de nuevo");
			
			System.exit(0);
			
		break;
		
		}

		System.out.println("¿Quiere añadir nata a su tarta?");
		respuesta2 = sc.next().toLowerCase();
		
		switch (respuesta2) {
		
		case "si":
			
			nata = 2.50f;
			
		break;
		
		case "no":
			
			nata = 0.0f;
			
		break;
		
		default: 
			
			System.out.println("Error, inténtelo de nuevo");
			
			System.exit(0);
			
		break;
		
		}
		
		System.out.println("¿Quiere personalizar su tarta?");
		respuesta3 = sc.next().toLowerCase();
		
		switch (respuesta3) {
		
		case "si":
			
			nombre = 2.75f;
			
		break;
		
		case "no":
			
			nombre = 0.0f;
			
		break;
		
		default: 
			
			System.out.println("Error, inténtelo de nuevo");
			
			System.exit(0);
			
		break;
		
		}
	
		sc.close();
		
		float presupuesto = sabor + nata + nombre;
		
		System.out.println("Su tarta costará "+ presupuesto +"€");
	}
	
}