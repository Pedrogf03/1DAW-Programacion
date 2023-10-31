import java.util. Scanner;
public class Ejercicio9_19 {
	
	public static void main(String[] args){
		new Ejercicio9_19().contenido();
		//Programa que dibuja una X hecha de asteriscos.
	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int altura;
		System.out.println("Introduzca la altura:");
		altura = sc.nextInt();
		while(altura < 3) {
			System.out.println("La altura debe ser mayor que 3:");
			altura = sc.nextInt();
		}
		sc.close();
		int espacio = altura;
		for(int fila = 1; fila <= altura; fila++) {
			for(int columna = 1; columna <= altura; columna++) {
				if((columna == fila) || (columna == espacio)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			espacio--;
		}
	}
}
