import funciones.Mates;
public class Ejercicio14_8 {

	public static void main(String[] args) {
		new Ejercicio14_8().contenido();
		/* Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que
		   puedes usar unas dentro de otras si es necesario. */
	}
	
	public void contenido() {
		System.out.println(Mates.esCapicua(12321));
		System.out.println(Mates.esPrimo(11));
		System.out.println(Mates.siguientePrimo(25));
		System.out.println(Mates.potencia(5, 2));
		System.out.println(Mates.digitos(1234567));
		System.out.println(Mates.voltea(1234));
		System.out.println(Mates.digitoN(1234, 3));
		System.out.println(Mates.posicionDigito(12343, 3));
		System.out.println(Mates.quitaDetras(123456, 2));
		System.out.println(Mates.quitaDelante(123456, 2));
		System.out.println(Mates.pegaDetras(12345, 6));
		System.out.println(Mates.pegaDelante(23456, 1));
		System.out.println(Mates.trozoNum(2, 5, 123456));
		System.out.println(Mates.juntaNum(123, 4567));		
	}

}
