import java.util.Scanner;

public class Ejercicio6_1 {

	public static void main(String[] args) {
		new Ejercicio6_1().contenido();
		//Programa que pide dos números y muestra el resultado de su multiplicación

	}
	
	public void contenido(){
		
		 Scanner sc = new Scanner(System.in);
		 
		 int num1;
		 int num2;
		 
		 System.out.println("Inserte el primer número:");
		 num1 = sc.nextInt();
		 
		 System.out.println("Inserte el segundo número:");
		 num2 = sc.nextInt();
		 
		 int resultado = num1 * num2;
		 
		 System.out.println("El resultado es " + resultado);
		 
		 sc.close();
		
	}
}