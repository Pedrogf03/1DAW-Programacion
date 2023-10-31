
public class Ejercicio7_2 {

	public static void main(String[] args) {
		new Ejercicio7_2().contenido();
		//Array  de 10 caracteres.

	}

	public void contenido() {
		
		char[] simbolo = new char[10];
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
		
		for (char n : simbolo) {
			System.out.println(n);
		}
		
	}
	
}
