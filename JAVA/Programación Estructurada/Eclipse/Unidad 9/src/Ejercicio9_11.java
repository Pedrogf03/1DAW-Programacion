import java.util.Scanner;
public class Ejercicio9_11 {

	public static void main(String[] args) {
		new Ejercicio9_11().contenido();
		//Programa que lee una lista de diez números y determina cuántos son positivos, y cuántos son negativos

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int neg = 0;
		int pos = 0;
		int cero = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Escribe un número");
			num = sc.nextInt();
			if(num < 0) {
				neg += 1;
			}else if(num > 0) {
				pos += 1;
			}else if(num == 0) {
				cero += 1;
			}
		}
		sc.close();
		System.out.println("Hay "+ pos +" positivos "+ neg +" negativos y "+ cero +" ceros");
	}
}