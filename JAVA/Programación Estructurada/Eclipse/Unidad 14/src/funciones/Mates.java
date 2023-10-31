package funciones;

public class Mates {

		/* Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que
		   puedes usar unas dentro de otras si es necesario. */

		/* 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
		   en caso contrario.
		   2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en
		   caso contrario.
		   3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
		   4. potencia: Dada una base y un exponente devuelve la potencia.
		   5. digitos: Cuenta el número de dígitos de un número entero.
		   6. voltea: Le da la vuelta a un número.
		   7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando
		   por el 0 y de izquierda a derecha.
		   8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número
		   entero. Si no se encuentra, devuelve -1.
		   9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
		   10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
		   11. pegaPorDetras: Añade un dígito a un número por detrás.
		   12. pegaPorDelante: Añade un dígito a un número por delante.
		   13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
		   dentro de un número y devuelve el trozo correspondiente.
		   14. juntaNumeros: Pega dos números para formar uno. */	

	public static int voltea(int num) {

		int volteado = 0;

		while(num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
		}

		return volteado;

	}

	public static int digitos(int num) {

		int digitos = 0;

		while(num > 0) {
			num /= 10;
			digitos++;
		}

		return digitos;

	}

	public static int potencia(int base, int exponente) {

		int potencia = (int)Math.pow(base, exponente);

		return potencia;

	}

	public static boolean esCapicua(int num) {

		boolean capicua = false;

		if(voltea(num) == num) {
			capicua = true;
		}

		return capicua;

	}

	public static boolean esPrimo(int num) {

		boolean primo = false;	
		if(num != 1) {
			int contador = 0;

			for(int i = 1; i <= num; i++) {	
				if(num % i == 0) {
					contador++;
				}
			}
			if(contador <= 2) {
				primo = true;
			}
		}
		
		return primo;

	}
	
	public static int siguientePrimo(int num) {
		
		int i = num+1;
		while(!esPrimo(i)) {
			i++;
		}
		
		return i;
		
	}
	
	public static int digitoN(int num, int posicionUser) {
		
		int volteado = 0;
		int posicion = 0;
		int digito = 0;
		
		num = voltea(num);
		
		while(num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
			posicion++;
			if(posicion == posicionUser) {				
				digito = volteado % 10;				
			}
		}
		
		return digito;
		
	}
	
	public static int posicionDigito(int num, int digito) {
		
		int posicion;
		int i = 0;
		while((digitoN(num, i) != digito) && (i <= digitos(num))) {
			i++;
		}
		if(digitos(num) < i) {
			posicion = -1;
		} else {
			posicion = i;
		}
		
		return posicion;
		
	}
	
	public static int quitaDetras(int num, int cantidad) {
		
		for(int i = 1; i <= cantidad; i++) {
			num /= 10;
		}
		
		return num;
		
	}
	
	public static int quitaDelante(int num, int cantidad) {
		
		return voltea(quitaDetras(voltea(num), cantidad));
		
	}
	
	public static int pegaDetras(int num, int pega) {
		
		return (num * 10) + pega;
		
	}
	
	public static int pegaDelante(int num, int pega) {
		
		return voltea(pegaDetras(voltea(num), pega));
		
	}
	
	public static int trozoNum(int inicio, int fin, int num) {
		
		int nuevoNum = 0;
		
		for(int i = inicio; i <= fin; i++) {
			nuevoNum = (nuevoNum * 10) + digitoN(num,i);
		}
		
		return nuevoNum;
		
	}
	
	public static int juntaNum(int num1, int num2) {
		
		int digitos = digitos(num2);
		
		for(int i = 0; i < digitos; i++) {
			num1 = num1 * 10;
		}
		
		return num1 + num2;
		
	}

}
