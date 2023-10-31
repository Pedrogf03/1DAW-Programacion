import java.util.Scanner;

public class Ejercicio7_2 {

	public static void main(String[] args) {
		new Ejercicio7_2().contenido();
		//Programa que pida tres números y muestre el mayor

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduzca tres números;");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
		
		if((num1 > num2) && (num1 > num3)) {
			
			System.out.println(num1 +" es mayor");
			
		}else if((num2 > num1) && (num2 > num3)){
			
			System.out.println(num2 +" es mayor");
			
		}else if((num3 > num1) && (num3 > num2)) {
			
			System.out.println(num3 +" es mayor");
			
		}else if((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			
			System.out.println("Todos son iguales");
			
		}else if ((num1 == num2) || (num2 == num3)) {
			
			System.out.println("Los números mayores son iguales");
			
		}
	}
	
}