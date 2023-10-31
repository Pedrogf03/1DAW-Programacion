
public class Ejercicio6_10 {

	public static void main(String[] args) {
		new Ejercicio6_10().contenido();
		//Programa que pinta por pantalla diez líneas formadas por caracteres.
		//El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @.
		//Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

	}

	public void contenido() {
		
		int numCaracter;
		String caracter = "error";
		int longitud;
		
		for (int i = 1; i <= 10; i++) {
			
			numCaracter = (int)(Math.random()*6+1);
			
			switch (numCaracter) {
			
			case 1:
				
				caracter = "*";
				break;
				
			case 2:
				
				caracter = "-";
				break;
				
			case 3:
				
				caracter = "=";
				break;
				
			case 4:
				
				caracter = ".";
				break;
				
			case 5:
				
				caracter = "|";
				break;
				
			case 6:
				
				caracter = "@";
				break;
			
			}
			
			longitud = (int)(Math.random()*40+1);
			
			for (int j = 1; j <= longitud; j++) {
				
				System.out.print(caracter);
				
			}

			System.out.println("");
			
		}
		
	}
	
}
