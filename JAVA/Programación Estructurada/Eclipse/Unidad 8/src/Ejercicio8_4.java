import java.util.Scanner;

public class Ejercicio8_4 {

	public static void main(String[] args) {
		new Ejercicio8_4().contenido();
		//Programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("a =");
		a = sc.nextInt();	
		System.out.println("b =");
		b = sc.nextInt();		
		System.out.println("c =");
		c = sc.nextInt();
		
		sc.close();
		
		double x1 = (b * (-1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (b * (-1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		if((Math.pow(b, 2) - 4 * a * c) < 0){
			
			double potencia = Math.pow(b, 2) - 4 * a * c;
			double mult = 2 * a;
			
			System.out.println("("+ b * (-1) +" ± √"+ potencia +") / ("+ mult +")");
			
		}else if((Math.pow(b, 2) - 4 * a * c) > 0) {
			
			System.out.println("X = "+ x1 +" y "+ x2);
			
		}
		
	}
	
}