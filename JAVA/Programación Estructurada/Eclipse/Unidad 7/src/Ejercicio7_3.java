import java.util.Scanner;

public class Ejercicio7_3 {

	public static void main(String[] args) {
		new Ejercicio7_3().contenido();
		//Programa que dice si un número introducido es divisible entre 7

	}

	public void contenido(){
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		sc.close();
		
		if(num % 7 == 0) {
			
			System.out.println(num +" es divisible entre 7");
			
		}else {
			
			int resto = num % 7;
			
			System.out.println(num +" no es divisible entre 7 (Resto = "+ resto +")");
			
		}

	}
	
}