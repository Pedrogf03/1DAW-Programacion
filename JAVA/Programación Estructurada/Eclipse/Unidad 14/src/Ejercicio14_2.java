import java.util.Scanner;
public class Ejercicio14_2 {

	public static void main(String[] args) {
		new Ejercicio14_2().contenido();
		//Convierte en función el ejercicio 8.4

	}

	public void contenido() {

		Scanner sc = new Scanner (System.in);

		System.out.print("a = ");
		int a = sc.nextInt();	
		System.out.print("b = ");
		int b = sc.nextInt();		
		System.out.print("c = ");
		int c = sc.nextInt();

		sc.close();

		if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			double potencia = Math.pow(b, 2) - 4 * a * c;
			double mult = 2 * a;
			System.out.println("("+ b * (-1) +" ± √"+ potencia +") / ("+ mult +")");
		} else {
			System.out.println("Resultado 1: "+ x1(a, b, c));
			System.out.println("Resultado 2: "+ x2(a, b, c));
		}

	}

	static public double x1(int a, int b, int c) {

		double x1 = (b * (-1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return x1;

	}

	static public double x2(int a, int b, int c) {

		double x2 = (b * (-1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return x2;

	}
}
