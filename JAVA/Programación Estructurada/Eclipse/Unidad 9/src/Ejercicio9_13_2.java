import java.util.Scanner;
public class Ejercicio9_13_2 {

	public static void main(String[] args) {
		new Ejercicio9_13_2().contenido();
		//Programa que lee un número n e imprime una pirámide de números con n filas
	}
	public void contenido() {
		Scanner sc = new Scanner(System.in);
		int altura;
		int base = 1;
		int j;
		System.out.println("Introduzca la altura de la pirámide:");
		altura = sc.nextInt();
		int espacio = altura - 1;
		while((altura > 9) || (altura < 1)){
			System.out.println("Error, la altura no puede ser mayor que 9 ni menor que 1");
			altura = sc.nextInt();
		}
		sc.close();
		while(base <= altura) {
			for(int i = 1; i <= espacio; i++) {
				System.out.print(" ");
			}
			for(j = 1; j < base; j++) {
				System.out.print(j);
			}
			for(;j > 0; j--){
				System.out.print(j);
			}
			System.out.println("");
			base++;
			espacio--;
		}
	}
}