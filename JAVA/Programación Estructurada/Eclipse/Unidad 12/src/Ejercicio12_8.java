import java.util.Scanner;
public class Ejercicio12_8 {

	public static void main(String[] args) {
		new Ejercicio12_8().contenido();
		//Programa que encripta mensajes y los desencripte usando cifrado de Vigenère

	}

	public void contenido() {

		String[][] letra = new String[26][26];
		String primero = "";
		String nuevoPrimero = "A";

		for(int filas = 0; filas < 26; filas++) {
			primero = nuevoPrimero;
			for(int columnas = 0; columnas < 26; columnas++) {				
				if((filas == 0)) {
					letra[filas][columnas] = String.valueOf((char)(65 + columnas));
				} else {
					if(columnas < 25) {
						letra[filas][columnas] = letra[filas-1][columnas+1];
					} else if (columnas == 25){
						letra[filas][columnas] = primero;
					}
					if(columnas == 0) {
						nuevoPrimero = letra[filas][columnas];
					}
				}

			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("¿Quiere encriptar o desencriptar un mensaje?\n 1 - Encriptar\n 2 - Desencriptar");
			int respuesta = sc.nextInt();
			
			if(respuesta == 1) {
				
				System.out.println("Introduzca su mensaje:");
				sc.nextLine();
				String mensaje = sc.nextLine().toUpperCase();
				
				System.out.println("Introduzca la clave:");
				String clave = sc.nextLine().toUpperCase();
				
				String[] claves = clave.split(" ");
				String claveProcesada = "";
				
				for(int i = 0; i < claves.length; i++) {
					claveProcesada += claves[i];
				}
				
				int start = 0;
				int end = 1;
				
				for(int i = claveProcesada.length(); i < mensaje.length();i++) {
					claveProcesada += claveProcesada.substring(start, end);
					start++;
					end++;
				}

				String digitoMen;
				String digitoClav;
				String encriptado = "";
				
				for(int i = 0; i < mensaje.length(); i++) {
					digitoMen = mensaje.substring(i,i+1);
					digitoClav = claveProcesada.substring(i,i+1);
					
					if(digitoMen.equals(" ")) {
						encriptado += " ";
					} else {
						for(int filas = 0; filas < 26; filas++) {
							for(int columnas = 0; columnas < 26; columnas++) {
								
								if((letra[0][columnas].equals(digitoMen)) && (letra[filas][0].equals(digitoClav))) {
									encriptado += letra[filas][columnas];						
								}
								
							}
						}
					}
					
				}
				
				System.out.println("Su mensaje ha sido encriptado:");
				System.out.println(encriptado);
				
				digitoMen = "";
				digitoClav = "";
				encriptado = "";
				start = 0;
				end = 1;
				
				
			} else if (respuesta == 2) {
				
				System.out.println("Introduzca su mensaje encriptado:");
				sc.nextLine();
				String mensaje = sc.nextLine().toUpperCase();
				
				System.out.println("Introduzca la clave:");
				String clave = sc.nextLine().toUpperCase();
				
				String[] claves = clave.split(" ");
				String claveProcesada = "";
				
				for(int i = 0; i < claves.length; i++) {
					claveProcesada += claves[i];
				}
				
				int start = 0;
				int end = 1;
				
				for(int i = claveProcesada.length(); i < mensaje.length();i++) {
					claveProcesada += claveProcesada.substring(start, end);
					start++;
					end++;
				}
				
				String digitoMen;
				String digitoClav;
				String desencriptado = "";
				
				for(int i = 0; i < mensaje.length(); i++) {
					digitoMen = mensaje.substring(i,i+1);
					digitoClav = claveProcesada.substring(i,i+1);
					
					if(digitoMen.equals(" ")) {
						desencriptado += " ";
					} else {
						for(int filas = 0; filas < 26; filas++) {
							for(int columnas = 0; columnas < 26; columnas++) {
								
								if((letra[filas][columnas].equals(digitoMen)) && (letra[filas][0].equals(digitoClav))) {
									desencriptado += letra[0][columnas];						
								}
								
							}
						}
					}
					
				}
				
				System.out.println("Se ha desencriptado el mensaje:");
				System.out.println(desencriptado);
				
				digitoMen = "";
				digitoClav = "";
				desencriptado = "";
				start = 0;
				end = 1;
				
			}
			
			System.out.println("¿Desea hacer algo más?");
			
		} while (sc.next().toLowerCase().equals("si"));
		
		sc.close();
		
	}

}
