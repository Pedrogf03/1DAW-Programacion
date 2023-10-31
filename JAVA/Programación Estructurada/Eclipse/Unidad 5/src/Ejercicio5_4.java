
public class Ejercicio5_4 {

	public static void main(String[] args) {
		new Ejercicio5_4().contenido();
		//Programa que concatena en un String, 5 variables de tipo char

	}
	public void contenido() {
		
		char letra1 = 'P';
		char letra2 = 'e';
		char letra3 = 'd';
		char letra4 = 'r';
		char letra5 = 'o';
		//Declarar las 5 variables de tipo char y asignarles un valor
		
		String pedro = "" + letra1 + letra2 + letra3 + letra4 + letra5;
		//Declarar la variable String como concatenacíon de las 5 variables char
		
		System.out.println(pedro);
		
	}
}