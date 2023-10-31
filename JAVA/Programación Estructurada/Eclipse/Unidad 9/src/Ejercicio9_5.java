import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		new Ejercicio9_5().contenido();
		//Programa de control de acceso a una caja fuerte

	}
	
	public void contenido() {
		
		int code = 1234;
		int codeUser;
		int intentos = 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca el código:");
		
			codeUser = sc.nextInt();
		
			while((codeUser != code) && (intentos < 4)) {
			
				System.out.println("Código erroneo, inténtelo otra vez:");
				codeUser = sc.nextInt();
			
				intentos++;
			
			}
		
			if(codeUser != code){
			
				System.out.println("Ha fallado 4 veces, la caja se ha cerrado");
			
			}else if(codeUser == code){
			
				System.out.println("Código correcto, la caja ha sido abierta");
			
			}
			
			System.out.println("¿Desea jugar de nuevo?");
			
		} while (sc.next().toLowerCase().equals("si"));
		
		sc.close();
		
	}

}