import java.util.Scanner;

public class Ejercicio7_1 {

	public static void main(String[] args) {
		new Ejercicio7_1().contenido();
		//Programa que pida dos números y muestre el mayor de ellos

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduzca dos números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > num2) {
			
			System.out.println(num1 +" es mayor");
			
		}else if(num2 > num1) {
			
			System.out.println(num2 +" es mayor");
			
		}else {
			
			System.out.println("Ha habido un error, por favor empiece de nuevo");
			
		}
		
	}
	
}